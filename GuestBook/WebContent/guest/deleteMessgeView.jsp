<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:if test="${resultCode == 1}">
	<h1>게시글을 성공적으로 삭제했습니다.</h1>
	</c:if>
	
	<c:if test="${resultCode == -1}">
	<h1>삭제할 게시글이 존재하지 않습니다.</h1>
	</c:if>
	
	<c:if test="${resultCode == -2}">
	<h1>입력하신 비밀번호가 일치하지 않습니다.</h1>
	</c:if>

	<a href="list.jsp">리스트로 돌아가기</a>
</body>
</html>