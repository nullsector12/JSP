<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Request Form Test</h1>
	<hr>
	<form action="requestResult.jsp" method="post">
		<label>이름</label>
		<input type="text" name="username" required> <br>
		<label>직업</label>
		<select name="job">
			<option value="시스템 엔지니어">시스템 엔지니어</option>
			<option value="프로그래머">프로그래머</option>
			<option value="웹 디자이너">웹 디자이너</option>
			<option value="데이터 분석가">데이터 분석가</option>
		</select>
		<br>
		<label>관심사항</label>
		JAVA <input type="checkbox" name="like" value="JAVA"> 
		HMTL5 <input type="checkbox" name="like" value="HTML5">
		CSS3 <input type="checkbox" name="like" value="CSS3"> 
		JavaScript <input type="checkbox" name="like" value="JavaScript"> 
		JSP <input type="checkbox" name="like" value="JSP"> 
		
		<br>
		
		<input type="submit" value="보내기"> <input type="reset" value="초기화">
	</form>
</body>
</html>