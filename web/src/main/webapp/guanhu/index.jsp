<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="background: white">
<head>
<%
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
%>
<title>重点关护</title>
</head>
<body>
<section class="Hui-article-box">
	<div class="Hui-article">
		<div class="article_c cl pd-20">

			<div class="f-l sidebar_article">
				<div class="sidebar_article_tit">重点关护人群</div>
				<ul>
					<li><a href="javascript:;">涉检信访人员</a></li>
					<li><a href="javascript:;">涉检信访人员</a></li>
					<li><a href="javascript:;">涉检信访人员</a></li>
					<li><a href="javascript:;">涉检信访人员</a></li>
					<li><a href="javascript:;">涉检信访人员</a></li>
					<li><a href="javascript:;">涉检信访人员</a></li>
					<li><a href="javascript:;">涉检信访人员</a></li>
					<li><a href="javascript:;">涉检信访人员</a></li>
				</ul>
				<div class="sidebar_c_btn mt-15">
					<input class="btn btn-primary-outline radius" type="button" value="删除">
					<input class="btn btn-primary-outline radius" type="button" value="修改">
					<input class="btn btn-primary-outline radius addkey_btn" type="button" value="添加">
				</div>
				<div class="zhongdbh_dada mt-25">
					<img src="<%=basePath%>/static/images/data_img5.jpg" alt=""/>
				</div>
			</div>
			<div class="zhongdbh_c_r">
				<div class="pd-15 zhongdbh_c_i">
					<div class="zhongdbh_from cl">
						<div class="f-l zhongdbh_from_l">
							<span class="select-box radius">
								<select class="select" size="1" name="demo2">
									<option value="" selected="">圆角select效果</option>
									<option value="1">菜单一</option>
									<option value="2">菜单二</option>
									<option value="3">菜单三</option>
								</select>
							</span>
						</div>
						<div class="f-r zhongdbh_page cl">
							<div class="f-l zhongdbh_page_btn"><input type="button" value="上一页"/></div>
							<div class="f-l zhongdbh_page_text">1/6</div>
							<div class="f-l zhongdbh_page_btn"><input type="button" value="下一页"/></div>
						</div>

					</div>
					<div class="zhongdbh_table_c mt-20">
						<table class="table table-border table-bordered table-striped">
							<thead>
								<tr>
									<td></td>
									<td class="text-c">姓名</td>
									<td class="text-c">性别</td>
									<td class="text-c">地址</td>
									<td class="text-c">监护人</td>
									<td class="text-c">监护电话</td>
									<td class="text-c">其他</td>
								</tr>
							</thead>
							<tbody>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>

								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
								<tr onclick="javascript:window.location.href='renyuaninformation.html';">
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="zhongdbh_c_btn cl">
						<div class="f-r mt-25 zhongdbh_page cl">
							<div class="f-l zhongdbh_page_btn"><input type="button" value="上一页"/></div>
							<div class="f-l zhongdbh_page_text">1/6</div>
							<div class="f-l zhongdbh_page_btn"><input type="button" value="下一页"/></div>
						</div>
						<div class="sidebar_c_btn mt-30">
							<input class="btn btn-primary-outline radius" type="button" value="删除">
							<input class="btn btn-primary-outline radius" type="button" value="修改">
							<input class="btn btn-primary-outline radius addkey_btn" type="button" value="添加">
						</div>

					</div>
				</div>
			</div>
		</div>
		<div class="footer">
			技术支持  北京风行云端科技有限公司
		</div>
	</div>
</section>
<!--请在下方写此页面业务相关的脚本--> 
<script>
	$('.addkey_btn').click(function(){
		layer.open({
			type: 2,
			title: false,
			area: ['840px', '510px'],
			closeBtn: 0,
			btn: ['提交', '取消'],
			btnAlign: 'c',
			shadeClose: true,
			skin: 'yourclass',
			content: 'layer/addrenyxxlayer.html'
		});
	});
</script>
<!--/请在上方写此页面业务相关的脚本-->

</body>
</html>
