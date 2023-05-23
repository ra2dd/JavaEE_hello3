package com.example.javaee_hello3;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

@WebServlet(name = "jstl-servlet", value="/jstl-servlet")
public class JSTLRedirect  extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        User testUser = new User(1, "Test", "User1", "testuser1@example.com");
        request.setAttribute("testUser", testUser);


        List<User> testUsers = Arrays.asList(
                new User(2, "Test", "User2", "testuser2@example.com"),
                new User(3, "Test", "User3", "testuser3@example.com")
        );
        request.setAttribute("testUsers", testUsers);

        int[] tab = {1,2,3,4};
        request.setAttribute("tab", tab);


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
