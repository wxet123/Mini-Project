package com.team2.web;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team2.DAO.AddTrainingDao;
import com.team2.model.AddTraining;



@WebServlet("/addtraining")
public class AddTrainingServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

private AddTrainingDao addtrainingDao;



/**
* @see HttpServlet#HttpServlet()
*/




/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
response.getWriter().append("Served at: ").append(request.getContextPath());

RequestDispatcher dispatcher = request.getRequestDispatcher("");
dispatcher.forward(request, response);
}



/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

String course_id = request.getParameter("course_id");
String course_name = request.getParameter("course_name");
String description = request.getParameter("description");
String Status=request.getParameter("status");



AddTraining addtrainings = new AddTraining();
addtrainings.setCourse_id(course_id);
addtrainings.setCourse_name(course_name);
addtrainings.setDescription(description);




try {

	AddTrainingDao.insertTrainings(addtrainings);

} catch (ClassNotFoundException e) {
e.printStackTrace();
}


RequestDispatcher dispatcher = request.getRequestDispatcher("/dashboard.jsp");
dispatcher.forward(request, response);

}




	

}
