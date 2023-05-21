<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
    <head>
        <title>Database connection</title>
    </head>

    <body>
        <h1>Testing PostgreSQL JDBC connection</h1>

    <%
        String url = "jdbc:postgresql://localhost:5432/JavaEE_test";
        String username = "postgres";
        String password = "bazadanychzesloniem";

        String query = "SELECT user_id, first_name, last_name, email_address, phone_number FROM users";

        Class.forName("org.postgresql.Driver");
        Connection jdbcConnection = DriverManager.getConnection(url, username, password);

        Statement statement = jdbcConnection.createStatement();
        ResultSet result = statement.executeQuery(query);
        result.next();
    %>

    <p>Does connection work? </p>
    <p>
        <%=
            result.getString(1) + " " +
            result.getString(2) + " " +
            result.getString(3) + " " +
            result.getString(4) + " " +
            result.getString(5)
        %>
    </p>
    </body>
</html>
