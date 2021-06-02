package com.team2.model;

public class AddTraining {

	private String course_id;
	private String course_name;
	private String description;
	private String status;
	
	
	
	
	public AddTraining() {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.description = description;
		this.status = status;
	}



	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
	
	
	
}
