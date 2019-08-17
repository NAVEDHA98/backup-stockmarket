package com.premium.stc.dao;

import com.premium.stc.model.User;

public interface UserDao {
	 public User registerUser(User user) throws Exception;
	 public User updateUser(User user)throws Exception;
	 
}
