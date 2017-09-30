package com.lhw.action;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.lhw.model.User;
import com.lhw.service.UserService;
import com.lhw.vo.UserInfo;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private static final long serialVersionUID = -1679486709261641535L;

	private final static Logger logger = Logger.getLogger(UserAction.class);

	@Autowired
	private UserService userService;

	// 接收页面表单数据
	private UserInfo userInfo = new UserInfo();

	// 用户实体
	private List<User> users;

	// 注册用户
	public String regist() throws Exception {
		// 对象转换
		User user = new User();
		user.setName(userInfo.getName());
		user.setPassword(userInfo.getPassword());

		if (userService.exists(user)) {
			logger.error("用户已经存在，注册失败！");
			return "fail";
		}
		userService.add(user);
		logger.error("用户注册成功！");
		return "success";
	}

	// 查询用户列表
	public String list() throws Exception {
		users = userService.getUsers();
		return "list";
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
