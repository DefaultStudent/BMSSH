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
  
  <%
      
      
  %>
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
	<form name="form1" method="post" action="">
	<table width="600" height="432"  border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
      <tr>
        <td align="center">ͼ�����ƣ�
           <input name="bookid" type="hidden" size="50" value="******">
        </td>
        <td height="39">
          <input name="bookname" type="text"  id="bookname"  size="60" value="*******" readonly>* 
        </td>
      </tr>
      <tr>
        <td align="center">ͼ�����ͣ�</td>
        <td><select name="booktypename"  >
	 
	              **********
	
             </select>
        </td>
      </tr>
      <tr>
        <td align="center">���ߣ�</td>
        <td><input name="author" type="text"  id="author" size="40"  value="*****"></td>
      </tr>
      <tr>
        <td align="center">�����磺</td>
        <td>
        <input name="pubname" type="text"  id="pubname" size="40"  value="*****">
          </td>
      </tr>
       <tr>
        <td align="center">ISBN��</td>
        <td><input name="isbn" type="text" id="isbn" value="*****">  </td>
      </tr>
      
      <tr>
        <td align="center">�۸�</td>
        <td><input name="price" type="text" id="price" value="*****">(Ԫ) * </td>
      </tr>
 
      <tr>
        <td align="center">&nbsp;</td>
        <td><input name="Submit" type="submit" class="btn_grey" value="����" onClick="return check(form1)">
        &nbsp;
       <input name="Submit2" type="button" class="btn_grey" value="����" onClick="history.back()"></td>
      </tr>
    </table>
	</form>
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