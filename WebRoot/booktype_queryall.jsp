<%@ page language="java" import="java.util.*" pageEncoding="GB18030" contentType="text/html; charset=gb18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<% 
	    request.setCharacterEncoding("gb2312"); 
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>显示图书类型</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link href="CSS/style.css" rel="stylesheet">
  </head>
  
  <body>
     <%@include file="banner.jsp" %>
     <%@include file="navigation.jsp" %>
     <table width="778"  border="0" cellspacing="0" cellpadding="0" align="center">
      <tr>
         <td height="385" valign="top" bgcolor="#FFFFFF"><table width="99%" height="341"  border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" class="tableBorder_gray">
       <tr>
         <td height="341" valign="top" style="padding:5px;"><table width="98%" height="295"  border="0" cellpadding="0" cellspacing="0">
      <tr>
          <td height="22" valign="top" class="word_orange">当前位置：图书管理信息 &gt; 图书类型设置 &gt;&gt;&gt;</td>
      </tr>
      <tr>
        <td height="273" align="center" valign="top">
          <table width="100%"  border="0" cellspacing="0" cellpadding="0">
            <tr>
           <td><a href="booktype_add.jsp" >添加图书类型信息</a> </td>
         
          </tr>
          </table>
 
  <table width="91%"  border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#F6B83B" bordercolorlight="#FFFFFF">
  <tr align="center" bgcolor="#e3F4F7">
    <td width="30%" bgcolor="#F9D16B">图书类型编号</td>
    <td width="40%" bgcolor="#F9D16B">图书类型名称</td>
    <td width="16%" bgcolor="#F9D16B">修改</td>
    <td width="14%" bgcolor="#F9D16B">删除</td>
  </tr>
  <s:iterator var="booktype" value="#session.booktype">
   <tr>
   <td style="padding:5px;">
       <s:property value="#booktype.booktypeid"/>
   </td>
    <td style="padding:5px;">
       <s:property value="#booktype.booktypename"/>
    </td>
    <td align="center"><s:a href="BookType_findOne?booktypeid=%{#booktype.booktypeid}">修改</s:a></td>
    <td align="center"><s:a href="BookType_delete?booktypeid=%{#booktype.booktypeid}">删除</s:a></td> 
  </tr>
  </s:iterator>
  



 </table>
</td>
      </tr>
    </table>
</td>
  </tr>
</table><%@ include file="copyright.jsp"%></td>
  </tr>
</table>
  </body>
</html>
