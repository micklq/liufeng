package com.borry.org.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import com.borry.org.data.repository.BaseRepository;
import com.borry.org.model.entity.Department;
import com.borry.org.data.mapper.DepartmentDAO;
import com.borry.org.data.repository.DepartmentRepository;
import com.borry.org.service.DepartmentService;

  
@Service("departmentService")
public class DepartmentServiceImpl extends BaseServiceImpl<Department, Long> implements DepartmentService {

	@Resource(name = "departmentRepository")
	private DepartmentRepository departmentRepository;

	@Autowired
	private DepartmentDAO departmentDAO;

	@Resource(name = "departmentRepository")
	@Override
	public void setBaseRepository(BaseRepository<Department, Long> baseRepository){

		   super.setBaseRepository(baseRepository);
    }



}

