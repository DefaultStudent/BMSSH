<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="CSS/style.css" rel="stylesheet">
<script language="javascript">
function prompt(){
	if(myform.limit.value==2){
		if(myform.count.value>0){
			alert("ÄúÓÐÍ¼ÊéÒÑµ½ÆÚ£¬Çë¼°Ê±¹é»¹£¡");
		}
	}else{
		return false;
	}
}
</script>
  </head>
  
  <body onload="prompt()">
    <%@include file="banner.jsp" %>
    <!--根据用户类型不同，选择不同导航栏  -->
        <s:if test="#session.limit==1">
            <%@include file="navigation.jsp" %>
        </s:if>
        <s:else>
            <%@include file="reader_navigation.jsp" %>
        </s:else>
     
  <table width="778" height="510"  border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" class="tableBorder_gray">
  <tr>
    <td align="center" valign="top" style="padding:5px;"><table width="100%"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td height="20" align="right" valign="middle" class="word_orange">当前位置：首页 &gt;&gt;&gt;&nbsp;</td>
      </tr>
      <tr>
        <td valign="top"><table width="100%"  border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="57" background="Images/main_booksort.gif">&nbsp;</td>
          </tr>
          <tr>
            <td height="72" valign="top"><table width="100%" height="63"  border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td width="2%" rowspan="2">&nbsp;</td>
                <td width="96%" align="center" valign="top"><table width="100%"  border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#B7B6B6" bordercolorlight="#FFFFFF">
                  <tr align="center">
                    <td width="5%" height="20">排名</td>
					<td width="10%">图书编号</td>
					<td width="15%">图书名称</td>
		
                  </tr>
				
                </table>
                  </td>
                <td width="2%" rowspan="2">&nbsp;</td>
              </tr>
              <tr>
                <td height="30" align="right" valign="middle"><a href=""><img src="Images/more.GIF" width="50" height="20" border="0">&nbsp;</a></td>
              </tr>
            </table></td>
          </tr>
        </table>
          </td>
      </tr>
    </table>
    </td>
  </tr>
</table>
<%@ include file="copyright.jsp"%>
  </body>
</html>
