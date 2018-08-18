package be.siteweb.pojo;

import java.util.Date;

public class CRecord {
	private int id;
	private CCategory category;
	private CUser user;
	private Date time;
	private Date date;
	
	public CRecord() {}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CCategory getCategory() {
		return category;
	}
	public void setCategory(CCategory category) {
		this.category = category;
	}
	public CUser getUser() {
		return user;
	}
	public void setUser(CUser user) {
		this.user = user;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}