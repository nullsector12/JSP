<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userName = (String)session.getAttribute("userName");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session View1</title>
</head>
<body>

	<h1>
		session의 속성으로 저장한 데이터
		userName : <%= userName %> <br>
	</h1>
	<a href="sessionView02.jsp">view02로 go</a>
</body>
</html>