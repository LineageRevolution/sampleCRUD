package com.eteam.web03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.eteam.web03.vo.Sample;

@Mapper
public interface SampleMapper {
	int addSample(String sampleName);
	
	List<Sample> selectSampleList();
	
	int deleteSample(int sampleId);
	
	Sample selectSampleOne(int sampleId);
	
	int updateSample(int sampleId, String sampleName);
}
