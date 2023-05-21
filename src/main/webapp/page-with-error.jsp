<%--
  Created by IntelliJ IDEA.
  User: rados
  Date: 21.05.2023
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
    <head>
        <title>Page with error</title>
    </head>
    <body>
        <%
            int[] tab = {2, 3, 4, 5};

            for ( int i = 0; i < 10; i++ )
            {
                out.println(tab[i] + " ");
            }
        %>
    </body>
</html>
