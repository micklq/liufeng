package com.borry.org.webcomn.security.impl;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.borry.org.model.Filter;
import com.borry.org.model.entity.*;
import com.borry.org.service.*;
import com.borry.org.webcomn.security.AuthService;
import com.borry.org.webcomn.security.Principal;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;


@Service("authService")
public class AuthServiceImpl  implements AuthService {
	    
   
	@Autowired
    private OperationLogService operationLogService;
	
	@Autowired
    private PermissionService permissionService;
	
	@Autowired
    private RoleService roleService;
	
	@Autowired
    private UserPassportService userPassportService;
	
	@Autowired
    private UserProfileService userProfileService;
	
	@Autowired
    private UserSecurityService userSecurityService;
	
	@Autowired
    private RolePermissionService rolePermissionService;
	
	

        
    @Transactional(readOnly = true)
    public boolean isAuthenticated() {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            return subject.isAuthenticated();
        }
        return false;
    }

    @Transactional(readOnly = true)
    public String getCurrentUsername() {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            Principal principal = (Principal) subject.getPrincipal();
            if (principal != null) {
                return principal.getUsername();
            }
        }
        return null;
    }

	@Override
	public UserPassport findUserPassportByUsername(String username) {
		
		List<Filter> filters = new ArrayList<Filter>();
		filters.add(Filter.eq("userName",username));
		Sort sort = new Sort(Sort.Direction.DESC, "passportId");
		List<UserPassport>	list = userPassportService.findAll(0, 2,filters,sort);
		if(list!=null&& list.size()==1)
		{
			return list.get(0);			
		}
		return null;
	}

	@Override
	public UserSecurity findUserSecurityByPassportId(long passportId) {
		if(passportId<=0) {return null;}
		UserSecurity obj = userSecurityService.find(passportId);
		if(obj!=null){
			return obj;			
		}
		return null;
	}

	@Override
	public UserProfile findUserProfileByPassportId(long passportId) {
		if(passportId<=0) {return null;}
		UserProfile obj = userProfileService.find(passportId);
		if(obj!=null){
			return obj;			
		}
		return null;
	}

	@Override
	public Role findRole(Long roleid) {
		if(roleid<=0) {return null;}
		Role obj = roleService.find(roleid);
		if(obj!=null){
			return obj;			
		}
		return null;	
	}

	@Override
	public List<RolePermission> findPermissionByRoleId(Long roleid) {
		if(roleid<=0) {return null;}
		List<Filter> filters = new ArrayList<Filter>();
		filters.add(Filter.eq("roleId",roleid));
		Sort sort = new Sort(Sort.Direction.ASC, "permissionId");
		List<RolePermission> list = rolePermissionService.findAll(0,1000,filters,sort);
		if(list!=null && list.size()>0){
			return list;			
		}
		return null;
	}   
    
    
   
}
