<% 
	
	String uid = request.getParameter("userId");
	String upw = request.getParameter("userPw");
	
	/* MemberInfo minfo = new MemberInfo(uid, upw); */
	
%>
<jsp:forward page="loginForm"></jsp:forward>