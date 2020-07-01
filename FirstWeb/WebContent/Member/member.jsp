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
 <header>
        <h1>회원가입 페이지</h1>
    </header>
    <div id="content">
        <div id="reg">
            <h2 class="title">회원 저장</h2>
            <form action="memberExam.jsp" method="post">
	            <label>아이디</label>
	            <input type="text" name="userId" placeholder="아이디" required>
	            <label>비밀번호</label>
	            <input type="password" name="userPw" placeholder="비밀번호" required>
	            <label>이름</label>
	            <input type="text" name="userName" placeholder="이름" required>
	            <input type="submit" value="저장">
            </form>
		</div>
	</div>
</body>
</html>