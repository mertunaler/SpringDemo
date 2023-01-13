package com.Mert.userManagement.Entities;

import javax.persistence.*;

@Entity(name="users")
@Table(name="users")
public class User {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="userfname")
	private String userFName;
	
	@Column(name="userlname")
	private String userLName;
	
	@Column(name="user_mail")
	private String userMail;
	
	public User() {
		
	}
	public User(int id, String userFName, String userLName, String userMail) {
		
		this.id = id;
		this.userFName = userFName;
		this.userLName = userLName;
		this.userMail = userMail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserFName() {
		return userFName;
	}
	public void setUserFName(String userFName) {
		this.userFName = userFName;
	}
	public String getUserLName() {
		return userLName;
	}
	public void setUserLName(String userLName) {
		this.userLName = userLName;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	
	
}
