<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/script/board.js"></script>
</head>
<body>


<table>
<tr><th>번호</th><th>작성일자</th><th>제목</th><th>내용</th>
<th>작성자</th></tr>


<tr><td>${board.num }</td><td>${board.writedate}</td>
<td>${board.title}</td><td>${board.content}</td>
<td>${board.userid }</td></tr>


</table>
<input type="button" value="게시글 리스트" onclick="location.href='board'">
<input type="button" value="게시글 수정하기" onclick="open_win('boardEditForm?num=${board.num}','update')">
<input type="button" value="게시글 삭제하기" onclick="location.href='boardDelete'">

</body>
</html>