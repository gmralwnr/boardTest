<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
/*function passCheck(){
	if(document.frm.pass.value=length==0)
}*/
</script>
</head>
<body>
<div align="center">
<h1>비밀번호 확인</h1>
<form action="boardEdit" name="frm" method="get">
<input type="hidden" name="num" value="${num}">
<input type="password" name ="pwd" size="20">
 <input type="submit" value="확인" Onclick="return passCheck()">
 <br><br>${message}
</form></div>
</body>
</html>