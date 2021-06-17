package com.iseis.trainingapp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iseis.trainingapp.dao.LoginDAO;
import com.iseis.trainingapp.model.Login;

import jakarta.servlet.annotation.WebServlet;





@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDAO loginDAO;
	
	public void init() {
		loginDAO = new LoginDAO();
	}

	
	
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			
			Login login = new Login();
			login.setUsername(username);
			login.setPassword(password);
			
			
			
			try {
				if(loginDAO.validate(login)) {
				
					response.sendRedirect("loginsuccess.jsp");
				
				}else {
					response.sendRedirect("login.jsp");
				}
			}catch (ClassNotFoundException e){
					
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
			
	}


}
