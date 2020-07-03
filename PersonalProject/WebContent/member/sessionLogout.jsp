<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	// 세션에 저장된 값을 삭제하기 위해 세션 초기화
	session.invalidate(); 
%>
<script> 
	alert("로그아웃 되었습니다.");
	location.href="../index.html"
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>