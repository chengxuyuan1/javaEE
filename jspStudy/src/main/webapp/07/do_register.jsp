<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册信息处理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <jsp:useBean id="user" class=com.jike.entity.UserEntity></jsp:useBean>
  <jsp:setProperty property="userName" name="user"/>
  <jsp:setProperty property="password" name="user"/>
    <%
    String userName=request.getParameter("userName");
     String password=request.getParameter("password");
     out.println(userName);
     out.println("<br/>");
     out.println(password);
     %>
     <br/>
     <jsp:getProperty property="userName" name="user"/>
  <jsp:getProperty property="password" name="user"/>
  </body>
</html>
