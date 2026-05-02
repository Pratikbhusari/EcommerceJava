package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println("<h2>Product List</h2>");
        response.getWriter().println("<ul>");
        response.getWriter().println("<li>Mobile - ₹20,000</li>");
        response.getWriter().println("<li>Laptop - ₹50,000</li>");
        response.getWriter().println("<li>Headphones - ₹2,000</li>");
        response.getWriter().println("</ul>");
    }
}
