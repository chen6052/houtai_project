<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <title>项目管理系统 </title>
</head>

<frameset rows="59,*" cols="*" frameborder="no" border="0" framespacing="0">
    <frame src="files/top.html" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" title="topFrame" />
    <frameset cols="213,*" frameborder="no" border="0" framespacing="0">
        <frame src="WEB-INF/jsp/left.jsp" name="leftFrame" scrolling="No" noresize="noresize" id="leftFrame" title="leftFrame" />
        <frame src="files/mainfra.html" name="mainFrame" id="mainFrame" title="mainFrame" />
    </frameset>
</frameset>
<noframes><body>
</body>
</noframes></html>
