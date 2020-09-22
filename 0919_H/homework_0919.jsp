<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>HW_0919</title>
    <style>
    body {
    text-align: center;
    }
    .content {
        width: 200px;
        height: 350px;
        margin: 0 auto;
        padding: 30px;
        background-color: #9966ff;
     }
     .aa1 {
        padding: 30px, 60px;
     }
    </style>
</head>
<body>
<div class="content">
<h2>성적(값전달 숙제)</h2>
<form name="myform" method="post" action="homework_0919_1.jsp">
  <p>성명 : <input type="text" name="name"/></p>
  <p>국어 : <input type="text" name="kor"/></p>
  <p>영어 : <input type="text" name="eng"/></p>
  <p>수학 : <input type="text" name="met"/></p>
  <p class="aa1">
    <input type="submit" value="전송"/>
    <input type="reset" value="다시입력"/>
  </p>
</form>  
</div>
</body>
</html>