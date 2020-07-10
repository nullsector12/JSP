<%@page import="guestBook.service.WriteMessageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="requestMessage" class="guestBook.model.Message" scope="request"/>
<jsp:setProperty property="*" name="requestMessage"/>
<%
	WriteMessageService writeService = WriteMessageService.getInstance();

	int result = writeService.writeMessage(requestMessage);

	request.setAttribute("writeResult", result);
%>

<jsp:forward page="messageWrite_View.jsp"/>