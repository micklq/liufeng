package com.ibumeng.vcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;






import com.ibumeng.vcs.data.mapper.RolePermissionDAO;
import com.ibumeng.vcs.data.repository.*;
import com.ibumeng.vcs.model.entity.RolePermission;
import com.ibumeng.vcs.service.RolePermissionService;

@Service("rolePermissionService")
public class RolePermissionServiceImpl extends BaseServiceImpl<RolePermission, Long> implements RolePermissionService{

	@Resource( name = "rolePermissionRepository")
	RolePermissionRepository rolePermissionRepository;
		
	@Autowired
	RolePermissionDAO rolePermissionDAO;
	
	@Resource(name = "rolePermissionRepository")
	@Override
	public void setBaseRepository(BaseRepository<RolePermission, Long> baseRepository) {
		super.setBaseRepository(baseRepository);
	}

	

}
