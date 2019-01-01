<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
</head>
<style type="text/css">
body{
	color:#000;
	font-size:14px;
	margin:20px auto;
}
</style>


<script type="text/javascript">
	function check(form){
		if(document.forms.loginFrom.uname.value==""){
			alert("请输入用户名");
			document.forms.loginFrom.uname.focus();
			return false;
		}
		if(document.forms.loginFrom.upwd.value==""){
			alert("请输入密码");
			document.forms.loginFrom.upwd.focus();
			return false;
		}
	}
</script>
<body>
	<form action="<%=request.getContextPath() %>/CheakServlet method="post" name="loginFrom">
		<table border="1" cellspaceing="0" cellpadding="5" bordercolor="silver" align="center">
			<tr>
				<td colspan="2 align="center" bgcolor="#E8E8E8">用户登录 </td>
			</tr>
			<tr>
				<td >用户名:</td>
				<td ><input type="text" name="uname"/></td>
			</tr>
			<tr>
				<td >密码:</td>
				<td ><input type="text" name="upwd"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" name="submit" onclick="return check(this)"/>
				<input type="reset" name="reset"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>