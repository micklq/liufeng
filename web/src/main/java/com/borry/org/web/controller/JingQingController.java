package com.borry.org.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 帮扶对象
 * @author mick
 *
 */
@Controller
@RequestMapping("jingqing")
public class JingQingController {
	
	private static final Logger logger = LoggerFactory.getLogger(JingQingController.class);
	
	@RequestMapping("index")
	public String index(){		
		return "jingqing/index";
	}
}
