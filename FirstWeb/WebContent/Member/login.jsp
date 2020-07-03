<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 정보</title>
</head>
<body>

	<h1>어서오세요, 회원님.</h1>
	<ul>
		<li>아이디(이메일) : <%= request.getParameter("userId") %></li>
		<li>비밀번호 : <%= request.getParameter("userPw") %></li>
	</ul>
</body>
</html>