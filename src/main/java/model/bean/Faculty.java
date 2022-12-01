package model.bean;

public class Faculty {
	private int id;
	private String nameFaculty;
	
	
	public Faculty() {
		
	}
	public Faculty(int id, String nameFaculty) {
		super();
		this.id = id;
		this.nameFaculty = nameFaculty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameFaculty() {
		return nameFaculty;
	}
	public void setNameFaculty(String nameFaculty) {
		this.nameFaculty = nameFaculty;
	}
	
}
