package com.quest.entity;

import java.io.Serializable;

public class UserInfo implements Serializable {
	/** 
	 * @Description:TODO(用一句话描述这个变量表示什么). 
	 */  
	private static final long serialVersionUID = -2715768129381077034L;

	private long id;
	private String username;
	private String password;
	private String tel;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
