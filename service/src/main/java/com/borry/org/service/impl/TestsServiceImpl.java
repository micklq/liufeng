package com.borry.org.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;









import com.borry.org.data.mapper.TestsDAO;
import com.borry.org.data.repository.*;
import com.borry.org.model.entity.Tests;
import com.borry.org.service.TestsService;

@Service("testsService")
public class TestsServiceImpl extends BaseServiceImpl<Tests, Long> implements TestsService{

	@Resource( name = "testsRepository")
	TestsRepository testsRepository;
		
	@Autowired
	TestsDAO testsMapper;
	
	@Resource(name = "testsRepository")
	@Override
	public void setBaseRepository(BaseRepository<Tests, Long> baseRepository) {
		super.setBaseRepository(baseRepository);
	}

	@Override
	public List<Tests> findAllByMapper() {
		// TODO Auto-generated method stub
		return testsMapper.findAllByMapper();	
	}

	@Override
	public List<Tests> queryAll() {
		// TODO Auto-generated method stub
		return testsRepository.queryAll();
	}

	@Override
	public List<Tests> queryAllByMapper() {
		// TODO Auto-generated method stub
		return testsMapper.queryAllByMapper();	
	}	
	

}
