<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Test1.jsp</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script>
    	$(document).ready(function() {
    		$("#btnSubmit").click(function() {
    		if($("#hakbun").val() == "") {
    			alert("학번을 입력하세요!");
    			$("#hakbun").focus();
    		}
    		// 성명, 국어, 영어, 수학 체크
    		else {
    			$("form").submit();
    		  }
    		});
    	});
    </script>
</head>
<body>
  <h2>성적 등록</h2>
  <form name="myform" method="get" action="t1_sungjukOk.jsp">
    <p><label for="hakbun">학번</label> : <input type="text" name="hakbun" id="hakbun"/></p>
    <p><label for="name">성명</label> : <input type="text" name="name" id="name"/></p>
    <p><label for="kor">국어</label> : <input type="text" name="kor" id="kor"/></p>
    <p><label for="eng">영어</label> : <input type="text" name="eng" id="eng"/></p>
    <p><label for="mat">수학</label> : <input type="text" name="mat" id="mat"/></p>
    <p>
      <input type="submit" value="전송" id="btnSubmit"/>
      <input type="reset" value="다시입력"/>
    </p>
  </form>
</body>
</html>