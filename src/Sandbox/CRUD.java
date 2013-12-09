package Sandbox;

import domain.User;
import DataAccessObject.UserDAO;

public class CRUD {
	
	UserDAO dao = new UserDAO();
	
	public void create(String username, String email){
		User tmp = new User();
		tmp.setEmail(email);
		tmp.setUsername(username);
		dao.addUser(tmp);
		System.out.println(username + " added to db");
	}
	
	void read(int id){

	}
	
	void update(int id){
		
	}
	
	public void delete(int id){
		
		if(dao.equals(dao.getUserById(id))){
			System.out.println("It's deleted now");
		} else {
			System.out.println("It doesn't exist?");
		}
	}
}
