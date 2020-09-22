<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test4Ok.jsp</title>
</head>
<body>
  <h2>get방식으로 전송되어온 결과는</h2>
  <p>아이디 : <font color="purple"><%=request.getParameter("mid") %></font></p>
  <p>비밀번호 : <font color="plum"><%=request.getParameter("pwd") %></font></p>
  <p><a href="test4.jsp">돌아가기</a></p>
</body>
</html>