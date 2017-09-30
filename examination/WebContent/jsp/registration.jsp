<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
  </head>
  
  <body>
    	<form action="user!regist" method="post">
    		用户名：    <input name="userInfo.name" type="text"><br>
    		密     码：	 <input name="userInfo.password" type="password"><br>
    		密码确认: <input name="userInfo.password2" type="password"><br>
    				 <input type="submit" value="注册"><br>
    	</form>
  </body>
</html>
