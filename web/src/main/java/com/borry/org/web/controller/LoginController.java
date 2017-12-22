package com.borry.org.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.borry.org.base.Constants;
import com.borry.org.webcomn.U;
import com.borry.org.webcomn.security.CaptchaAuthenticationToken;
import com.borry.org.webcomn.security.IncorrectCaptchaException;
import com.borry.org.webcomn.security.Principal;
import com.borry.org.webcomn.security.SecurityUtils;
import com.fasterxml.jackson.core.JsonProcessingException;


@Controller
@RequestMapping("login")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
		
	
	
	@RequestMapping("loginAjax")
	public @ResponseBody Map<String,String> login(String username,String password) throws JsonProcessingException{
		
		logger.info("username:{},password:{}",username,password);
		Map<String,String> map=new HashMap<String,String>();
		Subject sub=null;
		try {
			//*************************获取系统生成的Captcha*****************************//
			ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
	        HttpSession session = attr.getRequest().getSession(false);	      
	        //*************************获取系统生成的Captcha*****************************//
			CaptchaAuthenticationToken token=new CaptchaAuthenticationToken(username, password, null, null, false, null);
			
			sub=SecurityUtils.getSubject();
			sub.login(token);
		} catch (UnknownAccountException e) {
			logger.error("login error!!!!!!!!!!!!!!!!!!!",e);
			map.put("message", "没有此账户");
		} catch (LockedAccountException e) {
			logger.error("login error!!!!!!!!!!!!!!!!!!!",e);
			map.put("message", "账户被锁定");
		} catch (IncorrectCaptchaException e) {
			logger.error("login error!!!!!!!!!!!!!!!!!!!",e);
			map.put("message", "验证码错误");
		} catch (DisabledAccountException e) {
			logger.error("login error!!!!!!!!!!!!!!!!!!!",e);
			map.put("message", "此账户不可用");
		} catch (IncorrectCredentialsException e) {
			logger.error("login error!!!!!!!!!!!!!!!!!!!",e);
			map.put("message", "账户和密码不匹配");
		} catch (Exception e) {
			logger.error("login error!!!!!!!!!!!!!!!!!!!",e);
			map.put("message", "系统异常");
		} finally{
			if(map.containsKey("message")){
				map.put("result", "error");
				return map;
			}
		}
		map.put("result", "success");
		Principal p=(Principal)sub.getPrincipal();
		U.setAttribute(Constants.SESSION_WEB_UID, p.getPassportid());	
        U.setAttribute(Constants.SESSION_WEB_UNAME, p.getUsername());
    	U.setAttribute(Constants.SESSION_WEB_RID, p.getRoleid());    	
		return map;
	}
	
	@RequestMapping("logout")
	public String logout(){
		SecurityUtils.getSubject().logout();
		return "redirect:login.jsp";
	}
}
