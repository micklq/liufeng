package com.ibumeng.vcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;







import com.ibumeng.vcs.data.mapper.UserSecurityDAO;
import com.ibumeng.vcs.data.repository.*;
import com.ibumeng.vcs.model.entity.UserSecurity;
import com.ibumeng.vcs.service.UserSecurityService;

@Service("userSecurityService")
public class UserSecurityServiceImpl extends BaseServiceImpl<UserSecurity, Long> implements UserSecurityService{

	@Resource( name = "userSecurityRepository")
	UserSecurityRepository userSecurityRepository;
		
	@Autowired
	UserSecurityDAO userSecurityDAO;
	
	@Resource(name = "userSecurityRepository")
	@Override
	public void setBaseRepository(BaseRepository<UserSecurity, Long> baseRepository) {
		super.setBaseRepository(baseRepository);
	}

	
	

}
