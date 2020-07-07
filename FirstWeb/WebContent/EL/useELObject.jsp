<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setAttribute("name", "쏜"); %>
<% request.setAttribute("age", 20); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${10+31} , ${21-10} , ${30*20} , ${50/10} , ${50%10}</h1>
	<%-- <h1>${10 == 1}, ${10 eq 1 }, ${10 ne 1}, ${10 lt 1 }, ${10 gt 1 }, ${10 le 1 }, ${10 ge 1 }, ${10 ne 1 ? '같지않다' : '같다'}</h1> --%>
	<h1>${name eq '쏜' ? 'Top Class' : 'Other Player'}</h1>
	<h1>${age > 19 ? '입장 가능' : '입장 불가'}</h1>

	<h1>요청 URI : <%= request.getRequestURI() %></h1>
	<h1>요청 URI : ${pageContext.request.requestURI}</h1>
	<%-- <% pageContext.getRequest(); %> --%>
	<h1>request 속성에 저장된 name : <%= request.getAttribute("name") %></h1>
	<h1>request 속성에 저장된 name : ${requestScope.name}</h1>
	<h1>request 속성에 저장된 name : ${name}</h1> 
							<!-- (영역.)속성의 이름/ 영역지정을 생략하고 속성 이름만 줄 경우
								  pageScope -> requestScope -> sessionScope -> applicationScope 순서로 
								  생명 주기가 짧은 영역 순서로 내부에 저장된 속성 이름 검색
								  따라서 속성 이름이 중복되지 않도록 하는게 좋음-->
	<h1>파라미터 code 의 값 : <%= request.getParameter("code") %></h1>
	<h1>파라미터 code 의 값 : ${param.code}</h1>
	<h1>JSESSIONID 쿠키 값 : ${cookie.JSESSIONID.value}</h1>
								
</body>
</html>