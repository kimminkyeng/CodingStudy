<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <!-- t5_listCheckOk.jsp -->
<%
  request.setCharacterEncoding("UTF-8");

  String[] sports = request.getParameterValues("sports");
  String othersports = request.getParameter("othersports")==null ? "" : request.getParameter("othersports");
  String strText = "";
  
  if(sports != null) {
    for(String str : sports) {
      strText += str + "/";
      if(str.equals("기타")){
       strText += othersports; 
      }
    }
   }
  out.println("<p>좋아하는 스포츠는 : " + strText + "</p>");
  out.println("<p><a href='t4_comboCheck.jsp'>돌아가기</p>");
%>