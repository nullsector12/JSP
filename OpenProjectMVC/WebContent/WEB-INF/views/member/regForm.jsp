<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<% 
	
%>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="http://code.jquery.com/jquery-1.12.4.js"></script>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/default.css" />
<style>
	.check_ok {
		color: blue;
	}
	
	.check_not {
	 	color: red;
	}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	
	<div>
		<h1 class="subtitle">회원가입</h1>
		
		<hr>
		
		<form action="memberReg.do" method="post" enctype="multipart/form-data">			
			<table>
				<tr>
					<td> 아이디 (이메일) </td>
					<td><input type="email" name="uid" id="uid" value="아이디 입력">
					<span id="checkid"></span>
					<input type="checkbox" id="idchk">
					</td>
				</tr>
				<tr>
					<td> 비밀번호 </td>
					<td><input type="password" name="upw" value="비밀번호 입력">
					</td>
				</tr>
				<tr>
					<td> 이름 </td>
					<td><input type="text" name="uname" value="사용자 이름">
					</td>
				</tr>
				<tr>
					<td> 사진 등록 </td>
					<td> <input type="file" name="uphoto"> </td>
				</tr>
				<tr>
					<td> <input type="reset" name="reset" value="다시 작성"> </td>
					<td> <input type="submit" name="submit" value="가입"> </td>
				</tr>
			</table>
		
		</form>
	</div>
	
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
<script>

	$(document).ready(function (){
		
		$('#uid').focusin(function() {
			
			$(this).val('');
			$('#idchk').prop('checked', false);
			
			
			$('#checkid').text('');
			$('#checkid').removeClass('check_ok');
			$('#checkid').removeClass('check_not');
			
		});
		
		
		$('#uid').focusout(function(){
			
			if($(this).val().length < 1 ){
				$('#checkid').text("아이디를 입력해주세요.");
				$('#checkid').addClass('check_not');
				return false;
			}
		
		
			// 비동기 통신
			$.ajax({
				
				url : 'idCheck.do',
				data : { uid : $(this).val()},
				success : function(data) {
					if(data == 'Y'){
						$('#checkid').text("사용가능한 아이디 입니다.");
						$('#checkid').addClass('check_ok');
						$('#idchk').prop('checked', true);
					}else {
						$('#checkid').text("중복된 아이디가 존재합니다.");
						$('#checkid').addClass('check_not');
						$('#idchk').prop('checked', false);
					}
				} 
				
			});
			
		});
	
	});
</script>



