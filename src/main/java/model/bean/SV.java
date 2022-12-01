package model.bean;

public class SV {
	private int id,idSvFaculty;
	private String name,gender,mssv;
	
	public SV() {
		
	}
	public SV(int id,String mssv, int idSvFaculty, String name, String gender) {
		super();
		this.id = id;
		this.mssv = mssv;
		this.idSvFaculty = idSvFaculty;
		this.name = name;
		this.gender = gender;
	}
	public SV(String mssv,int idSvFaculty, String name, String gender) {
		super();
		this.mssv = mssv;
		this.idSvFaculty = idSvFaculty;
		this.name = name;
		this.gender = gender;
	}
	
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdSvFaculty() {
		return idSvFaculty;
	}
	public void setIdSvFaculty(int idSvFaculty) {
		this.idSvFaculty = idSvFaculty;
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
	public void setGender(String gender) {
		this.gender = gender;
	}
}
