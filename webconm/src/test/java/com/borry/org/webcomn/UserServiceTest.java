package com.borry.org.webcomn;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.borry.org.model.entity.Permission;
import com.borry.org.model.entity.Role;
import com.borry.org.model.entity.RolePermission;
import com.borry.org.model.entity.Tests;
import com.borry.org.model.entity.UserPassport;
import com.borry.org.model.entity.view.UserPassportView;
import com.borry.org.model.enums.Gender;
import com.borry.org.model.enums.PermissionAction;
import com.borry.org.service.PermissionService;
import com.borry.org.service.RolePermissionService;
import com.borry.org.service.RoleService;
import com.borry.org.service.TestsService;
import com.borry.org.service.UserPassportService;
import com.borry.org.service.UserProfileService;
import com.borry.org.service.UserSecurityService;
import com.borry.org.webcomn.security.MemberShipService;


public class UserServiceTest extends BaseTest {
		
		
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
	
	@Autowired
	public TestsService testsService;
	
	@Autowired
    private MemberShipService memberShipService;
	
	
//	@Test
//	public void findAllTest() 
//	{		
//		List<Tests> tlist1 = testsService.queryAll();		
//		if(tlist1!=null && tlist1.size()>0 ){				
//			for(Tests o :tlist1){
//				
//				System.out.println("queryAlltestsMasterService==="+o.getId()+">>"+o.getName().toString());	
//			}
//		}		
//	}
	
//	@Test
//	public void createRolePermission() 
//	{
//		Role role = new Role();
//		role.setName("系统管理员");
//		role.setDescription("系统管理员");	
//		roleService.save(role);
//		System.out.println("Created Role=====>>>>>"+role.getRoleId()+ "==>>"+ role.getName());			
//		
//		Permission permission = new Permission();
//		permission.setName("管理员管理");
//		permission.setDescription("管理员管理");
//		permission.setSort(1);
//		permissionService.save(permission);
//		System.out.println("Created Permission=====>>>>>"+permission.getPermissionId() + "==>>"+ permission.getName());		
//		
//		RolePermission rolePermission = new RolePermission();
//		rolePermission.setActionValue(PermissionAction.All.getValue());
//		rolePermission.setRoleId(role.getRoleId());
//		rolePermission.setPermissionId(permission.getPermissionId());
//		rolePermissionService.save(rolePermission);
//		System.out.println("Created RolePermission=====>>>>>"+rolePermission.getId());			
//		
//		long parentId = permission.getPermissionId();
//		permission.setName("角色管理");
//		permission.setDescription("角色管理");	
//		permission.setParentId(parentId);	
//		permission.setPermissionId(0L);
//		permission.setSort(2);
//		permissionService.save(permission);
//		System.out.println("Created Permission=====>>>>>"+permission.getPermissionId() + "==>>"+ permission.getName());	
//		rolePermission.setPermissionId(permission.getPermissionId());
//		rolePermissionService.save(rolePermission);
//		System.out.println("Created RolePermission=====>>>>>"+rolePermission.getId());
//		
//				
//		permission.setName("权限管理");
//		permission.setDescription("权限管理");	
//		permission.setParentId(parentId);
//		permission.setPermissionId(0L);
//		permission.setSort(3);
//		permissionService.save(permission);
//		System.out.println("Created Permission=====>>>>>"+permission.getPermissionId() + "==>>"+ permission.getName());	
//		rolePermission.setPermissionId(permission.getPermissionId());
//		rolePermissionService.save(rolePermission);
//		System.out.println("Created RolePermission=====>>>>>"+rolePermission.getId());
//		
//		permission.setName("管理员列表");
//		permission.setDescription("管理员列表");	
//		permission.setParentId(parentId);	
//		permission.setPermissionId(0L);
//		permission.setSort(4);
//		permissionService.save(permission);
//		System.out.println("Created Permission=====>>>>>"+permission.getPermissionId() + "==>>"+ permission.getName());	
//		rolePermission.setPermissionId(permission.getPermissionId());
//		rolePermissionService.save(rolePermission);
//		System.out.println("Created RolePermission=====>>>>>"+rolePermission.getId());	
//		
//	}	
//	@Test
//	public void createAdminUser() 
//	{
//	
////		MethodResult<UserPassport>  signupResult= memberShipService.signUp("13683205265", 1, "123456");
////		System.out.println("Created Role=====>>>>>"+signupResult.isSuccess()+ "==>>"+ signupResult.getMessage());
//		UserPassportView user = new UserPassportView();
//		user.setRoleId(1);
//		user.setMobile("15110089625");
//		user.setUserName("admin");
//		user.setPassword("123456");
//		user.setGender(Gender.Male.getValue());
//		MethodResult<UserPassport>  member= memberShipService.addMember(user);
//		System.out.println("Created Role=====>>>>>"+member.isSuccess()+ "==>>"+ member.getMessage());	
//		
//	}
}
