<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("utf-8");
  /* 
  String hakbun = request.getParameter("hakbun");
  String name = request.getParameter("name");
  int kor = Integer.parseInt(request.getParameter("kor"));
  int eng = Integer.parseInt(request.getParameter("eng"));
  int mat = Integer.parseInt(request.getParameter("mat"));
   */
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>t1_sungjukOk.jsp</title>
</head>
<body>
  <h2>성적 결과 조회</h2>
  <jsp:useBean id="vo" class="T0921.T1_sungjukVo"/>
  <jsp:setProperty name="vo" property="*"/>
  <%-- <jsp:setProperty name="vo" property="hakbun" value="<%=hakbun %>"/>
  <jsp:setProperty name="vo" property="name" value="<%=name %>"/>
  <jsp:setProperty name="vo" property="kor" value="<%=kor %>"/>
  <jsp:setProperty name="vo" property="eng" value="<%=eng %>"/>
  <jsp:setProperty name="vo" property="mat" value="<%=mat %>"/> --%>
  <%
  /*
  vo.setName(name);
  vo.setHakbun(hakbun);
  vo.setKor(kor);
  vo.setEng(eng);
  vo.setMat(mat);
  */
  %>
  <%-- <p>성명 : <%=vo.getName() %></p> --%>
  <%-- <p>학번 : <%=vo.getHakbun() %></p>
  <p>국어 : <%=vo.getKor() %></p>
  <p>영어 : <%=vo.getEng() %></p>
  <p>수학 : <%=vo.getMat() %></p>
  <p>총점 : <%=vo.getTot() %></p>
  <p>평균 : <%=vo.getAvg() %></p>
  <p>학점 : <%=vo.getGrade() %></p> --%>
  <p>성명 : <jsp:getProperty name="vo" property="name"/></p>
  <p>학번 : <jsp:getProperty name="vo" property="hakbun"/></p>
  <p>국어 : <jsp:getProperty name="vo" property="kor"/></p>
  <p>영어 : <jsp:getProperty name="vo" property="eng"/></p>
  <p>수학 : <jsp:getProperty name="vo" property="mat"/></p>
  <p>총점 : <jsp:getProperty name="vo" property="tot"/></p>
  <p>평균 : <jsp:getProperty name="vo" property="avg"/></p>
  <p>학점 : <jsp:getProperty name="vo" property="grade"/></p>
  <hr/>
  <p><a href="T1_sungjuk.jsp">돌아가기</a></p>
</body>
</html>