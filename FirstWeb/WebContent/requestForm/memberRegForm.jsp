<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/default.css">
<style></style>
</head>
<body>
	<%@ include file="../include/header.jsp" %>
	
	<div>
		<h1>회원가입</h1>
		    <form action="loginForm.jsp" method="post">
	            <label>아이디</label>
	            <input type="text" name="userId" placeholder="아이디" id="userId" required>
	            <label>비밀번호</label>
	            <input type="password" name="userPw" placeholder="비밀번호" id="userPw" required>
	            <label>이름</label>
	            <input type="text" name="userName" placeholder="이름" id="userName" required>
	            <input type="submit" value="가입">
	       	</form>
	</div>
	
	<%@ include file="../include/footer.jsp" %>

</body>
</html>