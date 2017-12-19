package com.ibumeng.vcs.webcomn.security;

import org.apache.shiro.subject.Subject;
import org.springframework.cache.annotation.Cacheable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ibumeng.vcs.model.entity.*;


/**
 * Created by
 * User: djyin
 * Date: 12/19/13
 * Time: 4:05 AM
 * 提供查询用户权限列表的服务
 */
public interface AuthService {
	
	boolean isAuthenticated();
	 /**
     * Gets current.
     *
     * @return the current
     */
    //User getCurrent();

    /**
     * Gets current username.
     *
     * @return the current username
     */
     String getCurrentUsername();
    
    /**
     * Find UserPassport.
     *
     * @return the UserPassport
     */
    UserPassport findUserPassportByUsername(String username);
    
    /**
     * Find UserSecurity By PassportId.
     * @param passportId
     * @return the UserSecurity
     */
    UserSecurity findUserSecurityByPassportId(long passportId);
    
    /**
     * Find UserProfile By PassportId.
     * @param passportId
     * @return the UserProfile
     */
    UserProfile findUserProfileByPassportId(long passportId);

    /**
     * Gets User Profile.
     *
     * @return the string permission
     */
    Role findRole(Long roleid);

    /**
     * Gets string permission.
     *
     * @return the string permission
     */
    List<RolePermission> findPermissionByRoleId(Long roleid);
   

}
