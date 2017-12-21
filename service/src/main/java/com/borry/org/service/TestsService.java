package com.borry.org.service;

import java.util.List;

import com.borry.org.model.entity.Tests;


public interface TestsService extends BaseService<Tests, Long> 
{
	
	public List<Tests> findAllByMapper();
	
	public List<Tests> queryAll();
	
	public List<Tests> queryAllByMapper();
}
