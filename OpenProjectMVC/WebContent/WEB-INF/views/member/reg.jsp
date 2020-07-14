<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<% 
	
%>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/default.css" />">
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
		<h1 class="subtitle">회원가입</h1>
		
		<c:if test="${result > 0 && member != null}">
			<div>
				회원 가입 완료
			</div>
			%{member}
		</c:if>
		
		<c:if test="${not(result > 0 && member != null)}">
			회원 가입 실패
		</c:if>
		
		

	
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>