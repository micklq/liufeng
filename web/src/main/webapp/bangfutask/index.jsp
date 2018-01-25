<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="background: white">
<head>
<%
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
%>
<title>检查官首页</title>
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
					<input class="btn btn-primary-outline radius" type="button" value="添加">
				</div>
				<div class="zhongdbh_dada mt-25">
					<img src="<%=basePath%>/static/images/data_img5.jpg" alt=""/>
				</div>
			</div>
			<div class="zhongdbh_c_r">
				<div class="pd-15 zhongdbh_c_i">
					<div class="zhongdbh_from renwuku_from cl">
						<div class="cl mb-20 renwuku_from_1">
							<dl class="cl renwukudl_1">
								<dt>类型：</dt>
								<dd>
									<span class="select-box radius">
										<select class="select" size="1" name="demo2">
											<option value="" selected="">圆角select效果</option>
											<option value="1">菜单一</option>
											<option value="2">菜单二</option>
											<option value="3">菜单三</option>
										</select>
									</span>
								</dd>
							</dl>
							<dl class="cl renwukudl_2">
								<dt>标题：</dt>
								<dd>
									<span class="select-box radius">
										<select class="select" size="1" name="demo2">
											<option value="" selected="">圆角select效果</option>
											<option value="1">菜单一</option>
											<option value="2">菜单二</option>
											<option value="3">菜单三</option>
										</select>
									</span>

								</dd>
							</dl>
							<dl class="cl renwukudl_3">
								<dt>作者：</dt>
								<dd>
									<span class="select-box radius">
										<select class="select" size="1" name="demo2">
											<option value="" selected="">圆角select效果</option>
											<option value="1">菜单一</option>
											<option value="2">菜单二</option>
											<option value="3">菜单三</option>
										</select>
									</span>
								</dd>
							</dl>
						</div>
						<div class="cl renwuku_from_1 renwuku_from_2">
							<dl class="cl renwukudl_1">
								<dt>是否展示：</dt>
								<dd>
									<span class="select-box radius">
										<select class="select" size="1" name="demo2">
											<option value="" selected="">圆角select效果</option>
											<option value="1">菜单一</option>
											<option value="2">菜单二</option>
											<option value="3">菜单三</option>
										</select>
									</span>
								</dd>
							</dl>
							<div class="f-l renwuku_btn1">
								<input class="btn btn-primary radius" type="button" value="搜索">
								<input class="btn btn-primary radius" type="button" value="重置">
							</div>
							<div class="f-l renwuku_btn2 cl">
								<input class="btn btn-primary radius" type="button" value="主要">
							</div>
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
									<td class="text-c">操作</td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
									<td class="text-c">
										<input class="btn btn-primary radius" type="button" value="主要">
										<input class="btn btn-danger radius" type="button" value="危险">
									</td>
								</tr>
								<tr>
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
									<td class="text-c">
										<input class="btn btn-primary radius" type="button" value="主要">
										<input class="btn btn-danger radius" type="button" value="危险">
									</td>
								</tr>
								<tr>
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
									<td class="text-c">
										<input class="btn btn-primary radius" type="button" value="主要">
										<input class="btn btn-danger radius" type="button" value="危险">
									</td>
								</tr>
								<tr>
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
									<td class="text-c">
										<input class="btn btn-primary radius" type="button" value="主要">
										<input class="btn btn-danger radius" type="button" value="危险">
									</td>
								</tr>
								<tr>
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
									<td class="text-c">
										<input class="btn btn-primary radius" type="button" value="主要">
										<input class="btn btn-danger radius" type="button" value="危险">
									</td>
								</tr>
								<tr>
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
									<td class="text-c">
										<input class="btn btn-primary radius" type="button" value="主要">
										<input class="btn btn-danger radius" type="button" value="危险">
									</td>
								</tr>
								<tr>
									<td class="text-c"><input type="checkbox" id="checkbox-1"></td>
									<td class="text-c">Adminto v1</td>
									<td class="text-c">男</td>
									<td>普安镇田家乡三队</td>
									<td class="text-c">刘颖</td>
									<td class="text-c">13699392376</td>
									<td class="text-c">无</td>
									<td class="text-c">
										<input class="btn btn-primary radius" type="button" value="主要">
										<input class="btn btn-danger radius" type="button" value="危险">
									</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="mynewspage mt-30">
						<div id="demo1">
							<div class="layui-box layui-laypage layui-laypage-default" id="layui-laypage-2"><a href="javascript:;" class="layui-laypage-prev layui-disabled" data-page="0">上一页</a><span class="layui-laypage-curr"><em class="layui-laypage-em"></em><em>1</em></span><a href="javascript:;" data-page="2">2</a><a href="javascript:;" data-page="3">3</a><a href="javascript:;" data-page="4">4</a><a href="javascript:;" data-page="5">5</a><span class="layui-laypage-spr">…</span><a href="javascript:;" class="layui-laypage-last" title="尾页" data-page="7">7</a><a href="javascript:;" class="layui-laypage-next" data-page="2">下一页</a></div>
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
	layui.use(['laypage', 'layer'], function(){
		var laypage = layui.laypage
				,layer = layui.layer;
		//总页数大于页码总数
		laypage.render({
			elem: 'demo1'
			,count: 70 //数据总数
			,jump: function(obj){
				console.log(obj)
			}
		});
	});
</script>
<!--/请在上方写此页面业务相关的脚本-->

</body>
</html>
