<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 
		오류가 발생했습니다. error-code : 500 <br>
		계속해서 오류가 발생하면 관리자에게 문의하세요.
	</h1>
	<a href="<%= request.getContextPath() %>/index.jsp">홈으로 가기</a>
</body>
</html>