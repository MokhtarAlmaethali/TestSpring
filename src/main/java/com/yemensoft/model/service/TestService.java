package com.yemensoft.model.service;

import com.yemensoft.model.mapper.TestMapper;

public class TestService {

	private TestMapper testMapper;

	public void setTestMapper(TestMapper testMapper) {
		this.testMapper = testMapper;
	}
	
	public void test(){
		testMapper.addStudent();
	}
}
