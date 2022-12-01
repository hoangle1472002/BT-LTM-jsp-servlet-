package model.bo;

import model.bean.User;
import model.dao.UserDao;

public class UserBO {
	public UserDao userDao = new UserDao();
	public User GetUserLogin(String username,String password) throws ClassNotFoundException {
		return userDao.GetUserLogin(username, password);
	}
	
	public void InsertUser(User user) throws ClassNotFoundException {
		 userDao.InsertUser(user);
	}
	
}
