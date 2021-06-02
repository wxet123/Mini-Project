package com.team2.model;

public class ListOfTrainings {
	
	protected String course_id;
	protected String course_name;
    protected String status;
	
    public String getTraining_id() {
		return course_id;
	}
	public void setTraining_id(String course_id) {
		this.course_id = course_id;
	}
	public String getTitle() {
		return course_name;
	}
	public void setTitle(String course_name) {
		this.course_name = course_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
 
    
}
