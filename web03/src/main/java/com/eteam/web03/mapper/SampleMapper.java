package com.eteam.web03.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.eteam.web03.vo.Sample;

@Mapper
public interface SampleMapper {
	int addSample(Sample sampleName);
}
