<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>config对象示例</title>
</head>
<body>
	用户名:<%= config.getInitParameter("username") %><br/>
	密码:<%= config.getInitParameter("password") %><br/>
</body>
</html>