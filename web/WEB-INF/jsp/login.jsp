<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <title>项目管理系统 by www.mycodes.net</title>
    <style type="text/css">
        <!--
        body {
            margin-left: 0px;
            margin-top: 0px;
            margin-right: 0px;
            margin-bottom: 0px;
        }
        -->
    </style>
    <link href="css/css.css" rel="stylesheet" type="text/css" />
</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td height="147" background="images/top02.gif"><img src="images/top03.gif" width="776" height="147" /></td>
    </tr>
</table>
<table width="562" border="0" align="center" cellpadding="0" cellspacing="0" class="right-table03">
    <tr>
        <td width="221">
            <table width="95%" border="0" cellpadding="0" cellspacing="0" class="login-text01">
                <tr>
                    <td>
                        <table width="100%" border="0" cellpadding="0" cellspacing="0" class="login-text01">
                            <tr>
                                <td align="center"><img src="images/ico13.gif" width="107" height="97" /></td>
                            </tr>
                            <tr>
                                <td height="40" align="center">&nbsp;</td>
                            </tr>
                        </table>
                    </td>
                    <td><img src="images/line01.gif" width="5" height="292" /></td>
                </tr>
            </table>
        </td>
        <form action="employee/login" method="post">
        <td>
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="31%" height="35" class="login-text02">用户名称：<br /></td>
                <td width="69%"><input name="empid" type="text" size="30" /></td>
            </tr>
            <tr>
                <td height="35" class="login-text02">密　码：<br /></td>
                <td><input name="password" type="password" size="33" /></td>
            </tr>
            <tr>
                <td height="35" class="login-text02">验证图片：<br /></td>
                <td><img src="images/pic05.gif" width="109" height="40" /> <a href="#" class="login-text03">看不清楚，换张图片</a></td>
            </tr>
            <tr>
                <td height="35" class="login-text02">请输入验证码：</td>
                <td><input name="textfield3" type="text" size="30" /></td>
            </tr>
            <tr>
                <td height="35">&nbsp;</td>
                <td><font color="red">${msg}</font></td>
                <td>
                    <input name="Submit2" type="submit" class="right-button01" value="确认登陆"  />
                    <input name="Submit232" type="submit" class="right-button02" value="重 置" onClick="window.location='login.jsp'"/>
                </td>
            </tr>
            </table>
        </td>
        </form>
    </tr>
</table>
</body>
</html>
