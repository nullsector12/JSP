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
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/default.css" />
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	
	<div>
		<h1 class="subtitle">회원가입</h1>
		
		<hr>
		
		<form action="memberReg.do" method="post" enctype="multipart/form-data">			
			<table>
				<tr>
					<td> 아이디 (이메일) </td>
					<td><input type="email" name="uid" value="아이디 입력"></td>
				</tr>
				<tr>
					<td> 비밀번호 </td>
					<td><input type="password" name="upw" value="비밀번호 입력"></td>
				</tr>
				<tr>
					<td> 이름 </td>
					<td><input type="text" name="uname" value="사용자 이름"></td>
				</tr>
				<tr>
					<td> 사진 등록 </td>
					<td> <input type="file" name="uphoto"> </td>
				</tr>
				<tr>
					<td> <input type="reset" name="reset" value="다시 작성"> </td>
					<td> <input type="submit" name="submit" value="가입"> </td>
				</tr>
			</table>
		
		</form>
	</div>
	
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>