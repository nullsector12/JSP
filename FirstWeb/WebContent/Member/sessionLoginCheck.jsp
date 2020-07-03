<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String memberId = (String)session.getAttribute("memberId");
	boolean login = memberId == null ? false : true;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 체크</title>
</head>
<body>
	<% if(login) { %>
	아이디 "<%= memberId %>" 로 로그인 했습니다
	<% } else { %>
	로그인 하지 않은 상태입니다.
	<% } %>
</body>
</html>