package com.borry.org.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.borry.org.model.entity.Organization;
import com.borry.org.model.entity.Permission;
import com.borry.org.model.entity.Role;
import com.borry.org.model.entity.UserPassport;
import com.borry.org.service.BaseService;
import com.borry.org.service.OrganizationService;
import com.borry.org.service.PermissionService;
import com.borry.org.service.RoleService;
import com.borry.org.webcomn.controller.CRUDController;

/**
 * 菜单暂时是写死的
 * @author meizhiwen
 *
 */
@Controller
@RequestMapping("organization")
public class OrganizationController extends CRUDController<Organization, Long> {
	
	private static final Logger logger = LoggerFactory.getLogger(OrganizationController.class);
	
	@Autowired
	private OrganizationService organizationService;
	
	@Resource(name = "organizationService")
	@Override
	public void setBaseService(BaseService<Organization, Long> baseService) {
		this.baseService = baseService;		
	}
	
	@RequestMapping("index")
	public String index(ModelMap model){	
		
		 List<Organization> list = this.findWithAll();
		 model.put("list", list);
		 
		return "organization/index";
	}
	
	@RequestMapping("detail")
	public String detail(@RequestParam(value="id", required=false, defaultValue="0") Long id,ModelMap model){		
		
		Organization organization = new Organization();
		if( id>0) {
			organization = organizationService.queryById(id);				
		}
		model.put("organization",organization);
		
		return "organization/detail";
	}
}
