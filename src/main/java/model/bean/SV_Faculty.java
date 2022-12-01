package model.bean;

public class SV_Faculty {
	private int id;
	private String mssv,name,gender,nameFaculty;
	
	public SV_Faculty() {
		
	}
	public SV_Faculty(int id,String mssv, String name, String gender, String nameFaculty) {
		super();
		this.id = id;
		this.mssv = mssv;
		this.name = name;
		this.gender = gender;
		this.nameFaculty = nameFaculty;
	}
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
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
	public String getGender() {
		return gender;
	}
	public void setClassName(String gender) {
		this.gender = gender;
	}
	public String getNameFaculty() {
		return nameFaculty;
	}
	public void setNameFaculty(String nameFaculty) {
		this.nameFaculty = nameFaculty;
	}
	
	
}
