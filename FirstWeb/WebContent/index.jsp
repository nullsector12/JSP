<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% String userName = (String)session.getAttribute("userName"); %>
<%--
	// 로그아웃 : session 객체 소멸
	session.invalidate();

	response.sendRedirect("../index.jsp");
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login or logout</title>
</head>
<body>
	현재 접속중인 사용자의 이름 : <%= userName %>
</body>
</html>