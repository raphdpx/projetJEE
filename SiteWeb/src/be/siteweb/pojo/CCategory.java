package be.siteweb.pojo;

public class CCategory{
	private int id;
	private CSport sport;
	private String name;
	
	public CCategory() {}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CSport getSport() {
		return sport;
	}
	public void setSport(CSport sport) {
		this.sport = sport;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
