package com.ibumeng.vcs.data.mapper;

import java.util.List;

import com.ibumeng.vcs.model.entity.Tests;


public interface TestsDAO { 
	public List<Tests> findAllByMapper();
	
	public List<Tests> queryAllByMapper();
	
	public void insertTests(Tests entity);
}
