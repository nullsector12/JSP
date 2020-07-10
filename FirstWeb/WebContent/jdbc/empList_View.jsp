<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%-- ${empList} --%>
	
	<h1>사원 리스트</h1>
	<hr>
	<table border="1">
		<tr>
			<th>사원 번호</th>
			<th>사원 이름</th>
			<th>사원 급여</th>
			<th>사원 직급</th>
		</tr>
		 <!-- empty = null일 때 혹은 list 요소가 0개 일 때 혹은 문자열 "" 이 반환 될 때 true-->
		<c:if test="${ empty empList }"/>
		<tr>
			<td colspan="4">데이터가 존재하지 않습니다.</td>
		</tr>
		
		<c:if test="${ not empty empList }">
		<c:forEach items="${empList}" var="emp">
		<tr>
			<td>${emp.empno}</td>
			<td>${emp.ename}</td>
			<td>${emp.sal}</td>
			<td>${emp.job}</td>
		</tr>
		</c:forEach>
		</c:if>
	</table>
</body>
</html>