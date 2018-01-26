<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/sitemesh-decorator.tld" prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<%
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
  
%>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/H-ui.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/public.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title><decorator:title default="borry management system"/></title>
<meta name="keywords" content="">
<meta name="description" content="">
<!--<decorator:head /> 插入原始页面(被包装页面)的head标签中的内容(不包括head标签本身)。 -->
</head>
<body>	


<header class="navbar-wrapper">
	<div class="navbar-fixed-top">
		<div class="container-fluid cl">
			<a class="logo navbar-logo f-l mt-15 mr-10 hidden-xs" href="javascript:;"><img src="<%=basePath%>/static/images/logo.png" alt="" ></a>

			<a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>

			<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
				<ul class="cl">
					<li class="topicon_4"><a href="#" title="">欢迎您，${webUersName}</a></li>
					<!--  <li class="topicon_1" id="Hui-msg">
						<a  href="#" title="消息">
							<span class="badge badge-danger">1</span>
							消息
						</a>
					</li>-->
					<li class="topicon_2"><a href="#" title="帮助">帮助</a></li>
					<li class="topicon_3"><a href="<%=basePath%>/login/logout" title="退出">退出</a></li>




				</ul>
			</li>


		</ul>
	</nav>
</div>
</div>
</header>
<aside class="Hui-aside">
	
	
<div class="menu_dropdown bk_2">
		<dl>
			<dt class="cl">
				<a href="<%=basePath%>/index/welcome"><span class="sidebar_icon1"></span>
				<em>检查官主页</em>
				<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></a>
			</dt>
			<!--
			左侧导航二级下拉
			<dd>
				<ul>
					<li><a href="article-list.html" title="检查官主页">检查官主页</a></li>
				</ul>
			</dd>-->
		</dl>

		<dl>
			<dt class="cl">
				<a href="<%=basePath%>/anjian/index"><span class="sidebar_icon9"></span>
				<em>案件受理</em>
				<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></a>
			</dt>

		</dl>

		<dl>
			<dt class="cl">
				<a href="<%=basePath%>/organization/index">
					<span class="sidebar_icon2"></span>
					<em>组员管理</em>
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</a>
			</dt>

		</dl>

		<dl>
			<dt class="cl">
				<a href="<%=basePath%>/bangfu/index">
					<span class="sidebar_icon3"></span>
					<em>帮扶对象</em>
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</a>
			</dt>

		</dl>

		<dl>
			<dt class="cl">
				<a href="<%=basePath%>/bangfutask/index">
					<span class="sidebar_icon4"></span>
					<em>帮扶任务库</em>
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</a>
			</dt>

		</dl>

		<dl>
			<dt class="cl">
				<a href="<%=basePath%>/guanhu/index">
					<span class="sidebar_icon5"></span>
					<em>重点观护</em>
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</a>
			</dt>

		</dl>

		<dl>
			<dt class="cl">
				<a href="<%=basePath%>/jingqing/index">
					<span class="sidebar_icon6"></span>
					<em>警情警讯</em>
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</a>
			</dt>

		</dl>

		<dl>
			<dt class="cl">
				<a href="<%=basePath%>/yufangdata/index">
					<span class="sidebar_icon7"></span>
					<em>预防大数据</em>
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</a>
			</dt>

		</dl>

		<dl>
			<dt class="cl">
				<a href="<%=basePath%>/article/index">
					<span class="sidebar_icon8"></span>
					<em>我的资讯</em>
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</a>
			</dt>

		</dl>
		<dl>
			<dt class="cl">
				<a href="<%=basePath%>/articleCategory/index">
					<span class="sidebar_icon8"></span>
					<em>资讯栏目</em>
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</a>
			</dt>

		</dl>
		<dl>
			<dt class="cl">
				<a href="<%=basePath%>/admin/index">
					<span class="sidebar_icon8"></span>
					<em>管理员管理</em>
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</a>
			</dt>

		</dl>
		<dl>
			<dt class="cl">
				<a href="<%=basePath%>/role/index">
					<span class="sidebar_icon8"></span>
					<em>角色管理</em>
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</a>
			</dt>

		</dl>
		<dl>
			<dt class="cl">
				<a href="<%=basePath%>/permission/index">
					<span class="sidebar_icon8"></span>
					<em>权限管理</em>
					<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
				</a>
			</dt>

		</dl>
	</div>

</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<decorator:body />

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="<%=basePath%>/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/H-ui.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/H-ui.admin.page.js"></script> 
<!--/_footer 作为公共模版分离出去-->
</body>
</html>