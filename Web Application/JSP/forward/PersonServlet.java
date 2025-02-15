package com.example.jspforward;
import java.io.IOException;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/personServlet")
public class PersonServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Create a Person object
        Person person = new Person("Ajay", "Kumar", 30);

        // Set the object as a request attribute
        request.setAttribute("person", person);

        // Forward the request to the JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("JSP/Forward/Person.jsp");
        dispatcher.forward(request, response);
    }
}
