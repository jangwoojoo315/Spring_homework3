package com.devfun.test.service;

import java.util.List;

import com.devfun.vo.SampleVO;

public interface TestService {
	public List<SampleVO> selectRequestinfo() throws Exception;
}
