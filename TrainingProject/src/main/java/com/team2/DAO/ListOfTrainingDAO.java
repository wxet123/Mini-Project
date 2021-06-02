package com.team2.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.team2.model.*;



public class ListOfTrainingDAO {
	

public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?useTimezone=true&serverTimezone=UTC","root","root");
    }catch(Exception e){System.out.println(e);}
    return con;
}

public static List<ListOfTrainings> getAllRecords(){  
    List<ListOfTrainings> listAll=new ArrayList<ListOfTrainings>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from trainings ORDER BY status DESC");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
        	ListOfTrainings u=new ListOfTrainings();
            u.setTraining_id(rs.getString("course_id"));
            u.setTitle(rs.getString("course_name"));  
            u.setStatus(rs.getString("status"));
            listAll.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return listAll;  
} 
    
}
