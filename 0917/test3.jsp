<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test3.jsp</title>
</head>
<body>
<%-- '지시자(Directive)'는 '@'로 시작 --%>
<%-- '선언문(Declaration)'은 '<%! ~ %>'로 표현 --%>
<%-- '스클립틀릿(scriptlet)'은 '<% ~ %>'로 표현 --%>
<%-- '표현식(Expression)'은 '<%= ~ %>' --%>
<h2>선언문</h2>
<%! 
  int su = 3;
  public String strLower(String str) {// '<%!'의 '!' 표시는 선언문 이라는 표시다.
   String res = null;
   res = str.toLowerCase();
   return res;
  }
%>
  <p>이곳은 본문(스클립틀릿 사용예)</p>
  <%
    for(int i=0; i<su; i++){
     out.println("<font color = 'red'>" + i + "</font><br/>"); 
    }
  %>
  <p>이곳도 본문(표현식 예)</p>
  <%="안녕 JSP<br/>" %>
  <%=strLower("Hello JSP") %> <%-- <- 바로 윗줄이나 이건 표현식. 표현식에는 ';'을 마지막에 붙이지 않는다. --%>
  <p>여기까지 본문입니다.</p>
</body>
</html>