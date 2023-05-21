package com.example.javaee_hello3;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.server.ExportException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        //Create cookie with text as data and pass it to the response
        String cookieText = "Created_a_cookie_in_a_LoginServlet.";
        Cookie cookie = new Cookie("cookieText", cookieText);
        cookie.setPath("/");
        response.addCookie(cookie);

        //Get data from the form and create welcome message
        String login = request.getParameter("username");
        String password = request.getParameter("password");
        String welcomeMessage = "Hello " + login+ ". You successfully completed the form";
        /*
            Set request attribute with welcome message and
            pass it when forwarding with request dispatcher to another servlet
         */
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
