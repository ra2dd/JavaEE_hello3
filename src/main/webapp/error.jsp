<%--
  Created by IntelliJ IDEA.
  User: rados
  Date: 21.05.2023
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <p>You have error in your page:</p>
        <%= exception.getMessage() %>
    </body>
</html>
