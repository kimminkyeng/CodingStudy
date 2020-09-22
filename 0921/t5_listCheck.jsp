<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>t5_listCheck.jsp</title>
    <script>
     function fCheck() {
    	 var sports = myform.sports.value;
    	 var othersports = myform.othersports.value;
    	 if(sports == ""){
    		 alert("좋아하는 운동을 선택하세요!");
    	 }
    	 else if(sports == "기타" && othersports == "") {
    		 alert("기타종목을 적어주세요!");
    		 myform.othersports.focus();
    	 }
    	 else{
    		 myform.submit();
    	 }
     }
    </script>
</head>
<body>
<form name="myform" method="post" action="t5_listCheckOk.jsp">
  <h2>리스트박스 체크</h2>
    <p>좋아하는 운동은?
      <select name="sports" size=5 multiple>
        <option value="축구">축구</option>
        <option value="야구">야구</option>
        <option value="배구">배구</option>
        <option value="농구">농구</option>
        <option value="족구">족구</option>
        <option value="탁구">탁구</option>
        <option value="정구">정구</option>
        <option value="기타">기타</option>
      </select>
      - 기타 : <input type="text" name="othersports"/>
    </p>
    <p>
      <input type="button" value="전송" onclick="fCheck()"/>
      <input type="reset" value="취소"/>
    </p>
</form>
</body>
</html>