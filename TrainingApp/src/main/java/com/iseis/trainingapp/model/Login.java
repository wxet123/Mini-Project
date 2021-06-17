package com.iseis.trainingapp.model;

public class Login {

	private String username;
	private String password;
	private static final long serialVersionUID = 1L;

	
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
