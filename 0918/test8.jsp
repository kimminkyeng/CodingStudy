<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("utf-8");
  String name="홍길동";
  int age = 25;
  String mid = "hkd1234";
  String pwd = "1234";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test8.jsp(값의 보관/확인)</title>
</head>
<body>
<h2>vo에 값 저장</h2>
<!-- 클래스 연동  -->
<jsp:useBean id="vo" class="T0918.Test8Vo"/>
<!-- vo에다 값 저장 -->
<jsp:setProperty property="name" name="vo" value="<%=name %>"/> <%-- setProperty : 값을 저장하는 액션태그. name="윗줄 class의 id" --%>
<jsp:setProperty property="age" name="vo" value="<%=age+1 %>"/>
<jsp:setProperty property="mid" name="vo" value="<%=mid %>"/>
<jsp:setProperty property="pwd" name="vo" value="<%=pwd %>"/>
<!-- 저장된 vo의 값을 읽어온다. -->
<jsp:getProperty property="name" name="vo"/><br/>
<jsp:getProperty property="age" name="vo"/><br/>
<jsp:getProperty property="mid" name="vo"/><br/>
<jsp:getProperty property="pwd" name="vo"/><br/>
</body>
</html>