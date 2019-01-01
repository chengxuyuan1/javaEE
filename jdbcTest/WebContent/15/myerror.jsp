<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录错误提示页面</title>
</head>
<body>
登录失败。<br/>
您提交的信息为:<br/>
用户名:<%= request.getParameter("uname") %><br/>
密码:<%=request.getParameter("upwd") %><br/>
<a href="<%=request.getContextPath() %>/15/mylogin.jsp">返回登录页面</a>
</body>
</html>