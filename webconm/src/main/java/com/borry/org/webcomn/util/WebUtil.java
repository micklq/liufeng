package com.borry.org.webcomn.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import com.borry.org.model.entity.Permission;
import com.borry.org.model.entity.RolePermission;

public class WebUtil {
	
	public static List<Permission> filterPermissionList(List<Permission> list , long parentId)  
	{
		 List<Permission> result = new ArrayList<Permission>();
		 if(list!=null && list.size()>0){
			    for(Permission o :list){
			      if(o.getParentId()==parentId){result.add(o); }
			    }
		 }
		 return result;
	}
	
	public static boolean checkPermissionValue(List<RolePermission> list , long permissionId, int actionValue)  
	{
		 if(list!=null && list.size()>0)
		 {
		   for(RolePermission o :list){
			 if(o.getPermissionId()==permissionId&& o.getActionValue()==actionValue){return true;}
		   }
		 }
		 return false;
	}
	

}
