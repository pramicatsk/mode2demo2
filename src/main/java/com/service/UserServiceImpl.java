/package com.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.jta.UserTransactionAdapter;

import com.model.User;
@Service

public class UserServiceImpl implements UserService {

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readUserById(int id) {
		User user= null;
		if(id>0  && id==10)
		{
			user= new User();
			user.setUserId(10);
			user.setUsername("ten");
		}
		if(id>0  && id==20)
		{
			user= new User();
			user.setUserId(20);
			user.setUsername("twenty");
		}
		return user;
	}

	@Override
	public User readUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public UserTransactionAdapter updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUserById(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	*/

}
