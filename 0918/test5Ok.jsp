<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- test5Ok.jps --%>
<%
String mid = request.getParameter("mid") ==null? "" : request.getParameter("mid");
String pwd = request.getParameter("pwd") ==null? "" : request.getParameter("pwd");

    if(mid.equals("admin")){
    out.println("아이디는? " + mid);
    }
    else{
    out.println("비밀번호는? " + pwd);
    }
    
    out.println("<p><a href = 'test5.jsp'>돌아가기</a></p>");
%>