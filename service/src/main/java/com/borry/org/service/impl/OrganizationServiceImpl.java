package com.borry.org.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import com.borry.org.data.repository.BaseRepository;
import com.borry.org.model.entity.Organization;
import com.borry.org.data.mapper.OrganizationDAO;
import com.borry.org.data.repository.OrganizationRepository;
import com.borry.org.service.OrganizationService;

  
@Service("organizationService")
public class OrganizationServiceImpl extends BaseServiceImpl<Organization, Long> implements OrganizationService {

	@Resource(name = "organizationRepository")
	private OrganizationRepository organizationRepository;

	@Autowired
	private OrganizationDAO organizationDAO;

	@Resource(name = "organizationRepository")
	@Override
	public void setBaseRepository(BaseRepository<Organization, Long> baseRepository){

		   super.setBaseRepository(baseRepository);
    }



}

