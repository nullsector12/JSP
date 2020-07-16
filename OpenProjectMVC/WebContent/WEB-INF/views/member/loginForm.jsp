<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="http://code.jquery.com/jquery-1.12.4.js"></script>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/default.css" />
<style>
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	
	<div>
		<h1 class="subtitle">로그인</h1>
		<hr>
		<form action="login.do" method="post"  enctype="multipart/form-data">			
			<table>
				<tr>
					<td> 아이디 (이메일) </td>
					<td><input type="email" name="uid" id="uid"></td>
				</tr>
				<tr>
					<td> 비밀번호 </td>
					<td><input type="password" id="upw" name="upw" value="비밀번호 입력"></td>
				</tr>
				<tr>
					<td> <input type="reset" name="reset" value="다시 작성"> </td>
					<td> <input type="submit" name="submit" value="로그인"> </td>
				</tr>
			</table>
		</form>
	</div>
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>