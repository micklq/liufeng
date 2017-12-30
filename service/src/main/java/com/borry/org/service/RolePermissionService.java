package com.borry.org.service;

import java.util.List;

import com.borry.org.model.entity.Permission;
import com.borry.org.model.entity.RolePermission;


public interface RolePermissionService extends BaseService<RolePermission, Long> 
{
	public void deleteByPermissionId(long permissionId);
	
	public void deleteByRoleId(long roleId);
}
