<%--
  Created by IntelliJ IDEA.
  User: DFXS15
  Date: 2018/4/2
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
 <form action="/login" method="post">
     <% if(request.getAttribute("error")!=null){
         response.getWriter().print(request.getAttribute("error"));
     }%>
     用户名：<input name="name" type="text" value=""/>
     密码：  <input name="pass" type="password" value=""/>
     <input type="submit" value="登陆">

 </form>
</body>
</html>
