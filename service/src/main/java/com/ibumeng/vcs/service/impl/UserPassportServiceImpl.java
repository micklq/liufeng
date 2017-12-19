package com.ibumeng.vcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;






import com.ibumeng.vcs.data.mapper.UserPassportDAO;
import com.ibumeng.vcs.data.repository.*;
import com.ibumeng.vcs.model.entity.UserPassport;
import com.ibumeng.vcs.service.UserPassportService;

@Service("userPassportService")
public class UserPassportServiceImpl extends BaseServiceImpl<UserPassport, Long> implements UserPassportService{

	@Resource( name = "userPassportRepository")
	UserPassportRepository userPassportRepository;
		
	@Autowired
	UserPassportDAO UserPassportDAO;
	
	@Resource(name = "userPassportRepository")
	@Override
	public void setBaseRepository(BaseRepository<UserPassport, Long> baseRepository) {
		super.setBaseRepository(baseRepository);
	}

		
	

}
