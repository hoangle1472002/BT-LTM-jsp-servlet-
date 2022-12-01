package model.bo;

import java.util.List;

import model.bean.SV;
import model.bean.SV_Faculty;
import model.dao.SvDao;

public class SvBO {
	public SvDao svDao = new SvDao();
	
	
	public List<SV_Faculty> GetAllSVByNameFaculty(String text){
		return svDao.GetAllSVByNameFaculty(text);
	}
	 public boolean DeleteSv(int id) {
		 return svDao.DeleteSv(id);
	 }
	 public boolean UpdateSv(SV sv) {
		 return svDao.UpdateSv(sv);
	 }
	 public SV GetSVById(int id) {
		 return svDao.GetSVById(id);
	 }
	 public void InsertSV(SV sv) throws ClassNotFoundException {
		 svDao.InsertSV(sv);
	 }
}
