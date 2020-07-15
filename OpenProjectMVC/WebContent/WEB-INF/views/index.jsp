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
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	
	<div>
		<h3> 원하는 메뉴를 선택해주세요 </h3> </br>
		<h4> * 로그인을 하지 않으면 게시판 이용이 불가능합니다.</h4></br>
		<h5> 비회원이신 분은 방명록을 이용해주세요. </h5>
	</div>
	
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>