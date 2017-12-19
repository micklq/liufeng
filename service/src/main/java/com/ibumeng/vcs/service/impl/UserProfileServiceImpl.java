package com.ibumeng.vcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;






import com.ibumeng.vcs.data.mapper.UserProfileDAO;
import com.ibumeng.vcs.data.repository.*;
import com.ibumeng.vcs.model.entity.UserProfile;
import com.ibumeng.vcs.service.UserProfileService;

@Service("userProfileService")
public class UserProfileServiceImpl extends BaseServiceImpl<UserProfile, Long> implements UserProfileService{

	@Resource( name = "userProfileRepository")
	UserProfileRepository userProfileRepository;
		
	@Autowired
	UserProfileDAO userProfileDAO;
	
	@Resource(name = "userProfileRepository")
	@Override
	public void setBaseRepository(BaseRepository<UserProfile, Long> baseRepository) {
		super.setBaseRepository(baseRepository);
	}

		
	

}
