package com.zehao.service;

import java.io.Serializable;

import com.zehao.model.Tests;

public interface ITestService {
	
	public void test();
	
	public Serializable save(Tests test);

}
