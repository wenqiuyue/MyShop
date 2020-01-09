<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>小米商城-个人中心</title>
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
				
				<div class="clear"></div>
			</div>
		</header>
	<!--end header -->
	<!-- start banner_x -->
<!-- end banner_x -->
<!-- self_info -->
	<div class="grzxbj">
		<div class="selfinfo center">
		<form action="UpdateGuanLi" method="post">
		<div class="rtcont fr">
			<div class="grzlbt ml40">编辑用户信息</div>
			<div class="subgrzl ml40"><span>昵称</span><span><input style="background:none;border:0;"type="text" name="username" value="<%=request.getParameter("username") %>" ></span></div>
			<div class="subgrzl ml40"><span>手机号</span><span><input style="background:none;border:0;"type="text" name="tel" value="<%=request.getParameter("tel")%>" ></span></div>
			
			<div class="subgrzl ml40"><span>收货地址</span><span><input style="width:700px; height:40px;background:none;border:0;"type="text" name="address" value="<%=request.getParameter("address")%>" ></span></div>
			<input type="hidden" name="id" value="<%=request.getParameter("id")%>">
		<div class="right fr">
			<div class="gouwuche fr"><input type="submit" id="tijiao" name="tijiao" value="提交"></div>
			</div>
		</div>
		</form>
		<div class="clear"></div>
		</div>
	</div>
<!-- self_info -->
		
		<footer class="mt20 center">			
			<div class="mt20">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</div>
			<div>©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>
</body>
</html>