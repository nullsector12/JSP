<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	function needlogin() {
		alert("로그인이 필요합니다.")
		location.href="<%= request.getContextPath() %>/member/sessionLoginForm.jsp";
	}
</script>    
<h1 id="header">Open Project</h1>
<ul id="nav">
	<li><a href="<%= request.getContextPath() %>/member/sessionLoginForm.jsp">로그인</a></li>
	<li><a id="needLogIn" href="javascript:needlogin()">마이페이지</a></li>
	<li><a href="<%= request.getContextPath() %>/guest/glist.jsp">방명록(비회원)</a></li>
	<li><a id="needLogIn" href="javascript:needlogin()">게시판(회원)</a></li>
</ul>
