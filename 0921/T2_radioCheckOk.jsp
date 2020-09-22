<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- T2_radioCheckOk.jsp -->
<%
  request.setCharacterEncoding("utf-8");

  String gender = request.getParameter("gender");
  String pwd = request.getParameter("pwd") == null ? "" : request.getParameter("pwd");
  
  out.println("선택하신 성별은? " + gender + "<br/>");
  out.println("입력한 비밀번호는? " + pwd + "<br/>");
  
  out.println("<a href='T2_radioCheck.jsp'>돌아가기</a>");
%>