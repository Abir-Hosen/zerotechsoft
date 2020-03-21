package com.abir.zerotechsoft.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	@NotBlank(message="Please enter your full name!")
	@Size(min=5, max=100)
	private String name;
	@Column(nullable = false)
	@NotBlank(message="Please enter your username!")
	@Size(min=5, max=30)
	private String username;
	@Column(nullable = false)
	@NotBlank(message="Please enter your email!")
	@Email(message = "Invalid email address!")
	private String email;
	@Column(nullable = false)
	@NotBlank(message="Please enter your password!")
	@Size(min=5, max=50)
	private String password;
	
	public User() {
		super();
	}
	public User(long id, @NotBlank(message = "Please enter your full name!") @Size(min = 5, max = 100) String name,
			@NotBlank(message = "Please enter your username!") @Size(min = 5, max = 30) String username,
			@NotBlank(message = "Please enter your email!") @Email(message = "Invalid email address!") String email,
			@NotBlank(message = "Please enter your password!") @Size(min = 5, max = 50) String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", password="
				+ password + "]";
	}
}
