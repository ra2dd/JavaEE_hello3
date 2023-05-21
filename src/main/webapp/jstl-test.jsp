<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>JSTL</title>
    </head>
    <body>
        <!--
        <%
            String text = request.getAttribute("jstlText").toString() + " printed in jsp file.";
        %>

        <p>
            <%= text %>
        </p>
        -->

        <!-- Can achive the same with: -->
        <p> ${ jstlText } printed using JSTL.</p>
    </body>
</html>
