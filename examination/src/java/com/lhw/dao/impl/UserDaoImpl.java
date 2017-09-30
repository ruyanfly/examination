package com.lhw.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import com.lhw.dao.UserDao;
import com.lhw.model.User;

@Component("userDao")
public class UserDaoImpl implements UserDao {

	private SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	@Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public void save(User user) throws Exception {
		sqlSessionTemplate.insert(user.getClass().getName() + ".save", user);
	}

	public User loadByName(Class<User> cls, String name) throws Exception {
		return sqlSessionTemplate.selectOne(cls.getName() + ".load_by_name", name);
	}

	public List<User> getUsers() throws Exception {
		return sqlSessionTemplate.selectList(User.class.getName()+".list");
	}

	public User loadById(int id) throws Exception {
		return sqlSessionTemplate.selectOne(User.class.getName()+".load_by_id",id);
	}
}
