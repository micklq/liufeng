package com.borry.org.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 案件受理
 * @author mick
 *
 */
@Controller
@RequestMapping("anjian")
public class AnJianController {
	
	private static final Logger logger = LoggerFactory.getLogger(AnJianController.class);
	
	@RequestMapping("index")
	public String index(){		
		return "anjian/index";
	}
}
