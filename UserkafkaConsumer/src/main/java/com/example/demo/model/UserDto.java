package com.example.demo.model;

public class UserDto {


	protected String userName;
	
	protected String password;

	public UserDto() {
		super();
	}

	
	public UserDto( String userName, String password) {
		super();
	
		this.userName = userName;
		this.password = password;
	}



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [ userName=" + userName + ", password=" + password + "]";
	}
}

