<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page import="java.sql.*" %>
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


        <!-- Set up database connection -->
        <sql:setDataSource var="database" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/JavaEE_test" user="postgres" password="bazadanychzesloniem" />
        <sql:query var="result" dataSource="${ database }">
            select * from users
        </sql:query>

        <p>Database data:</p>
        <ul>
            <c:forEach items="${ result.rows }" var="row">
                <li>
                    User last name:
                    <c:out value="${ row.last_name }"></c:out>
                </li>
            </c:forEach>
        </ul>



    </body>
</html>
