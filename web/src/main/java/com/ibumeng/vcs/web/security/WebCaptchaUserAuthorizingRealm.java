package com.ibumeng.vcs.web.security;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ibumeng.vcs.model.entity.*;
import com.ibumeng.vcs.service.*;
import com.ibumeng.vcs.webcomn.security.AuthService;
import com.ibumeng.vcs.webcomn.security.CaptchaAuthenticationToken;
import com.ibumeng.vcs.webcomn.security.IncorrectCaptchaException;
import com.ibumeng.vcs.webcomn.security.Principal;
import com.ibumeng.vcs.base.Constants;


/**
 * 基于口令和验证码的Realm<br/>
 * 根据username在数据库中取出User信息<br/>
 * 根据User信息取出Role信息<br/>
 * 根据Role信息取出Permission信息<br/>
 */
public class WebCaptchaUserAuthorizingRealm extends AuthorizingRealm {

    @Resource(name = "authService")
    private AuthService authService;


    private boolean validateCaptcha(String captcha) {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        if (attr == null) {
            return false;
        }
        HttpSession session = attr.getRequest().getSession(false);
        if (session == null) {
            return false;
        }
        String rcaptcha = (String) session.getAttribute(Constants.CAPTCHA_SESSION_KEY);
        if (rcaptcha == null) {
            return false;
        }
        if (StringUtils.equals(rcaptcha, captcha)) {
            return true;
        }
        return false;
    }

    /**
     * 进行认证，获取认证信息
     *
     * @param token the token
     * @return the authentication info
     */
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken token) {
        CaptchaAuthenticationToken localAuthenticationToken = (CaptchaAuthenticationToken) token;
        String username = localAuthenticationToken.getUsername();
        String password = new String(localAuthenticationToken.getPassword());
        String captcha = localAuthenticationToken.getCaptcha();
        String host = localAuthenticationToken.getHost();

        if (!validateCaptcha(captcha)) {
            throw new IncorrectCaptchaException("captcha");
        }
        if ((username != null) && (password != null)) {
        	UserPassport passport =  authService.findUserPassportByUsername(username);
            if (passport == null) {
                throw new UnknownAccountException();
            }
            if (passport.getPassportStatus()==1) {
                throw new DisabledAccountException();
            }
//
//            if (ruser.getIsLocked().booleanValue()) { //锁定账户
//
//                // 对全局配置进行检查, 是否存在全局的账号锁定策略
//                int accountLockTime = 30; //锁定30分钟
//                Date lockedDateTmp = ruser.getLockedDate();
//                Date lockedDate = DateUtils.addMinutes(lockedDateTmp,
//                        accountLockTime);
//                if (new Date().after(lockedDate)) {
//                    ruser.setLoginFailureCount(0);
//                    ruser.setIsLocked(false);
//                    ruser.setLockedDate(null);
//                    ruserService.update(ruser);
//                } else {
//                    throw new LockedAccountException();
//                }
//            }

//            if (!DigestUtils.md5Hex(password).equals(ruser.getPassword())) { // 验证密码,5次锁死
//                Integer loginFailureCount = ruser.getLoginFailureCount() + 1;
//                if (loginFailureCount >= 5) {
//                    ruser.setIsLocked(true);
//                    ruser.setLockedDate(new Date());
//                }
//                ruser.setLoginFailureCount(loginFailureCount);
//                ruserService.update(ruser);
//                throw new IncorrectCredentialsException("password");
//            }
//            ruser.setLoginIp(host);
//            rus er.setLoginDate(new Date());
//            ruser.setLoginFailureCount(0);
//               ruserService.update(ruser); 
            return new SimpleAuthenticationInfo(new Principal(passport.getPassportId(),passport.getRoleId(),username), password, getName());
        }
        throw new UnknownAccountException();
    }

    /**
     * 进行授权，获取授权信息
     *
     * @param principals the principals
     * @return the authorization info
     */
    protected AuthorizationInfo doGetAuthorizationInfo( PrincipalCollection principals) {
        Principal principal = (Principal) principals.fromRealm(getName()).iterator().next();
        if (principal != null) {
            List<RolePermission> authorities = authService.findPermissionByRoleId(principal.getRoleid());
            if (authorities != null && authorities.size()>0) {
                SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
                Set<String> sets = new HashSet<String>();
                for(RolePermission o : authorities){
                	
                	sets.add(String.format("p%s-a%s",o.getPermissionId(),o.getActionValue()));
                }
                simpleAuthorizationInfo.addStringPermissions(sets);
                return simpleAuthorizationInfo;
            }
        }
        return null;
    }
}
