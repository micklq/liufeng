package com.borry.org.data.repository; 

import javax.annotation.Resource;

import com.borry.org.model.entity.Organization;




@Resource(name = "organizationRepository")
public interface OrganizationRepository  extends BaseRepository<Organization, Long>{

}

