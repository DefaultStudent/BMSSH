<%@ page language="java"   import="java.util.*"  pageEncoding="utf-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<% 
	    request.setCharacterEncoding("utf-8"); 
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>显示图书信息</title>
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
          <td height="22" valign="top" class="word_orange">当前位置：系统设置 &gt; 图书信息设置 &gt;&gt;&gt;</td>
      </tr>
      <tr>
        <td height="273" align="center" valign="top">
          <table width="100%"  border="0" cellspacing="0" cellpadding="0">
            <tr>
           <td><a href="ba" >添加图书信息</a> </td>
         
          </tr>
          </table>

  <table width="100%"  border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#F6B83B" bordercolorlight="#FFFFFF">
  <tr align="center" bgcolor="#e3F4F7">
  <td width="5%"    bgcolor="#F9D16B" >图书编号</td>
    <td width="10%" bgcolor="#F9D16B">图书名称</td>
    <td width="10%" bgcolor="#F9D16B">图书类型</td>
    <td width="10%" bgcolor="#F9D16B">作者</td>
    <td width="10%" bgcolor="#F9D16B">出版社</td>
    <td width="10%" bgcolor="#F9D16B">ISBN</td>
    <td width="10%" bgcolor="#F9D16B">价格</td>
    <td width="5%" bgcolor="#F9D16B">修改</td>
    <td width="5%" bgcolor="#F9D16B">删除</td>
  </tr>
  <s:iterator var="bookinfo" value="#session.bookinfo">
  <tr>
  <td style="padding:5px;">
  <s:property value="#bookinfo.bookid"/>
  </td>
   <td style="padding:5px;">
   <s:property value="#bookinfo.bookname"/>
   </td>
    <td style="padding:5px;">
    <s:property value="#bookinfo.booktypename"/>
    </td>
    <td style="padding:5px;">
    <s:property value="#bookinfo.author"/>
    </td>
    <td style="padding:5px;">
    <s:property value="#bookinfo.pubname"/>
    </td>
    <td style="padding:5px;">
    <s:property value="#bookinfo.isbn"/>
    </td>
    <td style="padding:5px;">
     <s:property value="#bookinfo.price"/>
    </td>


   
     <td align="center"><s:a href="BookInfo_findOne?bookid=%{#bookinfo.bookid}">修改</s:a></td>
    <td align="center"><a href="*******" >删除</a></td> 
 
  </tr>
  </s:iterator>
  
<%
 
%>  
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
