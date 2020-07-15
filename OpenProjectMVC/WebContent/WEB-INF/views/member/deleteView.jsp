<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.12.4.js"></script>
<style>
</style>
</head>
<body>
	<c:if test="${result eq 1}">
		<h1>성공적으로 삭제했습니다.</h1>
	</c:if> 
	<c:if test="${result eq -1}">
		<h1>삭제 할 대상이 존재하지 않습니다.</h1>
	</c:if>
	<c:if test="${result eq -2}">
		<h1>비밀번호가 틀렸습니다.</h1>
	</c:if>


</body>
</html>