<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>선택한 상품 : ${param.select}</h1>
	<h1>${product.productList[0]}</h1>
	<h1>num1 + num2 = ${product.getNum1() + product.getNum2()}</h1>
	<h1>${product.getCheck()}</h1>
</body>
</html>