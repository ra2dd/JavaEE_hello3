package com.example.javaee_hello3;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/success")
public class SuccessServlet extends HttpServlet
{
    // function for wrapping text into html tags
    public String tagWrapper(String tag, String text)
    {
        String htmlData = "<" + tag + ">" + text + "</" + tag + ">";
        return htmlData;
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        //Get request attribute from the form
        String welcomeMessage = (String) request.getAttribute("welcomeMessage");
        welcomeMessage += " with Request Dispatcher.";

        PrintWriter out = response.getWriter();
        out.println(welcomeMessage);

        //Get a list of cookies
        out.println(tagWrapper("h2", "List of cookies:"));
        Cookie cookies[] = request.getCookies();

        //Loop through cookies to find a specific cookie
        for(Cookie aCookie : cookies)
        {
            //If specific cookie is found, get its value and print it
            if(aCookie.getName().equals("cookieText"))
            {
                String receivedCookieText = aCookie.getValue();
                out.println(tagWrapper("p", receivedCookieText));
            }
        }
    }
}
