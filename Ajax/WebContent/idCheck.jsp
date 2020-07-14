<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 웹페이지 맨 윗줄 공백을 없애기 위한 trim 메서드 -->
<%@ page trimDirectiveWhitespaces="true" %>
<%
	String uid = request.getParameter("uid");
	
	if(uid != null && uid.equals("test")) {
		out.print("Y");
	} else {
		out.print("N");
	}

%>