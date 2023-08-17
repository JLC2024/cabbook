package com.bookacab.cabbook.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;


@Entity
@Table(name="users")

public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private float phone;

	
	public Users () {
		
	}
	
	public Users(String username, String password) {
		this.username=username;
		this.password = password;
		
	}
	

	
	public Users(String firstname, String lastname, String username, String password, String email, float phone) {
		super();
		this.firstname = firstname;
		this.lastname=lastname;
		this.username=username;
		this.password=password;
		this.email=email;
		this.phone=phone;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}

	public float getPhone() {
		return phone;
	}

	public void setPhone(float phone) {
		this.phone = phone;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword (String password) {
		this.password=password;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", username=" + username + ", phone=" + phone + ", password=" + password + "]";
	}
	
	
	

	
	
}
