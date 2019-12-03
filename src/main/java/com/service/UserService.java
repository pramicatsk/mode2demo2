package com.service;



import com.model.User;

public interface UserService {
	
	User createUser(User user);
	User readUserById (int id);
	User readUserByName (String name);
	/*UserTransactionAdapter updateUser(User user);
    boolean deleteUserById(int id);*/
}
