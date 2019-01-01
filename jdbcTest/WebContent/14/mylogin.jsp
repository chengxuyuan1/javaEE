<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/loginServlet" method="post">
		username:<input type="text"  name="uname"/> <br/>
		password: <input type="password" name="upwd"/> <br/>
		<input type="submit" value="login"/>
		<input type="reset" value="Reset"/>
	</form>
</body>
</html>