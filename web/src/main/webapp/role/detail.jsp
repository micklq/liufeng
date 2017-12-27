<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.borry.org.model.entity.*"%>
<%@page import="com.borry.org.model.entity.view.*"%>
<%@page import="com.borry.org.model.enums.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="background: white">
<head>
<%
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
%>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="favicon.ico" >
<link rel="Shortcut Icon" href="favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script><![endif]-->
<title>角色信息维护</title>
<%  
  Role p = (Role) request.getAttribute("role");
  if(p==null){ p = new Role();}  
%>
</head>
<body>
<article class="cl pd-20">
 <form method="post" class="form form-horizontal" id="form-admin-role-action">
            <input type="hidden" id="id" name="id" value="<%=p.getRoleId()%>">
            <div class="row cl">
                <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>角色名称：</label>
                <div class="formControls col-xs-8 col-sm-9">
                    <input type="text" class="input-text" value="<%=(p.getName()!=null?p.getName():"")%>" placeholder="" id="name" name="name">
                </div>
            </div>
            <div class="row cl">
                <label class="form-label col-xs-4 col-sm-3">描述：</label>
                <div class="formControls col-xs-8 col-sm-9">
                    <input type="text" class="input-text" value="<%=(p.getDescription()!=null?p.getDescription():"")%>" placeholder="" id="description" name="description">
                </div>
            </div>            
            <div class="row cl">
                <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                    <button type="submit" class="btn btn-success radius" id="admin-role-save" name="admin-role-save"><i class="icon-ok"></i> 确定</button>
                </div>
            </div>
 </form>
</article>
<script type="text/javascript" src="<%=basePath%>/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>/lib/layer/2.4/layer.js"></script> 
<script type="text/javascript" src="<%=basePath%>/static/js/H-ui.js"></script> 
<script type="text/javascript" src="<%=basePath%>/static/js/H-ui.admin.page.js"></script> 
<script type="text/javascript" src="<%=basePath%>/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="<%=basePath%>/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="<%=basePath%>/lib/jquery.validation/1.14.0/messages_zh.js"></script> 
<script type="text/javascript">
$(function () { 
  $("#form-admin-role-action").validate({
   rules: {},
   onkeyup: false,
   focusCleanup: true,
   success: "valid",
   submitHandler: function (form) {
      $(form).ajaxSubmit({
        type: 'post',
        url: "<%=basePath%>/role/updateAction",
        success: function (data) {
         if (data.success) {
           var index = parent.layer.getFrameIndex(window.name);
           parent.location.reload();
           parent.layer.close(index);
          }
          else
          {                                
             $.Huimodalalert(data.message, 3000);
          }
         },
        error: function (XmlHttpRequest, textStatus, errorThrown) {                       
         $.Huimodalalert('网络超时,请检查网络连接！', 2000);
        }
        });                   
     }
   });
});
</script>
</body>
</html>
