<%@ page  import="java.util.*"  contentType="text/html; charset=utf-8" language="java"  errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

</head>

<body>
 <table width="778" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#F9D16B" class="tableBorder">
     <tr>
        <td>
                <table width="760" border="0" align="center" cellpadding="0" cellspacing="0">
                  <tr>
                       <td height="142" valign="top"> <br></td>
                  </tr>
               </table>
	      </td>
      </tr>
      

	<td>
	<table width="100%"  border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td valign="top"><table width="100%" height="525"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="523" align="center" valign="top"><table width="100%" height="271"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td height="271" align="right" valign="top" class="word_orange"><table width="100%" height="255"  border="0" cellpadding="0" cellspacing="0" background="Images/login.jpg">
          <tr>
            <td height="57">&nbsp;</td>
            </tr>
          <tr>
            <td height="179" valign="top"><table width="100%" height="63"  border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td width="2%">&nbsp;</td>
                  <td width="97%" align="center" valign="top">
                    <s:form name="form1" method="post" action="Users_login" theme="simple">
                      <table width="100%"  border="0" cellpadding="0" cellspacing="0"  bordercolorlight="#FFFFFF"  bordercolordark="#D2E3E6">
                        <tr>
                             <td height="57">&nbsp;</td>
                             <td height="57" colspan="2" align="center">&nbsp;</td>
                              <td>&nbsp;</td>
                        </tr> 
                        <tr>
                           <td width="50%" height="37">&nbsp;</td>
                           <td width="10%">帐号：</td>
                           <td width="31%">
                            <s:textfield name="users.uid" class="logininput" id="userid" size="27"/>
                           </td>
                           <td width="9%">&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="37">&nbsp;</td>
                            <td>密码：</td>
                            <td><s:password name="users.upwd" class="logininput" id="upwd" size="27"/>
                         </td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="30">&nbsp;</td>
                            <td colspan="2" align="center">
                            <s:submit name="Submit" class="btn_grey" value="确定"/>
                      
                             &nbsp;
                          <s:reset name="Submit3" class="btn_grey" value="重置"/>
                           &nbsp;
                            </td>
                            <td>&nbsp;</td>
                        </tr>
                       </table> 
			       </s:form>				
                   </td>
                  <td width="1%">&nbsp;</td>
                </tr>
              </table></td>
            </tr>
          <tr>
            <td height="19">&nbsp;</td>
            </tr>
        </table></td>
      </tr>
      
    </table>
      <table width="100%"  height="27"  border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td align="center" class="word_login">CopyRight &copy; 2015 www.syyyy.com.cn <a href="http://www.syyyy.com.cn">沈工网<a/><br></td>
        </tr>
      </table></td>
  </tr>
</table></td>
  </tr>
</table>
</td>
  </tr>
</table>
  </body>
</html>

