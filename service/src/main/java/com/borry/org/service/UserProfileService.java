package com.borry.org.service;

import java.util.List;

import com.borry.org.model.entity.Tests;
import com.borry.org.model.entity.UserProfile;


public interface UserProfileService extends BaseService<UserProfile, Long> 
{

	public void clearByDepartmentId(Long departId);
		
}
