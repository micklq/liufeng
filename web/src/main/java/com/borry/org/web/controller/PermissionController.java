package com.borry.org.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 菜单暂时是写死的
 * @author meizhiwen
 *
 */
@Controller
@RequestMapping("permission")
public class PermissionController {
	
	private static final Logger logger = LoggerFactory.getLogger(PermissionController.class);
	
	@RequestMapping("list")
	public String list(){		
		return "permission/list";
	}
}
