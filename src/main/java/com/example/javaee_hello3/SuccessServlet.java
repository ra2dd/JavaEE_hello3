package com.example.javaee_hello3;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SuccessServlet extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String welcomeMessage = (String) request.getAttribute("welcomeMessage");
        welcomeMessage += " with Request Dispatcher.";

        PrintWriter out = response.getWriter();
        out.println(welcomeMessage);
    }
}
