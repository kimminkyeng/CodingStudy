<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
  String mid = request.getParameter("mid");
  String pwd = request.getParameter("pwd");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test6Res.jsp</title>
</head>
<body>
  <hr/>
  <h2>이곳은 test6Res.jsp입니다.</h2>
  <p>앞에서 넘어온 아이디는 : <%=mid %></p>
  <p>앞에서 넘어온 비밀번호는 : <%=pwd %></p>
  <hr/>
</body>
</html>