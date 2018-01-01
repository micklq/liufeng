package com.borry.org.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.borry.org.base.util.Util;
import com.borry.org.model.Filter;
import com.borry.org.model.entity.Department;
import com.borry.org.model.entity.Organization;
import com.borry.org.model.entity.Permission;
import com.borry.org.model.entity.Role;
import com.borry.org.model.entity.RolePermission;
import com.borry.org.model.entity.UserPassport;
import com.borry.org.service.BaseService;
import com.borry.org.service.DepartmentService;
import com.borry.org.service.PermissionService;
import com.borry.org.service.RoleService;
import com.borry.org.webcomn.controller.CRUDController;

/**
 * 菜单暂时是写死的
 * @author meizhiwen
 *
 */
@Controller
@RequestMapping("department")
public class DepartmentController extends CRUDController<Department, Long> {
	
	private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService departmentService;
	
	@Resource(name = "departmentService")
	@Override
	public void setBaseService(BaseService<Department, Long> baseService) {
		this.baseService = baseService;		
	}
	
	@RequestMapping("index")
	public String index(@RequestParam(value="orgid", required=false, defaultValue="0") Long orgid,ModelMap model){	
		
		 if(orgid==null || orgid<=0){
		    	model.addAttribute("error","参数错误");
				return "shared/error";
		  } 
		  List<Filter> filters = new ArrayList<Filter>();		
		  filters.add(Filter.eq("organizationId", orgid));
		  Sort sort = new Sort(Direction.ASC,"sort");	
		  List<Department> rlist = departmentService.findAll(0,1000,filters,sort);			
		  model.put("departmentList", rlist);
		  
		return "department/index";
	}
	
	@RequestMapping("detail")
	public String detail(@RequestParam(value="id", required=false, defaultValue="0") Long id,ModelMap model){		
		
		Department department = new Department();
		if( id>0) {
			department = departmentService.queryById(id);				
		}
		model.put("department",department);
		
		return "department/detail";
	}
}
