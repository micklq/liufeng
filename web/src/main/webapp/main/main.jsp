<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/sitemesh-decorator.tld" prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<%
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><decorator:title default="borry management system"/>-borry</title>
<!--  
<link rel="stylesheet" type="text/css" href="css/default.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
-->
<decorator:head /><!-- 插入原始页面(被包装页面)的head标签中的内容(不包括head标签本身)。 -->
</head>
<body>
	

	<!-- 左侧导航 -->
	<div class="main_left">左侧导航
		<!--
		<c:forEach var="item" items="${menu}">
				<c:if test="${item['pid']==0 }">
					<div id="pmenu${item['id']}" title="${item['name'] }" data-options="" style="text-align: center; overflow-x: hidden;">
						<c:forEach var="subitem" items="${ item['children']}">
							<div id="menu${subitem['id']}" style="border-bottom: 1px solid #E8F1FF">
								<a href="${subitem['value'] }" class="easyui-linkbutton" data-options="plain:true" onclick="saveMenuId('${subitem['pid']}','${subitem['id']}')" style="width: 100%;">${subitem['name'] }</a>
							</div>
						</c:forEach>
					</div>
				</c:if>
			</c:forEach>
		-->
	</div>
	<!-- 内容tabs-->
	<div id="mainFrame" class="main_frame">
		<decorator:body /> <!--把请求的原始页面的body内的全部内容插入到相应位置。 -->
	</div>
	
	<!-- 页脚信息 -->
	<div class="main_footer">
		版权所有©2016    版本：V&nbsp;&nbsp;1.2.0
	</div>

</body>
</html>