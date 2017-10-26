<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>게시판</title>
</head>
<body>
<h2>글 목록TEST6123</h2>
<table style="border: 1px solid #ccc">
    <colgroup>
        <col width="10%" />
        <col width="15%" />
        <col width="20%" />
    </colgroup>
    <thead>
    <tr>
        <th scope="col">글번호</th>
        <th scope="col">제목</th>
        <th scope="col">작성자</th>
        <th scope="col"></th>
    </tr>
    </thead>
    <tbody>

    <c:forEach var="list" items="${boardList}">
        <tr>
            <td align="center">${list.idx}</td>
            <td align="center">${list.title}</td>
            <td align="center">${list.content}</td>
            <td align="center"><a onclick="return Delete()">글삭제</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<button type="button" onclick="onWrite()" class="btn btn-primary">글쓰기</button>
</body>
</html>