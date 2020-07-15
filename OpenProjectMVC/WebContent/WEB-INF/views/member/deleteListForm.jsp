<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.12.4.js"></script>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/default.css" />
<style>
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	<h1>삭제하고자 하는 아이디와 비밀번호를 정확히 입력해주세요.</h1>
	
	<form id="deleteForm" action="deleteView.do" method="post" enctype="multipart/form-data">
		아이디 <input type="email" id="uid">
		비밀번호 <input type="password" id="upw">
		<input type="submit" value="삭제하기">
	</form>
	
	
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>