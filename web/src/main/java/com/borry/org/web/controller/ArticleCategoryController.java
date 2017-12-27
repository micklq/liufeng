package com.borry.org.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.borry.org.base.util.Util;
import com.borry.org.model.Filter;
import com.borry.org.model.entity.Articles;
import com.borry.org.model.entity.ArticlesCategory;
import com.borry.org.model.entity.Permission;
import com.borry.org.model.entity.Role;
import com.borry.org.model.entity.UserPassport;
import com.borry.org.service.ArticlesCategoryService;
import com.borry.org.service.ArticlesService;
import com.borry.org.service.BaseService;
import com.borry.org.service.PermissionService;
import com.borry.org.service.RoleService;
import com.borry.org.webcomn.controller.CRUDController;

/**
 * 菜单暂时是写死的
 * @author meizhiwen
 *
 */
@Controller
@RequestMapping("articleCategory")
public class ArticleCategoryController extends CRUDController<ArticlesCategory, Long> {
	
	private static final Logger logger = LoggerFactory.getLogger(ArticleCategoryController.class);
	
	@Autowired
	private ArticlesCategoryService articlesCategoryService;
	
	@Resource(name = "articlesCategoryService")
	@Override
	public void setBaseService(BaseService<ArticlesCategory, Long> baseService) {
		this.baseService = baseService;		
	}
	
	@RequestMapping("index")
	public String index(@RequestParam(value="page", required=false, defaultValue="1") Integer page,ModelMap model){	
		
		 List<ArticlesCategory> list = this.findWithAll();
		 model.put("list", list); 
		 
		return "articleCategory/index";
	}
	
	@RequestMapping("detail")
	public String detail(@RequestParam(value="id", required=false, defaultValue="0") Long id,ModelMap model){		
		
		ArticlesCategory category = new ArticlesCategory();
		if( id>0) {
			category = articlesCategoryService.queryById(id);				
		}
		model.put("category",category);
		
		return "articleCategory/detail";
	}
}
