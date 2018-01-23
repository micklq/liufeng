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
		<div class="article_c pd-20">
			<div class="article_top mb-20 cl">
				<div class="f-l pd-15 personnel mkstyle">
					<div class="personnel_top pb-20 cl">
						<dl>
							<dd>
								<div class="personnel_img"><img src="<%=basePath%>/static/images/personnel_img.jpg"> </div>
								<span>检察长</span>
								<p>朝阳检察院</p>
							</dd>
							<dt>
								<span>John Done</span>
							<p>1988年9月生,江苏南通人,1973年12月加
								入中国共产党,1972年12月参加工作,华东
								政法学院国际法系国际法专业毕业,研究生
								学历,法学硕士学位,教授。1988年9月生,江苏南通人,1973年12月加
								入中国共产党,1972年12月参加工作</p>
							</dt>

						</dl>
						<div class="personnel_cz">
							<span>专长：</span><em>检查业务</em><em>案件信息</em><em>队伍建设</em>
						</div>


					</div>

					<div class="personnel_num cl">
						<dl>
							<dt>20.7K</dt>
							<dd>监管人数</dd>
						</dl>
						<dl>
							<dt>700</dt>
							<dd>信息员数</dd>
						</dl>
						<dl>
							<dt>20.7K</dt>
							<dd>发起讨论数</dd>
						</dl>
					</div>

				</div>
				<div class="f-r pd-15 modular_sy mkstyle">
					<div class="modular_tit cl">
						<span class="modular_tit_txt">检情警讯</span>
						<div class="modular_radio">
							<div class="radio-box">
								<input type="radio" id="radio-1" name="demo-radio1">
								<label for="radio-1">全部</label>
							</div>
							<div class="radio-box">
								<input type="radio" id="radio-1" name="demo-radio1">
								<label for="radio-1">等待处理</label>
							</div>
							<div class="radio-box">
								<input type="radio" id="radio-1" name="demo-radio1">
								<label for="radio-1">跟踪处理</label>
							</div>
							<div class="radio-box">
								<input type="radio" id="radio-1" name="demo-radio1">
								<label for="radio-1">处理完毕</label>
							</div>
							<div class="radio-box">
								<input type="radio" id="radio-1" name="demo-radio1">
								<label for="radio-1">无效讯息</label>
							</div>
						</div>
					</div>

					<div class="modular_table">
						<table class="table table-border table-bordered table-striped">
							<tr class="text-c">
								<td>编号</td>
								<td>项目名称</td>
								<td>时间</td>
								<td>来源</td>
								<td>状态</td>
							</tr>
							<tr class="text-c">
								<td>1</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn radius btn-warning" type="button" value="等待处理"></td>
							</tr>
							<tr class="text-c">
								<td>2</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-primary radius" type="button" value="跟踪处理"></td>
							</tr>
							<tr class="text-c">
								<td>3</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-primary radius" type="button" value="跟踪处理"></td>
							</tr>
							<tr class="text-c">
								<td>4</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-default" type="button" value="无效讯息"></td>
							</tr>
							<tr class="text-c">
								<td>5</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-primary radius" type="button" value="跟踪处理"></td>
							</tr>
							<tr class="text-c">
								<td>6</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-success radius" type="button" value="处理完毕"></td>
							</tr>
							<tr class="text-c">
								<td>7</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-success radius" type="button" value="处理完毕"></td>
							</tr>
							<tr class="text-c">
								<td>8</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-primary radius" type="button" value="跟踪处理"></td>
							</tr>
						</table>
					</div>





				</div>

			</div>

			<div class="modular_menu mb-20 cl">
				<ul>
					<li>
						<img src="<%=basePath%>/static/images/modular_menu_1.jpg" alt="" >
						<div class="modular_menu_c">
							<dl>
								<dt>监管对象</dt>
								<dd>共有（3478）个对象</dd>
							</dl>
							<p><a href="javascript:;"></a><span>详情</span></p>
						</div>
					</li>
					<li>
						<img src="<%=basePath%>/static/images/modular_menu_2.jpg" alt="" >
						<div class="modular_menu_c">
							<dl>
								<dt>讨论小组</dt>
								<dd>共有（3478）个对象</dd>
							</dl>
							<p><a href="javascript:;"></a><span>详情</span></p>
						</div>
					</li>
					<li>
						<img src="<%=basePath%>/static/images/modular_menu_3.jpg" alt="" >
						<div class="modular_menu_c">
							<dl>
								<dt>工作组成员</dt>
								<dd>共有（3478）个对象</dd>
							</dl>
							<p><a href="javascript:;"></a><span>详情</span></p>
						</div>
					</li>
					<li>
						<img src="<%=basePath%>/static/images/modular_menu_4.jpg" alt="" >
						<div class="modular_menu_c">
							<dl>
								<dt>任务库</dt>
								<dd>共有（3478）个对象</dd>
							</dl>
							<p><a href="javascript:;"></a><span>详情</span></p>
						</div>
					</li>
					<li>
						<img src="<%=basePath%>/static/images/modular_menu_5.jpg" alt="" >
						<div class="modular_menu_c">
							<dl>
								<dt>帮扶任务</dt>
								<dd>共有（3478）个对象</dd>
							</dl>
							<p><a href="javascript:;"></a><span>详情</span></p>
						</div>
					</li>
					<li>
						<img src="<%=basePath%>/static/images/modular_menu_6.jpg" alt="" >
						<div class="modular_menu_c">
							<dl>
								<dt>资讯</dt>
								<dd>共有（3478）个对象</dd>
							</dl>
							<p><a href="javascript:;"></a><span>详情</span></p>
						</div>
					</li>
				</ul>
			</div>

			<div class="article2 mb-20 cl">
				<div class="f-l pd-15 modular_tl mkstyle">
					<div class="modular_tit cl">
						<span class="modular_tit_txt">我的讨论</span>
						<p><i class="pi1">165</i> 我发起的<i class="pi2">165</i> 我参与的</p>
					</div>
					<div class="modular_tl_c">
						<dl>
							<dt class="tl_icon1"></dt>
							<dd>
								<p>又见树木，又见森林（3）：软件需求可视化模型</p>
								<em>13分钟前</em>
							</dd>
						</dl>
						<dl>
							<dt class="tl_icon2"></dt>
							<dd>
								<p>又见树木，又见森林（3）：软件需求可视化模型</p>
								<em>13分钟前</em>
							</dd>
						</dl>
						<dl>
							<dt class="tl_icon1"></dt>
							<dd>
								<p>又见树木，又见森林（3）：软件需求可视化模型</p>
								<em>13分钟前</em>
							</dd>
						</dl>
						<dl>
							<dt class="tl_icon1"></dt>
							<dd>
								<p>又见树木，又见森林（3）：软件需求可视化模型</p>
								<em>13分钟前</em>
							</dd>
						</dl>
						<dl>
							<dt class="tl_icon1"></dt>
							<dd>
								<p>又见树木，又见森林（3）：软件需求可视化模型</p>
								<em>13分钟前</em>
							</dd>
						</dl>
					</div>
				</div>


				<div class="f-r pd-15 modular_sy mkstyle">
					<div class="modular_tit cl">
						<span class="modular_tit_txt">动态任务</span>
						<div class="modular_radio">
							<div class="radio-box">
								<input type="radio" id="radio-1" name="demo-radio1">
								<label for="radio-1">全部</label>
							</div>
							<div class="radio-box">
								<input type="radio" id="radio-1" name="demo-radio1">
								<label for="radio-1">等待处理</label>
							</div>
							<div class="radio-box">
								<input type="radio" id="radio-1" name="demo-radio1">
								<label for="radio-1">跟踪处理</label>
							</div>
							<div class="radio-box">
								<input type="radio" id="radio-1" name="demo-radio1">
								<label for="radio-1">处理完毕</label>
							</div>
							<div class="radio-box">
								<input type="radio" id="radio-1" name="demo-radio1">
								<label for="radio-1">无效讯息</label>
							</div>
						</div>
					</div>

					<div class="modular_table">
						<table class="table table-border table-bordered table-striped">
							<tr class="text-c">
								<td>编号</td>
								<td>项目名称</td>
								<td>时间</td>
								<td>来源</td>
								<td>状态</td>
							</tr>
							<tr class="text-c">
								<td>1</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn radius btn-warning" type="button" value="等待处理"></td>
							</tr>
							<tr class="text-c">
								<td>2</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-primary radius" type="button" value="跟踪处理"></td>
							</tr>
							<tr class="text-c">
								<td>3</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-primary radius" type="button" value="跟踪处理"></td>
							</tr>
							<tr class="text-c">
								<td>4</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-default" type="button" value="无效讯息"></td>
							</tr>
							<tr class="text-c">
								<td>5</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-primary radius" type="button" value="跟踪处理"></td>
							</tr>
							<tr class="text-c">
								<td>6</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-success radius" type="button" value="处理完毕"></td>
							</tr>
							<tr class="text-c">
								<td>7</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-success radius" type="button" value="处理完毕"></td>
							</tr>
							<tr class="text-c">
								<td>8</td>
								<td>Adminto v1</td>
								<td>2017/11/15</td>
								<td>2017/11/15</td>
								<td><input class="btn btn-primary radius" type="button" value="跟踪处理"></td>
							</tr>
						</table>
					</div>





				</div>
			</div>

			<div class="article3 mkstyle pd-15 cl">
				<div class="f-l databox1">
					<div class="modular_tit cl">
						<span class="modular_tit_txt">检情警讯数据图</span>
					</div>
					<div class="databox1_c" id="databox1">
						<img src="<%=basePath%>/static/images/data_img1.jpg" alt="" >
						<div class="databox1_data_c">
							<span class="imgArea databox1_data"><a href="javascript:;">查看数据</a></span>
						</div>
					</div>
				</div>
				<div class="f-l databox1">
					<div class="modular_tit cl">
						<span class="modular_tit_txt">我的讨论数据图</span>
					</div>
					<div class="databox1_c" id="databox1">
						<img src="<%=basePath%>/static/images/data_img2.jpg" alt="" >
						<div class="databox1_data_c">
							<span class="imgArea databox2_data"><a href="javascript:;">查看数据</a></span>
						</div>
					</div>
				</div>
				<div class="f-l databox1 databox3">
					<div class="modular_tit cl">
						<span class="modular_tit_txt">动态任务数据图</span>
					</div>
					<div class="databox1_c" id="databox1">
						<img src="<%=basePath%>/static/images/data_img3.jpg" alt="" >
						<div class="databox1_data_c">
							<span class="imgArea databox3_data"><a href="javascript:;">查看数据</a></span>
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
 <script type="text/javascript">
	$('.databox1_data').click(function(){
		layer.open({
			type: 2,
			title: false,
			area: ['960px', '600px'],
			shadeClose: true,
			btnAlign: 'c',
			shadeClose: true,
			skin: 'yourclass',
			content: 'layer/data_index1.html'
		});
	});

	$('.databox2_data').click(function(){
		layer.open({
			type: 2,
			title: false,
			area: ['960px', '600px'],
			shadeClose: true,
			btnAlign: 'c',
			shadeClose: true,
			skin: 'yourclass',
			content: 'layer/data_index2.html'
		});
	});

	$('.databox3_data').click(function(){
		layer.open({
			type: 2,
			title: false,
			area: ['960px', '600px'],
			shadeClose: true,
			btnAlign: 'c',
			shadeClose: true,
			skin: 'yourclass',
			content: 'layer/data_index3.html'
		});
	});
</script>
<!--/请在上方写此页面业务相关的脚本-->

</body>
</html>
