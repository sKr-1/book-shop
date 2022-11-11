package manager.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import manager.entity.UserLogin;
import manager.entity.UserSignup;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	//to save user in database
	public boolean saveUser(UserSignup userSignup) {
		String query="insert into user values(?,?,?)";
		if(checkForUserSignup(userSignup.getUsername())==null) {
			int x=jdbc.update(query,userSignup.getUsername(),userSignup.getPassword(),userSignup.getEmail());
			return x>0;
		}
		return false;
		
	}
	//to check if user is not present already
	public UserSignup checkForUserSignup(String username) {
		String sql = "SELECT * FROM user WHERE username= "+ "'"+username+"'";
		try {
			UserSignup us=jdbc.queryForObject(sql, BeanPropertyRowMapper.newInstance(UserSignup.class));
			return us;
		}
		catch (EmptyResultDataAccessException e) {
		    return null;
		}
	}
	
	//to validate login
	public boolean userLogin(UserLogin userLogin) {
		UserLogin user=checkForUserLogin(userLogin.getUsername());
		if(user!=null) {
			if(user.getUsername().equals(userLogin.getUsername())&&user.getPassword().equals(userLogin.getPassword())) {
				return true;
			}
		}
		return false;
	}
	
	//to check if user is present
	public UserLogin checkForUserLogin(String username) {
		String sql = "SELECT * FROM user WHERE username= "+ "'"+username+"'";
		try {
			UserLogin ul=jdbc.queryForObject(sql, BeanPropertyRowMapper.newInstance(UserLogin.class));
			return ul;
		}
		catch (EmptyResultDataAccessException e) {
		    return null;
		}
	}
	
	//to validate admin login
		public boolean adminLogin(UserLogin userLogin) {
			UserLogin user=checkForAdminLogin(userLogin.getUsername());
			if(user!=null) {
				if(user.getUsername().equals(userLogin.getUsername())&&user.getPassword().equals(userLogin.getPassword())) {
					return true;
				}
			}
			return false;
		}
	
	
	//to check if user is present
		public UserLogin checkForAdminLogin(String username) {
			String sql = "SELECT * FROM admin WHERE username= "+ "'"+username+"'";
			try {
				UserLogin ul=jdbc.queryForObject(sql, BeanPropertyRowMapper.newInstance(UserLogin.class));
				return ul;
			}
			catch (EmptyResultDataAccessException e) {
			    return null;
			}
		}
}
