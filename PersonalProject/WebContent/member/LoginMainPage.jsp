<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	// 세션에 저장된 id 값 가져옴
	String id = (String)session.getAttribute("id"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>
	<h1>로그인 메인화면</h1>
	환영합니다. <%= id %>님
	<a href="myPage.jsp">마이페이지로 이동</a> <a href="board/mlist.jsp">게시판으로 이동</a> <br>
	<a href="sessionLogout.jsp">로그아웃</a>
</body>
</html>