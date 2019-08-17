package com.premium.stc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.stc.dao.*;
import com.premium.stc.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public User registerUser(User user) throws Exception {
		return userDao.registerUser(user);

	}

	
	public User updateUser(User user) throws Exception {
		return userDao.updateUser(user);
	
	}

}
