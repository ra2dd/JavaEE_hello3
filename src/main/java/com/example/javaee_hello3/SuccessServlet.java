package com.example.javaee_hello3;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/success")
public class SuccessServlet extends HttpServlet
{
    public String tagWrapper(String tag, String text)
    {
        String htmlData = "<" + tag + ">" + text + "</" + tag + ">";
        return htmlData;
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String welcomeMessage = (String) request.getAttribute("welcomeMessage");
        welcomeMessage += " with Request Dispatcher.";

        PrintWriter out = response.getWriter();
        out.println(welcomeMessage);

        out.println(tagWrapper("h2", "List of cookies:"));
        Cookie cookies[] = request.getCookies();

        for(Cookie aCookie : cookies)
        {
            if(aCookie.getName().equals("cookieText"))
            {
                String receivedCookieText = aCookie.getValue();
                out.println(tagWrapper("p", receivedCookieText));
            }
        }
    }
}
