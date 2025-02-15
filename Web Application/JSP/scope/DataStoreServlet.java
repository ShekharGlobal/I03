package com.example.jspscope;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/storeData")
public class DataStoreServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set data in the request scope (only for the current request)
        request.setAttribute("requestData", "This is request-scoped data");

        // Set data in the session scope (for the current session)
        HttpSession session = request.getSession();
        session.setAttribute("sessionData", "This is session-scoped data");

        // Set data in the application scope (for the entire application)
        ServletContext application = getServletContext();
        application.setAttribute("applicationData", "This is application-scoped data");

        // Forward the request to the JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("JSP/Scope/displayData.jsp");
        dispatcher.forward(request, response);
    }
}
