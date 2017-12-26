package com.borry.org.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.borry.org.model.entity.Permission;
import com.borry.org.model.entity.UserPassport;
import com.borry.org.service.BaseService;
import com.borry.org.webcomn.controller.CRUDController;

/**
 * 菜单暂时是写死的
 * @author meizhiwen
 *
 */
@Controller
@RequestMapping("permission")
public class PermissionController extends CRUDController<Permission, Long> {
	
	private static final Logger logger = LoggerFactory.getLogger(PermissionController.class);
	
	@Override
	public void setBaseService(BaseService<Permission, Long> baseService) {
		this.baseService = baseService;		
	}
	
	@RequestMapping("index")
	public String index(){		
		return "permission/index";
	}
}
