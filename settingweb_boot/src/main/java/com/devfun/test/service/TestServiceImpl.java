package com.devfun.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfun.test.mapper.TestMapper;
import com.devfun.vo.SampleVO;

@Service
public class TestServiceImpl {
	@Autowired
	public TestMapper mapper;
	public List<SampleVO> selectRequestinfo(){
		return mapper.selectRequestinfo();
	}
}
