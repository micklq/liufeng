<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="background: white">
<head>
<%
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
%>
<title>我的资讯消息</title>
</head>
<body>
<section class="Hui-article-box">
	<div class="Hui-article">
		<div class="article_c pd-20">
			<div class="mynews">
				<div class="mynews_tit pb-10">我的资讯列表</div>
				<div class="mynews_c">
					<div class="mynews_btn">
						<input class="btn radius btn-secondary-outline mynews_shouf_butn radius" type="button" value="已收资讯">
						<input class="btn radius btn-warning-outline radius" type="button" value="已发资讯">
					</div>
					<div class="mynews_list">
						<ul>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
							<li><a href="javascript:;"><span>2017/11/23</span>建筑行业不景气是BIM 在“新常态”下，<i>中国经济正经历着变革</i></a></li>
						</ul>
						<div class="mynewspage mt-30">
							<div id="demo1">
								<div class="layui-box layui-laypage layui-laypage-default" id="layui-laypage-2"><a href="javascript:;" class="layui-laypage-prev layui-disabled" data-page="0">上一页</a><span class="layui-laypage-curr"><em class="layui-laypage-em"></em><em>1</em></span><a href="javascript:;" data-page="2">2</a><a href="javascript:;" data-page="3">3</a><a href="javascript:;" data-page="4">4</a><a href="javascript:;" data-page="5">5</a><span class="layui-laypage-spr">…</span><a href="javascript:;" class="layui-laypage-last" title="尾页" data-page="7">7</a><a href="javascript:;" class="layui-laypage-next" data-page="2">下一页</a></div>
							</div>
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
