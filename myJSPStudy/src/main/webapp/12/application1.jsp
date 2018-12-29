<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application对象示例</title>
</head>
<body>
服务器信息：<%=application.getServerInfo() %><br/>
应用名称：<%=application.getServletContextName()%><br/>
主机名称：<%= application.getVirtualServerName() %>

</body>
</html>