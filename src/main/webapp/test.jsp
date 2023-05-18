<%--
  Created by IntelliJ IDEA.
  User: rados
  Date: 18.05.2023
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <a href="index.jsp">Go back to the index page</a>
        <%
            for ( int i = 0; i < 10; i++)
            {
                out.println("<p>" + i*i + "</p>");
            }
        %>
    </body>
</html>
