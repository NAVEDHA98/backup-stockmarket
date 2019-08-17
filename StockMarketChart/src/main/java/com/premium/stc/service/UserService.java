package com.premium.stc.service;

import com.premium.stc.model.User;

public interface UserService {
	 public User registerUser(User user) throws Exception;
	 public User updateUser(User user)throws Exception;
	 
}
