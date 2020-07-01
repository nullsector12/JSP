<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>requestResult에서 forward2로 전송 확인</title>
</head>
<body>
		<table border="1">
		<tr>
			<td>이름</td>
			<td><%= request.getParameter("username") %></td>
		</tr>
		<tr>
			<td>직업</td>
			<td><%= request.getParameter("job") %></td>
		</tr>
		<tr>
			<td>관심사</td>
			<td>
				<%
					String[] likes = request.getParameterValues("like");
					
					for (int i= 0; i < likes.length; i++){
						out.println(likes[i]+"<br>");
					}
				%>
			</td>
			<%-- <td><%= request.getParameter("like") %></td> --%>
		</tr>
		<tr>
			<td>요청 메서드</td>
			<td><%= request.getMethod() %></td>
		</tr>
		<tr>
			<td>쿠키</td>
			<td>
				<% 
					Cookie cookie[] = request.getCookies();
					
					for(int i = 0; i < cookie.length; i++)
						out.println("쿠키 이름 : "+cookie[i].getName() + " 에 설정된 쿠키값 : " + cookie[i].getValue());
				%>
			</td>
		</tr>
		<tr>
			<td>프로토콜</td>
			<td> <%= request.getProtocol() %> </td>
		</tr>
	</table>
</body>
</html>