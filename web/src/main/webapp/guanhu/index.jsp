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
			<div class="canj_zw mb-20 cl">
				<div class="f-l pd-15 mkstyle hhuecjsli">
					<div class="modular_tit cl">
						<span class="modular_tit_txt">目前案件受理</span>
						<div class="f-l ml-30 hhuecjsli_t_btn">
							<input class="btn radius btn-warning" type="button" value="+ 案件发布" onclick="javascript:window.location.href='newcase.html'">
						</div>
						<div class="f-r hhuecjsli_zj">
							共<strong>25</strong>个案件
						</div>

					</div>
					<div class="hhuecjsli_c mt-15">
						<dl class="cl">
							<dt>

							</dt>
							<dd>
								<a href="caseshouli_article.html"><i></i>
									<strong>JOHN DONE</strong> <span>年龄：14岁</span><span>性别：男</span>
									<p>这个概念包含"青年"和"少年"两个年龄段的人群，横跨了未成年人</p>
								</a>
							</dd>
						</dl>
						<dl class="cl">
							<dt>

							</dt>
							<dd>
								<a href="caseshouli_article.html"><i></i>
									<strong>JOHN DONE</strong> <span>年龄：14岁</span><span>性别：男</span>
									<p>这个概念包含"青年"和"少年"两个年龄段的人群，横跨了未成年人</p>
								</a>
							</dd>
						</dl>
						<dl class="cl">
							<dt>

							</dt>
							<dd>
								<a href="caseshouli_article.html"><i></i>
									<strong>JOHN DONE</strong> <span>年龄：14岁</span><span>性别：男</span>
									<p>这个概念包含"青年"和"少年"两个年龄段的人群，横跨了未成年人</p>
								</a>
							</dd>
						</dl>
						<dl class="cl">
							<dt>

							</dt>
							<dd>
								<a href="caseshouli_article.html"><i></i>
									<strong>JOHN DONE</strong> <span>年龄：14岁</span><span>性别：男</span>
									<p>这个概念包含"青年"和"少年"两个年龄段的人群，横跨了未成年人</p>
								</a>
							</dd>
						</dl>
						<dl class="cl">
							<dt>

							</dt>
							<dd>
								<a href="caseshouli_article.html"><i></i>
									<strong>JOHN DONE</strong> <span>年龄：14岁</span><span>性别：男</span>
									<p>这个概念包含"青年"和"少年"两个年龄段的人群，横跨了未成年人</p>
								</a>
							</dd>
						</dl>
					</div>

				</div>
				<div class="f-r canj_zw_r">
					<div class="pd-15 mb-20 mkstyle pastcase">
						<div class="modular_tit cl">
							<span class="modular_tit_txt">往期案例</span>
							<div class="f-r modular_radio">
								<div class="radio-box">
									<input type="radio" id="radio-1" name="demo-radio1">
									<label for="radio-1">全部</label>
								</div>
								<div class="radio-box">
									<input type="radio" id="radio-1" name="demo-radio1">
									<label for="radio-1">允许批捕</label>
								</div>
								<div class="radio-box">
									<input type="radio" id="radio-1" name="demo-radio1">
									<label for="radio-1">不予批捕</label>
								</div>
								<div class="radio-box">
									<input type="radio" id="radio-1" name="demo-radio1">
									<label for="radio-1">帮扶教育</label>
								</div>

							</div>
						</div>
						<div class="modular_table mt-15">
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

							</table>
						</div>
					</div>

					<div class="pd-15 mkstyle legaltwen">
						<div class="modular_tit cl">
							<span class="modular_tit_txt">法律条文</span>
						</div>
						<div class="mt-15 legaltwen_c">
							<p>法律条文</p>
							<ul>
								<li><span>2017/11/5</span>中人们共和国教育法</li>
								<li><span>2017/11/5</span>中人们共和国教育法</li>
								<li><span>2017/11/5</span>中人们共和国教育法</li>
								<li><span>2017/11/5</span>中人们共和国教育法</li>
								<li><span>2017/11/5</span>中人们共和国教育法</li>
							</ul>
						</div>
					</div>

				</div>

			</div>


			<div class="pd-15 mkstyle cl caserenyuan">

				<div class="f-l caserenyuan_l">
					<div class="modular_tit mb-20 cl">
						<span class="modular_tit_txt">办案人员</span>
					</div>
					<ul>
						<li>
							<div class="casery_lsit">
								<div class="round casery_img"><img src="<%=basePath%>/static/images/data_img1.jpg" alt=""/></div>
								<span>检察长</span>
								<p>朝阳检察院</p>
							</div>
						</li>
						<li>
							<div class="casery_lsit">
								<div class="round casery_img"><img src="<%=basePath%>/static/images/data_img1.jpg" alt=""/></div>
								<span>检察长</span>
								<p>朝阳检察院</p>
							</div>
						</li>
						<li>
							<div class="casery_lsit">
								<div class="round casery_img"><img src="<%=basePath%>/static/images/data_img1.jpg" alt=""/></div>
								<span>检察长</span>
								<p>朝阳检察院</p>
							</div>
						</li>
						<li>
							<div class="casery_lsit">
								<div class="round casery_img"><img src="<%=basePath%>/static/images/data_img1.jpg" alt=""/></div>
								<span>检察长</span>
								<p>朝阳检察院</p>
							</div>
						</li>
					</ul>



				</div>
				<div class="f-l caserenyuan_r pt-10 pb-10">
					<img src="<%=basePath%>/static/images/data_img1.jpg" alt=""/>
				</div>
			</div>

		</div>
		<div class="footer">
			技术支持  北京风行云端科技有限公司
		</div>
	</div>
</section>
<!--请在下方写此页面业务相关的脚本--> 

<!--/请在上方写此页面业务相关的脚本-->

</body>
</html>
