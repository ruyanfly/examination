package com.lhw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.lhw.dao.UserDao;
import com.lhw.model.User;
import com.lhw.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}
	
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add(User user) throws Exception {
		userDao.save(user);
	}

	@SuppressWarnings("unchecked")
	public boolean exists(User user) throws Exception {
		User u = userDao.loadByName((Class<User>)user.getClass(),user.getName());
		if (u != null) {
			return true;
		}
		return false;
	}

	public List<User> getUsers() throws Exception{
		return userDao.getUsers();
	}

	public User loadById(int id) throws Exception {
		return userDao.loadById(id);
	}
}
