package com.ibumeng.vcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;






import com.ibumeng.vcs.data.mapper.PermissionActionDAO;
import com.ibumeng.vcs.data.repository.*;
import com.ibumeng.vcs.model.entity.PermissionAction;
import com.ibumeng.vcs.service.PermissionActionService;

@Service("permissionActionService")
public class PermissionActionServiceImpl extends BaseServiceImpl<PermissionAction, Long> implements PermissionActionService{

	@Resource( name = "permissionActionRepository")
	PermissionActionRepository permissionActionRepository;
		
	@Autowired
	PermissionActionDAO PermissionActionDAO;
	
	@Resource(name = "permissionActionRepository")
	@Override
	public void setBaseRepository(BaseRepository<PermissionAction, Long> baseRepository) {
		super.setBaseRepository(baseRepository);
	}

	
	

}
