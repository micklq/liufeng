package com.ibumeng.vcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;






import com.ibumeng.vcs.data.mapper.PermissionDAO;
import com.ibumeng.vcs.data.repository.*;
import com.ibumeng.vcs.model.entity.Permission;
import com.ibumeng.vcs.service.PermissionService;

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
