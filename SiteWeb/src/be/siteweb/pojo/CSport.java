package be.siteweb.pojo;

import java.io.Serializable;

public class CSport implements Serializable  {
	private int id;
	private String name;
	
	public CSport() {}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}