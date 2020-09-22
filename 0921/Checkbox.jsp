<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Checkbox.jsp</title>
</head>
<body>
  <h2>체크박스를 이용한 값의 전송</h2>
  <form name="myform" method="post" action="T3_CheckboxOk.jsp">
    <p>이름 : <input type="text" name="name"/></p>
    <p>
      - 사용가능한 컴퓨터 언어는?(스크립트 언어 포함)<br/>
      <input type="checkbox" name="Language" value="JAVA"/> JAVA
      <input type="checkbox" name="Language" value="Database"/> Database
      <input type="checkbox" name="Language" value="HTML5"/> HTML5 
      <input type="checkbox" name="Language" value="CSS3"/> CSS3
      <input type="checkbox" name="Language" value="JavaScript"/> JavaScript
      <input type="checkbox" name="Language" value="jQuery"/> jQuery
      <input type="checkbox" name="Language" value="aJax"/> aJax
      <input type="checkbox" name="Language" value="JSP"/> JSP
      <input type="checkbox" name="Language" value="SpringFrame work"/> SpringFrame work
      <input type="checkbox" name="Language" value="Python"/> Python
    </p>
    <p>
       - 기타 가능언어: <input type="text" name="otherLang">
    </p>
    <p>
      <input type="submit" value="전송"/>
      <input type="reset" value="취소"/>
    </p>
  </form>
</body>
</html>