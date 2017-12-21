package com.borry.org.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;










import com.borry.org.data.mapper.UserSecurityDAO;
import com.borry.org.data.repository.*;
import com.borry.org.model.entity.UserSecurity;
import com.borry.org.service.UserSecurityService;

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
