package com.borry.org.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.borry.org.model.entity.Permission;
import com.borry.org.model.entity.Role;
import com.borry.org.model.entity.UserPassport;
import com.borry.org.model.entity.view.UserPassportView;
import com.borry.org.service.BaseService;
import com.borry.org.service.PermissionService;
import com.borry.org.service.RoleService;
import com.borry.org.webcomn.MethodResult;
import com.borry.org.webcomn.RespBody;
import com.borry.org.webcomn.U;
import com.borry.org.webcomn.controller.CRUDController;
import com.borry.org.webcomn.util.ClassHelper;

/**
 * 菜单暂时是写死的
 * @author meizhiwen
 *
 */
@Controller
@RequestMapping("role")
public class RoleController extends CRUDController<Role, Long> {
	
	private static final Logger logger = LoggerFactory.getLogger(RoleController.class);
	
	@Autowired
	private RoleService roleService;
	
	@Resource(name = "roleService")
	@Override
	public void setBaseService(BaseService<Role, Long> baseService) {
		this.baseService = baseService;		
	}
	
	@RequestMapping("index")
	public String index(ModelMap model){	
		
		 List<Role> list = this.findWithAll();
		 model.put("list", list);
		 
		return "role/index";
	}
	
	@RequestMapping("detail")
	public String detail(@RequestParam(value="id", required=false, defaultValue="0") Long id,ModelMap model){		
		
		Role role = new Role();
		if( id>0) {
			role = roleService.queryById(id);				
		}
		model.put("role",role);
		
		return "role/detail";
	}
	
	@RequestMapping( value = "updateAction", method= RequestMethod.POST)
	@ResponseBody
	public RespBody updateAction(Role entity){
		
		     entity.setCreatorId(U.getUid());	
			if(entity.getId() == null || entity.getId() == 0 ){										
			  roleService.save(entity); //add								
			}
			else{				
				roleService.update(entity);	//update													
			}
			return respBodyWriter.toSuccess();
		}
}
