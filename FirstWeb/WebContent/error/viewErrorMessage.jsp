<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	요청 처리 과정에서 에러 발생 <br>
	<p>
		에러 타입 : <%= exception.getClass().getName() %> <br>
		에러 메시지 : <%= exception.getMessage() %> <br>
		<%= exception.getStackTrace() %>
	</p>
</body>
</html>