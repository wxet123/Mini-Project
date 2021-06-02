package com.team2.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.team2.model.Employee;


public class EmployeeDAO {
	
	
	//.getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	public int registerEmployee(Employee employee) throws ClassNotFoundException{
		String INSERT_EMPLOYEEINFO_SQL = "INSERT INTO employee" +
				" (first_name, last_name, username, password, address, contact) VALUES " +
				" (?, ?, ?, ?,?,?);";
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	    		
				
				
	    		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEEINFO_SQL,Statement.RETURN_GENERATED_KEYS)){
				
	    				preparedStatement.setString(1, employee.getFirstName());
						preparedStatement.setString(2, employee.getLastName());
						preparedStatement.setString(3, employee.getUsername());
						preparedStatement.setString(4, employee.getPassword());
						preparedStatement.setString(5, employee.getAddress());
						preparedStatement.setString(6, employee.getContact());
	    				
	    				System.out.println(preparedStatement);
	    				result  = preparedStatement.executeUpdate();
	    				ResultSet tableKeys = preparedStatement.getGeneratedKeys();
	    				tableKeys.next();
	    				
	    } catch (SQLException e) {
	    	printSQLException(e);
	    }
	    return result;
	    
	}
	
	public int registerEmployee1(Employee employee) throws ClassNotFoundException{
		
		String INSERT_USERLOGIN_SQL = "INSERT INTO login" +
				" (username, password) VALUES " +
				" (?, ?);";
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	    		
				
				
	    		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERLOGIN_SQL,Statement.RETURN_GENERATED_KEYS)){
				
	    				
						preparedStatement.setString(1, employee.getUsername());
						preparedStatement.setString(2, employee.getPassword());
	    				
	    				System.out.println(preparedStatement);
	    				result  = preparedStatement.executeUpdate();
	    				ResultSet tableKeys = preparedStatement.getGeneratedKeys();
	    				tableKeys.next();
	    				
	    } catch (SQLException e) {
	    	printSQLException(e);
	    }
	    return result;
	    
	}
	
	private void printSQLException(SQLException ex) {
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
