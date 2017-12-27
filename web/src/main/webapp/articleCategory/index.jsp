<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  style="background: white">
 <head>
 <%
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
%>
<title>管理员列表 - 管理员列表</title>
</head>
<body>
<section class="Hui-article-box">
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span> 权限管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div class="Hui-article">
		<article class="cl pd-20">
			<div class="text-c">
				<form class="Huiform" method="post" action="" target="_self">
					<input type="text" class="input-text" style="width:250px" placeholder="权限名称" id="" name="">
					<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜权限节点</button>
				</form>
			</div>
			<div class="cl pd-5 bg-1 bk-gray mt-20"> 
			<span class="l">			
			<a href="javascript:;" onclick="admin_category_add('添加权限节点','admin-permission-add.html','','310')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加权限节点</a></span> 
			<span class="r">共有数据：<strong>54</strong> 条</span> 
			</div>
			<table class="table table-border table-bordered table-bg">
				<thead>
					<tr>
						<th scope="col" colspan="7">权限节点</th>
					</tr>
					<tr class="text-c">						
						<th width="40">ID</th>
						<th width="200">名称</th>
						<th>字段名</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${list}" var="p">                   
                    <tr class="text-c">
                        <td>${p.id}</td>
                        <td>${p.name}</td>
                        <td>${p.description}</td>
                        <td class="f-14">
                        <a title="编辑" href="javascript:;" onclick="admin_category_action('角色编辑', '${pageContext.request.contextPath}/admin/roleview?id=${p.id}', '800')" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> 
                        </td>
                    </tr>
                 </c:forEach> 	                 
					
				</tbody>
			</table>
		</article>
	</div>
</section>

 <!--请在下方写此页面业务相关的脚本--> 
<script type="text/javascript" src="<%=basePath%>/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="<%=basePath%>/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>/lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript">
 /*管理员-角色-添加-编辑*/
        function admin_category_action(title, url, w, h) {
            layer_show(title, url, w, h);
        }       
        /*管理员-角色-删除*/
        function admin_role_del(obj, id) {
            layer.confirm('角色删除须谨慎，确认要删除吗？', function (index) {
                $.ajax({
                    type: 'POST',
                    url: 'admin/roleRemove?roleId=' + id,
                    dataType: 'json',
                    success: function (data) {
                        if (data.success) {
                            $(obj).parents("tr").remove();
                            layer.msg(data.message, { icon: 1, time: 1000 });
                        }
                        else {
                            layer.msg(data.message, { icon: 1, time: 1000 });
                        }
                        
                    },
                    error: function (data) {
                        console.log(data.message);
                    },
                });
            });
}
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>
