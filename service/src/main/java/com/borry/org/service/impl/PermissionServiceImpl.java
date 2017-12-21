package com.borry.org.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;









import com.borry.org.data.mapper.PermissionDAO;
import com.borry.org.data.repository.*;
import com.borry.org.model.entity.Permission;
import com.borry.org.service.PermissionService;

@Service("permissionService")
public class PermissionServiceImpl extends BaseServiceImpl<Permission, Long> implements PermissionService{

	@Resource( name = "permissionRepository")
	PermissionRepository permissionRepository;
		
	@Autowired
	PermissionDAO PermissionDAO;
	
	@Resource(name = "permissionRepository")
	@Override
	public void setBaseRepository(BaseRepository<Permission, Long> baseRepository) {
		super.setBaseRepository(baseRepository);
	}

	

}
