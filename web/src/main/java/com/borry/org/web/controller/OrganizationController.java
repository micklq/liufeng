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
	
		 
		 int dataCount = (int)organizationService.count();
			int dataPage = (int) (dataCount/15);
			if(dataCount%15==0){
				dataPage= dataPage-1; //分页整除 减一 以下再加一
			}
			int pageCount = dataPage+1;		
			if(page<=0)
			{
				page = 1;
			}	
			if(page>=pageCount){
				page=pageCount;
			}
			int prePage=((page-1)>0)?(page-1):1;
			int nextPage=((page+1)>pageCount)?pageCount:(page+1);
			 List<Filter> filters = new ArrayList<Filter>();
			 Sort sort = new Sort(Direction.DESC,"id");
			 Page<Organization> plist = this.findWithPage(page,size,filters,sort);
			 List<Organization> rlist = new ArrayList<Organization>();
			 if(plist!=null&& plist.getSize()>0)
		     {        	
		       	 rlist = plist.getContent();
		     } 
			model.addAllAttributes(rlist);        
	        model.addAttribute("prePage", prePage);
	        model.addAttribute("nextPage", nextPage);
	        model.addAttribute("currentPage", page);	
	        model.addAttribute("pageCount", pageCount);	
	        model.addAttribute("dataCount", dataCount);	
	        for(Organization o : rlist){
	        	
	        if(Util.isNullOrEmpty(o.getAddress())){        		
	        	o.setAddress("无");
	        }
	    }
		model.put("list", rlist);
			
		 
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
