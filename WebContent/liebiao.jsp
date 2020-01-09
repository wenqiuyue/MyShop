<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>小米网站</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
<%List<Goods> goods=(List<Goods>)session.getAttribute("goods");%>
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
							<li>欢迎来到小米之家</li>
							<li>|</li>
							<li><a href="self_info.jsp">个人中心</a></li>

							
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
			<a href="" target="_blank"><div class="logo fl"></div></a>
			<a href=""><div class="ad_top fl"></div></a>
			<div class="nav fl">
				<ul>
					<li><a href="">小牧sss</a></li>
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
		</div>
<!-- end banner_x -->

	<!-- start danpin -->
		<div class="danpin center">
			
			<div class="biaoti center">小米手机</div>
			<div class="main center">
			<%
				if(goods!=null){
				for(int i=0;i<goods.size();i++){
				Goods g=goods.get(i);
				%>
				<div class="mingxing fl mb20" style="border:2px solid #fff;width:230px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
					<div class="sub_mingxing"><a href="./xiangqing.jsp?goodname=<%=g.getGoodname()%>&&goodprice=<%=g.getGoodprice() %>&&gooddesc=<%=g.getGooddesc() %>&&goodpic1=<%=g.getGoodpic1()%>&&goodpic=<%=g.getGoodpic()%>" ><img src="<%=g.getGoodpic()%>" alt=""></a></div>
					<div class="pinpai"><a href="./xiangqing.jsp?goodname=<%=g.getGoodname()%>&&goodprice=<%=g.getGoodprice() %>&&gooddesc=<%=g.getGooddesc() %>&&goodpic1=<%=g.getGoodpic1()%>&&goodpic=<%=g.getGoodpic()%>" ><%=g.getGoodname()%></a></div>
					<div class="jiage"><%=g.getGoodprice() %></div>
				</div>
				<%}} %>
				<div class="clear"></div>
			</div>
		</div>
		

		<footer class="mt20 center">			
			<div class="mt20">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</div>
			<div>©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>

		</footer>

	<!-- end danpin -->


</body>
</html>