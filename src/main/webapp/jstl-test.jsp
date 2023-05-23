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

        <p> Test user information: ${ testUser.toString() }</p>

        <p>List of user email addresses:</p>
        <ul>
            <c:forEach items="${testUsers}" var="user">
                <li>${ user.email_address }</li>
            </c:forEach>
        </ul>


    </body>
</html>
