<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test2_H.jsp(header)</title>
    <style>
    body {
    margin : 0px;
    padding : 0px;
    }
    .menu {
    width : 100%;
    height:180px;
    padding : 0px;
    text-align:center;
    background-color:pink;
    }
    a {text-decoration: none}
    a:hover {
    text-decoration: underline;
    color: red;
    background-color : plum;
    }
    </style>
</head>
<body>
<div class="menu">
  <h3>이곳은 헤더 영역입니다.</h3>
  <p>
  <a href="test2_main.jsp">홈으로</a> |
  <a href="test2_board.jsp">게시판</a> |
  <a href="test2_guest.jsp">방명록</a> |
  <a href="test2_pds.jsp">자료실</a> |
  <a href="test2_sitemap.jsp">사이트맵</a>
  </p>
</div>
</body>
</html>