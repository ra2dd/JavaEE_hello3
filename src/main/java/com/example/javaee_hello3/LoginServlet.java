package com.example.javaee_hello3;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String login = request.getParameter("username");
        String password = request.getParameter("password");

        String welcomeMessage = "Hello " + login + ". You successfully completed the form.";

        PrintWriter out = response.getWriter();

        out.println(welcomeMessage);
    }
}
