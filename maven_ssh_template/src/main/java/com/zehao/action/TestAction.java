package com.zehao.action;

import java.util.Date;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.zehao.model.Tests;
import com.zehao.service.ITestService;

@ParentPackage("basePackage")
@Action(value = "struts2Test") // 使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
@Namespace("/")
public class TestAction {

	/**
	 * 注入iTestService
	 */
	@Autowired
	private ITestService iTestService;

	public void test() {
		System.out.println("Come here for struts2 test!");
		iTestService.test();
	}
	
	public void saveUser(){
		Tests test = new Tests();
		test.setName("can");
		test.setPwd("123");
		test.setActive(true);
		test.setCreateDateTime(new Date());
		Integer id = (Integer) iTestService.save(test);
		System.out.println(id);
	}

}
