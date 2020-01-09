<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
<%List<Goods> liebiao=(List<Goods>)session.getAttribute("goodsLiebiao"); %>
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
				
					<div class="fr">
						<ul>
							<li>欢迎来到小米之家</li>
							<li>|</li>
							<li><a href="">商城</a></li>
							
						</ul>
					</div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
		</header>
  <br><br>
  <p>商品列表</p>
  <br><br>

<table border="1">
<tr>
<td>序号</td>
<td>样式</td>
<td>商品名</td>
<td>价格</td>
<td>商品介绍</td>
<td>操作</td>
</tr>
<%
if(liebiao!=null){
	for(int i=0;i<liebiao.size();i++){
		Goods g=liebiao.get(i);
%>

<tr>
<td><%=i+1 %></td>
<td><img src="<%=g.getGoodpic1()%>" width="60" height="60"></td>
<td><%=g.getGoodname()%></td>
<td><%=g.getGoodprice()%></td>
<td><%=g.getGooddesc()%></td>

<td>
<a href="DeleteGoodsServlet?id=<%=g.getId()%>">删除</a></td>
</tr>
<%} } %>
</table>
</body>
</html>