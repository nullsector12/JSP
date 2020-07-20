<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.12.4.js"></script>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/default.css" />">
<style>
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp" %>

	<c:if test="${sessionId != null}">
		<script> 
			alert('이미 로그인 중입니다.'); 
			location.href = "/index.do";
		</script>
	</c:if> 
	<c:if test="${sessionId = null}">
	<c:if test="${loginResult == -1 || loginResult == 0}">
		<script>
			alert('아이디가 존재하지 않거나 비밀번호가 틀렸습니다.');
			location.href = "/index.do";
		</script>
	</c:if>
	<c:if test="${loginResult == 1}">
		<script>
			alert('로그인에 성공하였습니다.');
			location.href = "/index.do";
		</script>
	</c:if>
	</c:if>

	
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>