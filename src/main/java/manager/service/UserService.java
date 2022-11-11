package manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import manager.dao.UserDao;
import manager.entity.UserLogin;
import manager.entity.UserSignup;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	//for creating user instance in database
	public boolean createUser(UserSignup userSignup) {
		if(noNullValueSignup(userSignup)) {
			return userDao.saveUser(userSignup);
		}
		return false;
	}
	//for checking if no value null is given by user
	public boolean noNullValueSignup(UserSignup userSignup) {
		if(userSignup.getUsername().equals("")||userSignup.getPassword().equals("")||userSignup.getEmail().equals("")) {
			return false;
		}
		return true;
	}
	
	//to check for user in database
	public boolean loginUser(UserLogin userLogin) {
		if(noNullValueLogin(userLogin)) {
			boolean check=userDao.userLogin(userLogin);
			return check;
		}
		return false;
	}
	
	//to check for user in database
	public boolean loginAdmin(UserLogin userLogin) {
		if(noNullValueLogin(userLogin)) {
			boolean check=userDao.adminLogin(userLogin);
			return check;
		}
		return false;
	}
	
	//checking no noNullValue during login
	public boolean noNullValueLogin(UserLogin userLogin) {
		if(userLogin.getUsername().equals("")||userLogin.getPassword().equals("")) {
			return false;
		}
		return true;
	}

}
