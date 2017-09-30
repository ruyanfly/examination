package com.lhw.service;

import java.util.List;

import com.lhw.model.User;

public interface UserService {

	public abstract void add(User user) throws Exception;

	public abstract boolean exists(User user) throws Exception;
	
	public List<User> getUsers() throws Exception;
	
	public User loadById(int id) throws Exception;

}