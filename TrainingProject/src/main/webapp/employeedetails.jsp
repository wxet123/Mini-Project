<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.team2.DAO.EmployeeDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   		<jsp:useBean id="employee" class="com.team2.model.Employee" />

 		<jsp:setProperty property="*" name="employee" />

		<%
  			EmployeeDAO employeeDao = new EmployeeDAO();
  			int status = employeeDao.registerEmployee1(employee);
  			int status1 = employeeDao.registerEmployee(employee);
  		  	if (status > 0 && status1 > 0) {
  		   	out.print("You are successfully registered");
  		 	 }
		%>

</body>
</html>