<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test5.jsp</title>
    <script>
    function fCheck() {
		var mid = document.myform.mid.value;
		var pwd = document.myform.pwd.value;
		if(mid == "") {
			alert("아이디를 입력하세요!");
			myform.mid.focus();
		}
		else if(pwd == ""){
			alert("비밀번호를 입력하세요!")
			myform.pwd.focus();
		}
		else{
			myform.submit();
		}
	}
    </script>
    <style>
    #content {
    margin : 0 auto;
      pddding: 30px;
      width  : 400px;
      height : 300px;
      background-color: #ddd;
    }
    </style>
</head>
<body>
<div id="content">
  <h2>이곳은 test5.jsp</h2>
  <form name="myform" method="post" action="test5Check2.jsp">
  <p>아이디 : <input type="text" name="mid"/></p>
  <p>비밀번호 : <input type="password" name="pwd"/></p>
  <p><input type="button" value="전송" onclick="fCheck()"/></a></p>
  </form>
</div>  
</body>
</html>