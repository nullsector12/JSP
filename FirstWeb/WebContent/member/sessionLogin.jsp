<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 로그인 처리
	// 아이디와 비밀번호의 값을 문자열 비교해서 같으면 로그인 처리
	// 1. 아이디, 비밀번호 데이터를 받는다.
	// 2. 로그인을 위한 비교 : 아이디 비밀번호 문자열 비교
	// 3. 로그인 처리 : 세션에 사용자 정보를 저장
	// 4. 응답처리 : html 로그인처리 일 때 / 로그인 안됐을 때 
	
	String uid = request.getParameter("uid");
	String pw = request.getParameter("pw");
	
	boolean loginCheck = false;
	
	if(uid.equals(pw)){
		// 로그인 처리 : 세션의 속성에 데이터 저장
		session.setAttribute("memberId", uid);
		loginCheck = true;
	}
%>  

<%
	if(loginCheck) {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 완료</h1>
	<h2> 아이디 : <%= uid %></h2>
	<h2> 비밀번호 : <%= pw %></h2>
	<a href="myPage.jsp">My Page</a> <a href="logout.jsp">로그아웃</a>
</body>
</html>
<%
	}else { // 로그인 실패 시
%>
<script>
	alert("로그인에 실패 했습니다.");
	history.go(-1);
</script>
<% 
	}
%>