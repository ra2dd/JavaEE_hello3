package com.example.javaee_hello3;

import java.io.*;
import java.util.Date;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.xml.crypto.Data;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public String tagWrapper(String tag, String text)
    {
        String htmlData = "<" + tag + ">" + text + "</" + tag + ">";
        return htmlData;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        HttpSession session = request.getSession();

        out.println(tagWrapper("h2", "Session data:"));
        out.println(tagWrapper("p", "Session ID: " + session.getId()));
        out.println(tagWrapper("p", "Created time: " + ( new Date(session.getCreationTime()).toString())));

        if(session.getAttribute("story") == null)
        {
            out.println(tagWrapper("p", "You haven't visited PassingServlet yet!"));
        }
        else
        {
            String story = (String) session.getAttribute("story") + "passed data to session.";
            out.println("<p>" + story + "<p>");
        }

        if(session.getAttribute("sessionTest") == null)
        {
            out.println(tagWrapper("p", "You haven't visited test.jsp yet!"));
        }
        else
        {
            out.println(tagWrapper("p", (String) session.getAttribute("sessionTest")));
        }
    }

    public void destroy() {
    }
}