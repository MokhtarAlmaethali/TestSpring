package com.yemensoft.controller;

import com.yemensoft.model.service.TestService;

public class TestController {

	private TestService testService;

	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	
	public void test(){
		testService.test();
	}
}
