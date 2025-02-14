package com.example.httpsession;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/LoginServlets")
public class LoginServlets extends HttpServlet {
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("pass");
        String location = request.getParameter("location");

        if ("jack".equals(username) && "rose".equalsIgnoreCase(password)) {
           
        	HttpSession session = request.getSession();
        	
            session.setAttribute("user", username);
            session.setAttribute("location", location);
            response.sendRedirect("Inbox");
        } else {
        	// Redirect to login page on failure
            response.sendRedirect("session.html"); 
        
             
        }
    }
}
