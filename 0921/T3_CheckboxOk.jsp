<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- T3_checkboxOk.jsp --%>
<%
  request.setCharacterEncoding("utf-8");

  String name = request.getParameter("name")==null ? "" : request.getParameter("name");
  /* String language = request.getParameterValues("language")==null ? "" : request.getParameter("language"); */
  String[] Language = request.getParameterValues("Language"); //배열 ('Values'는 배열처리해야됨)
  String otherLang = request.getParameter("otherLang")==null ? "" : request.getParameter("otherLang");
  
  //성명 처리
  if(name.trim().length() <= 0) {
    out.println("<script>");
    out.println("alert('성명을 입력하세요!');");
    out.println("history.back();");
    out.println("</script>");
    return;
  }
  else if(Language == null) {
	  out.println("<script>");
	  out.println("alert('사용 가능언어를 선택하세요!');");
	  out.println("history.back();");
	  out.println("</script>");
  }
  else {
   out.println("<p>성명 : "+ name + "</p>");
   String strLang = "";
   for(String lang : Language) {
     strLang+= lang + "/";
   }
   strLang += otherLang;
   out.println("<p>사용가능언어 : " + strLang+ "</p>");
   out.println("<p><a href='Checkbox.jsp'>돌아가기</a></p>");
  }
  
  // 사용가능언어 처리
  
%>
