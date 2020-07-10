<%@page import="guestBook.service.DeleteMessageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String upw = request.getParameter("upw");
	
	int mid = Integer.parseInt(request.getParameter("mid"));
	
	DeleteMessageService service = DeleteMessageService.getInstance();
	int resultCnt = service.deleteMessage(mid, upw);
	
	request.setAttribute("resultCode", resultCnt);

%>

<jsp:forward page="deleteMessgeView.jsp"/>