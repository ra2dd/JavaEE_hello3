<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>

        <style>
            a
            {
                display: block;
            }
        </style>
    </head>
    <body>
        <h1><%= "Hello World!" %></h1>

        <br/>

        <a href="hello-servlet">Hello Servlet</a>
        <a href="login-form.html">Go to login form and session check</a>
        <a href="test.jsp">Go to test jsp file</a>
        <a href="page-with-error.jsp">Go to the page with error</a>
        <a href="database-connection.jsp">Test JDBC connection</a>
        <a href="jstl-servlet">Pass servlet data to jsp containing JSTL</a>
    </body>
</html>