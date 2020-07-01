<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userName = (String)session.getAttribute("userName");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session View2</title>
</head>
<body>
	<h1>
		session의 속성으로 저장한 데이터
		userName : <%= userName %> 
	</h1>
	<a href="logout.jsp">로그아웃</a>
</body>
</html>