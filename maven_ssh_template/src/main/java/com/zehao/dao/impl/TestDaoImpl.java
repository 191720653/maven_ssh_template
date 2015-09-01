package com.zehao.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zehao.dao.ITestDao;
import com.zehao.model.Tests;
@Repository("iTestDao")
public class TestDaoImpl implements ITestDao {

	/**
	 * 使用@Autowired注解将sessionFactory注入到TestDaoImpl中
	 */
	@Autowired
	private SessionFactory sessionFactory;

	public Serializable save(Tests test) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().save(test);
	}

}
