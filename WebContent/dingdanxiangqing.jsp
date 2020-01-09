<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品详情</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
<!-- start header -->
		<header>
			<div class="top center">
				<div class="left fl">
					<ul>
						<li><a href="http://www.mi.com/" target="_blank">小米商城</a></li>
						<li>|</li>
						<li><a href="">MIUI</a></li>
						<li>|</li>
						<li><a href="">米聊</a></li>
						<li>|</li>
						<li><a href="">游戏</a></li>
						<li>|</li>
						<li><a href="">多看阅读</a></li>
						<li>|</li>
						<li><a href="">云服务</a></li>
						<li>|</li>
						<li><a href="">金融</a></li>
						<li>|</li>
						<li><a href="">小米商城移动版</a></li>
						<li>|</li>
						<li><a href="">问题反馈</a></li>
						<li>|</li>
						<li><a href="">Select Region</a></li>
						<div class="clear"></div>
					</ul>
				</div>
				<div class="right fr">
					<div class="gouwuche fr"><a href="gouwuche.jsp">购物车</a></div>
					<div class="fr">
						<ul>
							<li><a href="">消息通知</a></li>
						</ul>
					</div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
		</header>
	<!--end header -->

<!-- start banner_x -->
		<div class="banner_x center">
			<a href="./index.html" target="_blank"><div class="logo fl"></div></a>
			<a href=""><div class="ad_top fl"></div></a>
			<div class="nav fl">
				<ul>
					<li><a href="">小米手机</a></li>
					<li><a href="">红米</a></li>
					<li><a href="">平板·笔记本</a></li>
					<li><a href="">电视</a></li>
					<li><a href="">盒子·影音</a></li>
					<li><a href="">路由器</a></li>
					<li><a href="">智能硬件</a></li>
					<li><a href="">服务</a></li>
					<li><a href="">社区</a></li>
				</ul>
			</div>
			
<!-- end banner_x -->

	
	<!-- xiangqing -->
	<form action="GouWuCheServlet" method="post">
	<div class="xiangqing">
	</div>
	
	<div class="jieshao mt20 w">
		<div class="left fl"><img src="<%=request.getParameter("goodpic1")%>" width="60" height="60"><input type="hidden" name="goodpic" value="<%=request.getParameter("goodpic") %>"></div>
		<div class="right fr">
			<div class="h3 ml20 mt20"><%=request.getParameter("goodname") %><input type="hidden" name="goodname" value="<%=request.getParameter("goodname") %>"></div>
			<div class="jianjie mr40 ml20 mt10"><%=request.getParameter("gooddesc") %></div>
			<div class="jiage ml20 mt10"><%=request.getParameter("goodprice")%><input type="hidden" name="goodprice" value="<%=request.getParameter("goodprice") %>"></div>
			
			
			
			<div class="xqxq mt20 ml20">
				<div class="top1 mt10">
					<div class="left1 fl"><%=request.getParameter("goodname") %>全网通版 6GB内存 64GB 亮黑色</div>
					<div class="right1 fr"><%=request.getParameter("goodprice")%></div>
					<div class="clear"></div>
				</div>
				<div class="bot mt20 ft20 ftbc">总计：<%=request.getParameter("goodprice")%></div>
			</div>
			<div class="xiadan ml20 mt20">
					<input class="jrgwc"  type="button" name="jrgwc" value="立即选购" />
					<input class="jrgwc" type="submit" name="jrgwc" value="加入购物车"/>
				
			</div>
		</div>
		<div class="clear"></div>
	</div>
	</form>
	<!-- footer -->
	<footer class="mt20 center">
			
			<div class="mt20">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</div>
			<div>©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>

		</footer>

</body>
</html>