	package com.team2.DAO;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	
	
	
	import com.team2.model.AddTraining;
	
	
	public class AddTrainingDao {

	
	//.getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	public static int insertTrainings(AddTraining addtraining) throws ClassNotFoundException{
	String INSERT_Employees_SQL = "INSERT INTO trainings" + " (course_id, course_name, description, status, date) VALUES " +
	" (?, ?, ?, 'Pending' ,now());";
	
	
	int result = 0;
	
	Class.forName("com.mysql.jdbc.Driver");
	
	try (Connection connection = DriverManager
	.getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	
	
	
	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_Employees_SQL ,Statement.RETURN_GENERATED_KEYS)){

	
	
	preparedStatement.setString(1, addtraining.getCourse_id());
	preparedStatement.setString(2, addtraining.getCourse_name());
	preparedStatement.setString(3, addtraining.getDescription());
//	preparedStatement.setString(4, addtraining.getStatus());
	



	System.out.println(preparedStatement);
	result = preparedStatement.executeUpdate();
	ResultSet tableKeys = preparedStatement.getGeneratedKeys();
	tableKeys.next();
	
	} catch (SQLException e) {
	printSQLException(e);
	}
	return result;
	
	}




	private static void printSQLException(SQLException ex) {
	for (Throwable e: ex) {
	if (e instanceof SQLException) {
	e.printStackTrace(System.err);
	System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	System.err.println("Message: " + e.getMessage());
	Throwable t = ex.getCause();
	while (t != null) {
	System.out.println("Cause: " + t);
	t = t.getCause();
	}
	}
	}
	}








}
