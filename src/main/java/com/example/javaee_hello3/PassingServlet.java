package com.example.javaee_hello3;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
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

        ServletContext context = getServletContext();
        String color = context.getInitParameter("color");
        out.println("<p>Context color is " + color + ".");

        ServletConfig config = getServletConfig();
        String initColor = config.getInitParameter("initColor");
        out.println("<p>Context init color is " + initColor + ".");
    }
}
