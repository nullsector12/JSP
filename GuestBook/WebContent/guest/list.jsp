<%@page import="guestBook.model.MessageListView"%>
<%@page import="guestBook.service.GetMessageListService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	
	int pageNum = 1;

	String pageNumber = request.getParameter("page");
	if (pageNumber != null ) {
		pageNum = Integer.parseInt(pageNumber);
	}
	
	
	GetMessageListService service = GetMessageListService.getInstance();
	
	MessageListView view = service.getMessageList(pageNum);	
	
	request.setAttribute("listView", view);
%>

<jsp:forward page="list_view.jsp"></jsp:forward>