<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <!-- t4_comboCheckOk.jsp -->
<%
  request.setCharacterEncoding("UTF-8");

  String sports = request.getParameter("sports");
  String othersports = request.getParameter("othersports")==null ? "" : request.getParameter("othersports");
  
  out.println("<p>좋아하는 스포츠는 : " + sports);
  if(sports.equals("기타")) {
    if(othersports.trim().length() <=0) {
    	out.println("<script>");
        out.println("alert('기타를 선택하셨으면 입력란에 직접 입력해 주세요!');");
        out.println("history.back();");
        out.println("</script>");
        return;
    }
    else {
     out.println(" - " + othersports);
    }
  }
  out.println("</p>");
  out.println("<p><a href='t4_comboCheck.jsp'>돌아가기</p>");
%>