<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

        <!-- Can achieve the same with: -->
        <p> ${ jstlText } printed using JSTL.</p>
        <p>
            <c:out value="${ jstlText } printed using JSTL tags" />
        </p>

    </body>
</html>
