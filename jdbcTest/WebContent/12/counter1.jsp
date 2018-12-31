<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>页面访问计数器</title>
</head>
<body>
<%
	Object obj = application.getAttribute("counter");
	if(obj==null){
		application.setAttribute("counter",new Integer(1));
		out.println("该页面被访问了一次<br/>");
	}else{
		int counterValue=Integer.parseInt(obj.toString());
		counterValue++;
		out.println("该页面被访问了"+counterValue+"次");
		application.setAttribute("counter", counterValue);
	}
%>
</body>
</html>