package com.example.javaee_hello3;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import static java.lang.System.out;

@WebServlet(name = "jstl-servlet", value="/jstl-servlet")
public class JSTLRedirect  extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String text = "Text from JSTLRedirect Servlet ";

        request.setAttribute("jstlText", text);
        RequestDispatcher rd = request.getRequestDispatcher("jstl-test.jsp");

        try
        {
            rd.forward(request, response);
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }
}
