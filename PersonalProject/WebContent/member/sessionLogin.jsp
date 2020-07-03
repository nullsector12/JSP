<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	// post 전송 데이터  한글 처리	
	request.setCharacterEncoding("utf-8"); 
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String idCheck = request.getParameter("loginCheck");
	
	String testId = "test11"; // 아이디 test11
	String testPw = "1111"; // 비밀번호 1111
	String testName = "테스트"; // 회원이름 테스트
	
	if(testId.equals(id)){
		if(testPw.equals(pw)){
			// 로그인 확인 : 세션에 정보 저장
			session.setAttribute("id", id);
			session.setAttribute("pw", pw);
			
			// 로그인 유지 체크박스 체크여부 확인
			if(idCheck != null) { // 체크박스 체크했을 경우
				Cookie c = new Cookie("id", id);
				c.setMaxAge(60*2);
				/* c.setPath("/"); */
				response.addCookie(c);
			} // 쿠키 저장 if문 끝
%>   
<script> 
	alert("환영합니다.");
	location.href="LoginMainPage.jsp" // 쿠키정보도 같이 넘겨줌
</script> 
<%
	// 비밀번호 틀렸을 때
	} else { // 비밀번호 체크 if문의 else
%>
<script>
	alert("비밀번호가 틀렸습니다.");
	location.href="sessionLoginForm.jsp"
</script>
<% 
	} //비밀번호 체크 if문 끝
	// 아이디 틀렸을 때	
} else { // 아이디 체크 if문의 else 
%>
<script>
	alert("아이디가 다릅니다.");
	location.href="sessionLoginForm.jsp"
</script>
<%	} // 아이디 체크 if문 끝 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>