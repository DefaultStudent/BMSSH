<%@ page language="java" import="java.util.*" pageEncoding="GB18030" contentType="text/html; charset=gb2312"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@page import="factory0318.DAOFactory"%>
<% 
	    request.setCharacterEncoding("gb2312"); 
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <link href="CSS/style.css" rel="stylesheet">   
    <title>ͼ�鵵���޸�</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <%@include file="banner.jsp"%>
   <%@include file="navigation.jsp"%>
  
  <table width="778"  border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td valign="top" bgcolor="#FFFFFF"><table width="99%" height="510"  border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" class="tableBorder_gray">
  <tr>
    <td height="510" valign="top" style="padding:5px;"><table width="98%" height="487"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td height="22" valign="top" class="word_orange">��ǰλ�ã�ͼ����� &gt; ͼ����Ϣ���� &gt; �޸�ͼ����Ϣ &gt;&gt;&gt;</td>
      </tr>
      <tr>
         <td align="center" valign="top"><table width="100%" height="493"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center" valign="top">
	<s:form name="form1" method="post" action="BookInfo_update">
	<table width="600" height="432"  border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
      <tr>
        <td align="center">
           <s:hidden name="bookinfo.bookid" value="%{#session.bookid}"></s:hidden>
          <s:textfield label="ͼ������" name="bookinfo.bookname" value="%{#session.bookname}"></s:textfield>* 
        </td>
      </tr>
      <tr>
        <td>
        <s:select label="ͼ������" list="#session.bt" name="bookinfo.booktypename" value="%{#session.booktypename}"></s:select>
        </td>
      </tr>
      <tr>
        <td>
        <s:textfield label="����" name="bookinfo.author" value="%{#session.author}"></s:textfield>
        </td>
      </tr>
      <tr>
        <td>
        <s:textfield label="������" name="bookinfo.pubname" value="%{#session.pubname}"></s:textfield>
          </td>
      </tr>
       <tr>
        <td>
        <s:textfield label="ISBN" name="bookinfo.isbn" value="%{#session.isbn}"></s:textfield>
        </td>
      </tr>
      
      <tr>
        <td><s:textfield label="�۸�" name="bookinfo.price" value="%{#session.price}"></s:textfield></td>
      </tr>
 
      <tr>
        <td align="center">&nbsp;</td>
        <td><input name="Submit" type="submit" class="btn_grey" value="����" onClick="return check(form1)">
        &nbsp;
       <input name="Submit2" type="button" class="btn_grey" value="����" onClick="history.back()"></td>
      </tr>
    </table>
	</s:form>
	</td>
  </tr>
</table></td>
      </tr>
    </table>
</td>
  </tr>
</table><%@ include file="copyright.jsp"%></td>
  </tr>
</table>
  </body>
</html>