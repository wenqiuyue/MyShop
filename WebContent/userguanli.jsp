<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
<%List<User> all=(List<User>)session.getAttribute("all"); 

%>
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
  <p>用户列表</p>
  <br><br>

<table border="1">
<tr>
<td>序号</td>
<td>用户姓名</td>
<td>用户电话</td>
<td>用户地址</td>
<td>操作</td>
</tr>
<%
if(all!=null){
	for(int i=0;i<all.size();i++){
		User u=all.get(i);
%>

<tr>
<td><%=i+1 %></td>
<td><%=u.getUsername()%></td>
<td><%=u.getPhone()%></td>
<td><%=u.getAddress()%></td>

<td>
<a href="update_guanli.jsp?id=<%=u.getId() %>&&username=<%=u.getUsername()%>&&tel=<%=u.getPhone()%>&&address=<%=u.getAddress()%>">修改 </a>   
<a href="DeleteUserServlet?id=<%=u.getId()%>">删除</a></td>
</tr>
<%} } %>
</table>
</body>
</html>