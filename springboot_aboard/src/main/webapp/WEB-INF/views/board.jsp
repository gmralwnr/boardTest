<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>

<tr><th>번호</th><th>제목</th><th>작성자</th><th>작성일</th></tr>


<c:forEach var ="board" items="${boardList}">
<tr><td>${board.num}</td><td><a href="boardDetail?num=${board.num }">${board.title}</a></td><td>${board.userid}</td>
<td>${board.writedate}</td>
</c:forEach>
<tr>
</table>

</body>
</html>