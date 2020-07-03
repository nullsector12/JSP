<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
	String uid = (String) session.getAttribute("id");
	String uname = "test";
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>마이 페이지</h1>
	id : <%= uid %>
	name : <%= uname %>
</body>
</html>