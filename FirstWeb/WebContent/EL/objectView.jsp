<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>교제 리스트 (Array)</h1>
	<ul>
		<li>${requestScope.bookNames[0]}</li>
		<li>${requestScope.bookNames[1]}</li>
		<li>${bookNames[2]}</li>
	</ul>
	<h1>과목 (List)</h1>
	<ul>
		<li>${study[0]}</li>
		<li>${study[1]}</li>
		<li>${study[2]}</li>
		<li>${study[3]}</li>
	</ul>
	<h1>학생 정보 (Map)</h1>
	<ul>
		<li>전공 : ${requestScope.student.dept}</li>
		<li>이름 : ${student.name}</li>
		<li>연락처 : ${student.phoneNumber}</li>
	</ul>
</body>
</html>