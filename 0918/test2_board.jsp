<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test2_board.jsp</title>
    <style>
    body {
    margin : 0px;
    padding : 0px;
    }
    #content {
    width : 100%;
    height : 400px;
    background-color : #99ff66;
    }
    </style>
</head>
<body>
<%@ include file="test2_H.jsp" %>
  <div id="content">
  <h2>이곳은 본문 영역입니다.</h2>
  </div>
<%@ include file="test2_F.jsp" %>
</body>
</html>