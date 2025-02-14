package com.example.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Inbox
 */
@WebServlet("/Inbox")
public class Inbox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		HttpSession session = request.getSession();
        
        if (session.getAttribute("user") == null) {
            response.sendRedirect("session.html");
            return;
        }
        
        String userName = session.getAttribute("user").toString();
        String location = session.getAttribute("location").toString();
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.print("<html><head><title>Inbox</title></head><body>");
        
        out.print("<h1 style='text-align:center;'>Inbox</h1>");
        
        out.print("<h2>Welcome " + userName + "</h2>");
        out.print("<h2>Location: " + location + "</h2>");
        
        out.print("<a href='SentItems'>Sent Items</a><br/>");
        
        out.print("<a href='Logout'>Log Out</a>");
        
        out.print("</body></html>");
    }

}
