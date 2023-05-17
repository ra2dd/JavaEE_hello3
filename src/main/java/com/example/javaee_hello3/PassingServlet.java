package com.example.javaee_hello3;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class PassingServlet extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String name = (String) request.getParameter("name");
        String story = name + " submitted a form and ";

        HttpSession session = request.getSession();
        session.setAttribute("story", story);

        PrintWriter out = response.getWriter();
        out.println("<a href=hello-servlet> Check if session works <a/>");
    }
}
