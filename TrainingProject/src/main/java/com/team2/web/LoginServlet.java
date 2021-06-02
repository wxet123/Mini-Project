package com.team2.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.team2.DAO.LoginDAO;
import com.team2.model.Login;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private LoginDAO loginDAO; 
      
      public void init() {
    	  loginDAO = new LoginDAO();
      }
	
  


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Login login = new Login();
		login.setUsername(username);
		login.setPassword(password);
		
		 try {
	            if (loginDAO.validate(login)) {
	                
	                response.sendRedirect("dashboard.jsp"); //INSERT HOME PAGE
	            } else {
	                
	            	
	            	response.sendRedirect("loginfailed.jsp");
	                
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	      
	      }
	}
}
