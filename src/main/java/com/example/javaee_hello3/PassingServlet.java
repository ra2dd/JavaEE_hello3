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
        String name = request.getParameter("name");
        String story = name + " submitted a form and ";

        // Fetch session and add attribute to it
        HttpSession session = request.getSession();
        session.setAttribute("story", story);

        PrintWriter out = response.getWriter();
        out.println("<a href=hello-servlet> Check if session works <a/>");

        // get global servlet context and its init parameter from web.xml
        ServletContext context = getServletContext();
        String color = context.getInitParameter("color");
        out.println("<p>Context color is " + color + ".");

        // get servlet config specific to PassingServlet and its init parameter from web.xml
        ServletConfig config = getServletConfig();
        String initColor = config.getInitParameter("initColor");
        out.println("<p>Context init color is " + initColor + ".");
    }
}
