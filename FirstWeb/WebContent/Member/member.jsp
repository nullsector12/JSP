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
        <h1>회원관리 프로그램</h1>
    </header>
    <div id="content">
        <div id="reg">
            <h2 class="title">회원 저장</h2>
            <form action="memberResult.jsp" method="post">
	            <label>아이디</label>
	            <input type="text" name="uid" placeholder="아이디" required>
	            <label>비밀번호</label>
	            <input type="password" name="pw" placeholder="비밀번호" required>
	            <label>이름</label>
	            <input type="text" name="uname" placeholder="이름" required>
	            <input type="submit" value="저장">
            </form>
		</div>
	</div>
</body>
</html>