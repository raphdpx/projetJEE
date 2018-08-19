package be.siteweb.pojo;

import java.io.Serializable;

public class CUser implements Serializable  {
	private static final long serialVersionUID = -8003786218790389352L;
	private int id;
	private String login;
	private String password;
	private String firstName;
	private String lastName;
	
	public CUser() {}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
