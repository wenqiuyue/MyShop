<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%User u=(User)session.getAttribute("user");
System.out.println(u.getUsertype());
	if(u.getUsertype().equals("0")){
		
	response.sendRedirect("guanliyuan.jsp");
	
 }else{
	 response.sendRedirect("index.jsp");
	
	} %>

</body>
</html>