<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트</title>
<script src="http://code.jquery.com/jquery-1.12.4.js"></script>
<style>
	.memberBox>img {
		width : 50px;
		height: 50px;
	}
</style>
</head>
<body>
	<h1>회원 리스트</h1>
	<hr>
	
<table>
	<tr>
		<th>회원 번호</th>
		<th>아이디</th>
		<th>이름</th>
		<th>사진</th>
		<th>가입 일자</th>
		<th>관리</th>
	</tr>
	<c:if test="${not empty viewList.memberList}"></c:if>
	<c:forEach items="${viewList.memberList}" var="member">
		<tr class="memberBox">
			<td>${member.idx}</td>
			<td>${member.uid}</td> 
			<td>${member.uname}</td>
			<td><img src="<c:url value="${member.uphoto}"/>"></td> 
			<td>${member.regdate}</td>
			<td>
				<a></a>
			</td>
		</tr>
	</c:forEach>
	<c:if test="${empty viewList.memberList}">
		<h1>조회된 회원이 없습니다.</h1>
	</c:if>
</table>
	<hr>
	<c:if test="${viewList.memberTotalCount > 0}">
		<div class="paging">
			<c:forEach begin="1" end="${viewList.pageTotalCount}" var="num">
				<a class="${viewList.currentPageNumber eq num? 'currentPage' : ''}" href="memberList.do?page=${num}">[ ${num} ]</a>
			</c:forEach>
		</div>
	</c:if>
</body>
</html>