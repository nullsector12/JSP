<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="product" class="model.Product" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품 선택</h1>
	<form action="productSelect.jsp" method="post">
		<select name="select">
		<%  
			for(String item : product.getProductList()) {
				out.println("<option value="+item+">"+item+"</option>");
			};
		%>
		</select>
		<input type="submit" value="선택 완료">
	</form>

</body>
</html>