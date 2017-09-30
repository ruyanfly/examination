package com.lhw.vo;

public class UserInfo {
	private int id;
	private String name;
	private String password;
	private String password2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", password="
				+ password + ", password2=" + password2 + "]";
	}

}
