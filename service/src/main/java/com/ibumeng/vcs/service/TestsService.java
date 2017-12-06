package com.ibumeng.vcs.service;

import java.util.List;

import com.ibumeng.vcs.model.entity.Tests;


public interface TestsService extends BaseService<Tests, Long> 
{
	
	public List<Tests> findAllByMapper();
	
	public List<Tests> queryAll();
	
	public List<Tests> queryAllByMapper();
}
