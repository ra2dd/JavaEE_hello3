package com.example.javaee_hello3;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.server.ExportException;

public class LoginServlet extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String login = request.getParameter("username");
        String password = request.getParameter("password");

        String welcomeMessage = "Hello " + login+ ". You successfully completed the form";

        request.setAttribute("welcomeMessage", welcomeMessage);
        RequestDispatcher rd = request.getRequestDispatcher("success");
        try
        {
            rd.forward(request, response);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
