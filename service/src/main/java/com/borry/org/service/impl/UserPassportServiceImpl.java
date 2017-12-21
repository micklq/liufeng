package com.borry.org.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;









import com.borry.org.data.mapper.UserPassportDAO;
import com.borry.org.data.repository.*;
import com.borry.org.model.entity.UserPassport;
import com.borry.org.service.UserPassportService;

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
