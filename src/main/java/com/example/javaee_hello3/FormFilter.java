package com.example.javaee_hello3;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "FormFilter", value="/login")
public class FormFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();

        HttpServletRequest req = (HttpServletRequest) request;
        String login = req.getParameter("username");
        String password = req.getParameter("password");

        if(login.length() > 2)
        {
            chain.doFilter(request, response);
        }
        else
        {
            out.print("Your username is too short. It should have 3 characters or more.");
        }
    }
}
