<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	Cookie c= new Cookie("uid", "Cool"); 
	response.addCookie(c);
	
	Cookie c2= new Cookie("uname", "김승연");
	response.addCookie(c2);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	uid : <%= c %>
	uname : <%= c2 %>
</body>
</html>