<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  String name = request.getParameter("name")==null ? "" : request.getParameter("name");
  int kor = Integer.parseInt(request.getParameter("kor")==null ? "" : request.getParameter("kor"));
  int eng = Integer.parseInt(request.getParameter("eng")==null ? "" : request.getParameter("eng"));
  int met = Integer.parseInt(request.getParameter("met")==null ? "" : request.getParameter("met"));
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>총점 학점 평균</title>
    <style>
    body {
      text-align: center;
    }
      .content {
      width : 200px;
      height : 350px;
      margin: 0 auto;
      padding: 30px;
      background-color: #9966cc;
      }
    </style>
</head>
<body>
<jsp:useBean id="vo" class="T0919.HomeworkVo_0919"></jsp:useBean>
<jsp:useBean id="cal" class="T0919.HomeworkCal_0919"/>
<%
  vo.setName(name);
  vo.setKor(kor);
  vo.setEng(eng);
  vo.setMet(met);
  int tot = cal.total(vo.getKor(), vo.getEng(), vo.getMet());
  double avg = cal.average(tot);
  String hak = cal.hakjum(avg);
%>
<div class="content">
  <p>성명 : <%=vo.getName() %></p>
  <p>국어 : <%=vo.getKor() %></p>
  <p>영어 : <%=vo.getEng() %></p>
  <p>수학 : <%=vo.getMet() %></p>
  <p>총점 : <%=tot%></p>
  <p>평균 : <%=avg%></p>
  <p>학점 : <%=hak%></p>
  <p><a href="homework_0919.jsp">돌아가기</a></p>
</div>
</body>
</html>