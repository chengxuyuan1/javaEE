<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎页面</title>
</head>
<body>
	<%if(session.getAttribute("userName")!=null){%>
		欢迎：<%=session.getAttribute("userName") %>	
		<a href="loginout1"></a>
		<%}else{%>
			请先登录
			<a href="login1.jsp">登录</a>
		<% }%>
		
		<%if(session.isNew()){ %>
		<br/>
		欢迎新用户
		<%}else {%>
		欢迎老用户
		<%} %>
</body>
</html>