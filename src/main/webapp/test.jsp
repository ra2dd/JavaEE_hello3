<%--
  Created by IntelliJ IDEA.
  User: rados
  Date: 18.05.2023
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.LocalDate" %>

<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <a href="index.jsp">Go back to the index page</a>
        <%!
            public String getText()
            {
                return "Text from a function.";
            }
        %>

        <%
            for ( int i = 0; i < 10; i++)
            {
                out.println("<p>" + i*i + "</p>");
            }
        %>

        <p>
            Does a function work?
            <%= getText() %>
        </p>

        <p>
            Does a date import work?
            <%= LocalDate.now() %>
        </p>


    </body>
</html>
