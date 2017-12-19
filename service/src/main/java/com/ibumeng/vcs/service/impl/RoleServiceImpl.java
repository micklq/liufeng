package com.ibumeng.vcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;






import com.ibumeng.vcs.data.mapper.RoleDAO;
import com.ibumeng.vcs.data.repository.*;
import com.ibumeng.vcs.model.entity.Role;
import com.ibumeng.vcs.service.RoleService;

@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Role, Long> implements RoleService{

	@Resource( name = "roleRepository")
	RoleRepository roleRepository;
		
	@Autowired
	RoleDAO RoleDAO;
	
	@Resource(name = "roleRepository")
	@Override
	public void setBaseRepository(BaseRepository<Role, Long> baseRepository) {
		super.setBaseRepository(baseRepository);
	}

	
	

}
