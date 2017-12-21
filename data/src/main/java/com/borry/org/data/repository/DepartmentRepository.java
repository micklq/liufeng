package com.borry.org.data.repository; 

import javax.annotation.Resource;

import com.borry.org.model.entity.Department;



@Resource(name = "departmentRepository")
public interface DepartmentRepository  extends BaseRepository<Department, Long>{

}

