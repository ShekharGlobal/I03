package com.example.lifcycle;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Lifecycle")
public class Lifecycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//initialization of count variable
		private int count=0;
		
		public void init(ServletConfig config) {
			
			System.out.println("Servlet Initialized");
		}
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			count++;
			PrintWriter out = response.getWriter();
			out.println(count);
			System.out.println(count);
			out.close();
		}
		
		public void destroy() {
			System.out.println("Servlet destroyed "+ count);
		}

}
