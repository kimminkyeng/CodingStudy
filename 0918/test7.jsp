<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test7.jsp(메소드 연습)</title>
</head>
<body>
<h2>3제곱 값 구하기</h2>
<jsp:useBean id="calc" class="T0918.Calculator"/> <!-- 'Calculator calc = new Calculator 와 같다.' -->
<p>5의 3제곱은? <%=calc.process(5) %></p>
</body>
</html>