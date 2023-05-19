<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style>
    section
    {
        background-color: aqua;
        width: 40%;
    }
</style>

<section>
    <h2>
        This is a heading from section.jsp file
    </h2>

    <p>
        16 squared is:
        <%
            int a = 16;
            int square = a * a;
        %>
        <%=
            " " + square
        %>
    </p>
</section>