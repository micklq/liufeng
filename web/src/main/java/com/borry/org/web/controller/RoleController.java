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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.borry.org.base.util.Util;
import com.borry.org.model.Filter;
import com.borry.org.model.entity.Permission;
import com.borry.org.model.entity.Role;
import com.borry.org.model.entity.RolePermission;
import com.borry.org.model.entity.UserPassport;
import com.borry.org.model.entity.view.UserPassportView;
import com.borry.org.service.BaseService;
import com.borry.org.service.PermissionService;
import com.borry.org.service.RolePermissionService;
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
	
	@Autowired
	private PermissionService permissionService;
	
	
	@Autowired
	private RolePermissionService rolePermissionService;
	
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
		
		List<Permission> list = permissionService.findAll();
		model.put("list", list);
		
		List<Filter> filters = new ArrayList<Filter>();
		filters.add(Filter.eq("parentId", 0));
		Sort sort = new Sort(Direction.ASC,"id");	
		List<RolePermission> rlist = rolePermissionService.findAll(0,100,filters,sort);			
		model.put("rlist", rlist);
		
		return "role/detail";
	}
	
	@RequestMapping( value = "updateAction", method= RequestMethod.POST)
	@ResponseBody
	public RespBody updateAction(Role entity){
		
		   String[] permissionValues = request.getParameter("PermissionValue").split(","); 
		    entity.setCreatorId(U.getUid());	
			if(entity.getId() == null || entity.getId() == 0 ){										
			  roleService.save(entity); //add								
			}
			else{				
				roleService.update(entity);	//update													
			}
			   //添加权限	        
	                if (permissionValues.length > 0)
	                {
	                	rolePermissionService.deleteByRoleId(entity.getRoleId());
	                    for(String o : permissionValues)
	                    {
	                        String[] oo = o.split("-"); 
	                        if (oo.length == 3)
	                        {
	                           RolePermission rolePermission = new RolePermission();
	                           rolePermission.setRoleId(entity.getRoleId());
	                           rolePermission.setParentPermissionId(Util.toLong(oo[0]));
	                           rolePermission.setPermissionId(Util.toLong(oo[1]));
	                           rolePermission.setActionValue(Util.toInt(oo[2]));
	                           rolePermissionService.save(rolePermission);	                            
	                        }
	                    }
	                } 
			return respBodyWriter.toSuccess();
		}
}
