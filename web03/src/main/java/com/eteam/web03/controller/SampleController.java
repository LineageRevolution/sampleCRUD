package com.eteam.web03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eteam.web03.service.SampleService;
import com.eteam.web03.vo.Sample;

@Controller
public class SampleController {
	@Autowired 
	private SampleService sampleService;
	// 1. 입력폼
	@GetMapping("/addSample")
	public String addSample() {
		return "addSample";	//view 이름은 template폴더의 addSample.html 포워드
	}
	// 2. 입력 액션
	@PostMapping("/addSample")
	public String addSample(@RequestParam(value="sampleName") String sampleName) {
		System.out.println(sampleName+"<--이름");
		int result = sampleService.addSample(sampleName); 
		return "redirect:/sampleList";	//리다이렉트
	}
	// 3. 목록
	@GetMapping("/sampleList")
	public String sampleList(Model model) {
		List<Sample> sampleList = sampleService.getSampleList();
		model.addAttribute("list", sampleList);
		return "sampleList";
	}
	// 4. 삭제 액션
	@GetMapping("/sampleDelete")
	public String smapleDelete(@RequestParam(value="sampleId") int sampleId) {
		int result = sampleService.removeSample(sampleId);
		return "redirect:/sampleList";
	}
	// 5. 수정 폼
	@GetMapping("/modifySample")
	public String modifySample(@RequestParam(value="sampleId") int sampleId, Model model) {
		Sample sample = sampleService.getSampleOne(sampleId);
		model.addAttribute("sample",sample);
		return "modifySample";
	}
	// 6. 수정 액션
	@PostMapping("/modifySample")
	public String modifySample(@RequestParam(value="sampleId") int sampleId, @RequestParam(value="sampleName") String sampleName) {
		int result = sampleService.modifySample(sampleId, sampleName);
		return "redirect:/sampleList";
	}
}