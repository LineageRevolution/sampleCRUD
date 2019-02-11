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
		return null;
	}

	public List<Sample> getSampleOne() {
		return null;
	}

	public int addSample(Sample sampleName) {
		int result = sampleMapper.addSample(sampleName);
		return 0;
	}

	public int removeSample(Sample sample) {
		return 0;
	}

	public int modifySample(Sample sample) {
		return 0;
	}
}