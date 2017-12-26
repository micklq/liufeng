package com.borry.org.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.borry.org.model.entity.UserPassport;
import com.borry.org.service.BaseService;
import com.borry.org.webcomn.controller.CRUDController;

/**
 * 菜单暂时是写死的
 * @author meizhiwen
 *
 */
@Controller
@RequestMapping("admin")
public class AdminController extends CRUDController<UserPassport, Long> {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Override
	public void setBaseService(BaseService<UserPassport, Long> baseService) {
		this.baseService = baseService;		
	}
	
	@RequestMapping("index")
	public String index(){		
		return "admin/index";
	}

	
}
