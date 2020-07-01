<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>가입정보 전송 결과</h1>
	<hr>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td><%= request.getParameter("userId") %></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%= request.getParameter("userPw") %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%= request.getParameter("userName") %></td>
		</tr>
	</table>
</body>
</html>