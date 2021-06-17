package com.team2.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.team2.model.*;



public class ListOfTrainingDAO {
	

public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?useTimezone=true&serverTimezone=UTC","root","Neverwinter132!");
    }catch(Exception e){System.out.println(e);}
    return con;
}



public static List<ListOfTrainings> getAllRecords(){  
	
	List<ListOfTrainings> listAll=new ArrayList<ListOfTrainings>();  
	ListOfTrainings u=new ListOfTrainings();
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from createtraining");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u.setCourse_id(rs.getString("course_id"));
            u.setCourse_name(rs.getString("course_name"));  
            u.setDate(rs.getString("date"));
            u.setStartTime((rs.getString("startTime")));
            u.setEndTime((rs.getString("endTime")));
            u.setInstructor(rs.getString("instructor"));
            listAll.add(u);  
            

        }  
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }  
    return listAll;  
} 


public static String time(String strTime) {
	
	String hours = "" ;
	String minutes = "";
	String am_pm = "";
	String output = "";
		for(int i = 0; i < strTime.length() ; i++) {
			
			if(i <= 1) {
				hours += strTime.charAt(i);
			}

			
			if(i >= 3) {
				minutes += strTime.charAt(i);
			}
			
			
		}

		int h = Integer.parseInt(hours);
		if( h >= 13) {
			 hours = "" + (h-12);
			 am_pm = "PM";
		}else {
			if(	h== 0) {
				hours = "12";
				am_pm = "AM";
			}
		}
		output = hours + ":"+ minutes +" " +am_pm;
		return (output);
}
    
}
