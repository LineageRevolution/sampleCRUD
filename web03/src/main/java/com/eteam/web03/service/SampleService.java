package com.eteam.web03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eteam.web03.mapper.SampleMapper;
import com.eteam.web03.vo.Sample;

@Service
public class SampleService {
	@Autowired 
	private SampleMapper sampleMapper;

	public List<Sample> getSampleList() {
		List<Sample> sampleList = sampleMapper.selectSampleList();
		return sampleList;
	}

	public Sample getSampleOne(int sampleId){
		Sample sample = sampleMapper.selectSampleOne(sampleId);
		return sample;
	}

	public int addSample(String sampleName) {
		int result = sampleMapper.addSample(sampleName);
		return result;
	}

	public int removeSample(int sampleId) {
		int result = sampleMapper.deleteSample(sampleId);
		return result;	
	}

	public int modifySample(int sampleId, String sampleName) {
		int result = sampleMapper.updateSample(sampleId, sampleName);
		return result;
	}
}