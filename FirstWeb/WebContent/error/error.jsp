<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%-- <%@ page errorPage= "viewErrorMessage.jsp" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>에러 발생 확인을 위한 페이지</h1>
	<h3>
		name 파라미터 값 : <%= request.getParameter("name").toUpperCase() %>
	</h3>
	<a href="index.jsp">홈으로 가기</a>
</body>
</html>