package com.lhw.dao;

import java.util.List;

import com.lhw.model.User;

public interface UserDao {

	public abstract void save(User user) throws Exception;

	public abstract User loadByName(Class<User> class1,String name) throws Exception;
	
	public List<User> getUsers() throws Exception;
	
	public User loadById(int id) throws Exception;

}