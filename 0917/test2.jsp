<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test2.jsp</title>
</head>
<body>
    <h2>주석문 연습</h2>
    <p>1. 이곳은 본문입니다.</p>
    <!-- 1.1 이곳은 HTML 주석입니다. -->
    <p>2. 이곳은 본문입니다.</p>
    <%-- 이곳은 jsp 주석입니다. --%>
    <p>3.이곳은 본문입니다.</p>
    <%
      out.println("41. 이곳은 jsp 내부입니다.<br/>");
    // 이곳은 jsp 안의 java 주석입니다.
    /* 이곳도 jsp 안의 java 주석입니다.*/
    out.println("42. 이곳은 jsp 내부입니다.<br/>");
    %>
    <p>4.이곳은 본문입니다.</p>
    <!-- 4-1. 이곳도 HTML 주석입니다. -->
</body>
</html>