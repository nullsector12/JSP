<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- useBean action태그  -->
<!--id = 식별자 지정 / class = 객체생성된 패키지/파일 탐색 / scope = 속성을 사용할 범위지정 default값은 page (page, request, session, application)  -->
<!-- 지정된  속성에 객체의 정보를 저장/사용 -->
<jsp:useBean id="memberInfo" class="model.LoginInfo" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		memberInfo.setUid("hot");
		memberInfo.setName("겨울");
	%>
	
	<h1><%= memberInfo %></h1>
</body>
</html>