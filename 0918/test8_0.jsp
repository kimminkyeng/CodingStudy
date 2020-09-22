<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test8_0.jsp</title>
</head>
<body>
<h2>값 전달 연습</h2>
<form name="myform" method="post" action="test8_1.jsp">
  <p>성명 : <input type="text" name="name"/></p>
  <p>나이 : <input type="text" name="age"/></p>
  <p>아이디 : <input type="text" name="mid" autofocus placeholder="아이디를 입력하세요"/></p>
  <p>비밀번호 : <input type="password" name="pwd" placeholder="비밀번호를 입력하세요"/></p>
  <p>
    <input type="submit" value="전송"/>
    <input type="reset" value="다시입력"/>
  </p>
</form>  
</body>
</html>