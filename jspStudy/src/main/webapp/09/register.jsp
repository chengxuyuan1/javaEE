<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>录入表单信息</title>
    
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
    <form action="do_register.jsp" method="post">
    用户名:<input type="text" name="userName"/>
    技能：
    <input type="checkbox" name="skills" value="java"/>
    <input type="checkbox" name="skills" value="python"/>
    <input type="checkbox" name="skills" value="ruby"/>
    <input type="checkbox" name="skills" value="golang"/>
    <bt/>
    <input type="submit"  value="提交"/>
    <input type="reset"  value="重置"/>
    </form>
  </body>
</html>
