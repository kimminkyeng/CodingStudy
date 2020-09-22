<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String sw = request.getParameter("sw") == null ? "" : request.getParameter("sw");
 %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
    #content {
    text-align: center;
    height : 500px;
    }
    </style>
</head>
<body>
<!-- 헤더파일 인크루드 -->
<%@ include file="test3_H.jsp" %>

<!-- 본문영역 -->
<div id="content">
<% if(sw.equals("H")) { %>
     <h2>이곳은 홈 입니다.</h2>
     <hr width=70%/>
     <p><img src="../images/비빔밥.jpg" width="200px"/></p>
     <hr width=70%/>
<% } else if(sw.equals("b")) { %>
     <h2>이곳은 게시판 입니다.</h2>
     <hr width=70%/>
     <p><img src="../images/꼬치.jpg" width="200px"/></p>
     <hr width=70%/>
<% } else if(sw.equals("g")) { %>
     <h2>이곳은 방명록 입니다.</h2>
     <hr width=70%/>
     <p><img src="../images/아이스크림.jpg" width="200px"/></p>
     <hr width=70%/>
<% }else if(sw.equals("p")) { %>
     <h2>이곳은 자료실 입니다.</h2>
     <hr width=70%/>
     <p><img src="../images/냉면.jpg" width="200px"/></p>
     <hr width=70%/>
<% }else { %>
     <h2>이곳은 사이트맵 입니다.</h2>
     <hr width=70%/>
     <p><img src="../images/블루베리잼.jpg" width="200px"/></p>
     <hr width=70%/>
<% } %>
</div>
<!-- 푸터파일 인크루드 -->
<%@ include file="test3_F.jsp" %>
</body>
</html>