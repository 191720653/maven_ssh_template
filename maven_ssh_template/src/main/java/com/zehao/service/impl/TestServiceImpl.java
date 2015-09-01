package com.zehao.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zehao.dao.ITestDao;
import com.zehao.model.Tests;
import com.zehao.service.ITestService;

@Service("iTestService")
public class TestServiceImpl implements ITestService {

	@Autowired
	private ITestDao iTestDao;

	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Here Test Service Success!");
	}

	public Serializable save(Tests test) {
		// TODO Auto-generated method stub
		return iTestDao.save(test);
	}

}
