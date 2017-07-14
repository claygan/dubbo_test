package com.quest.dao;

import com.quest.entity.UserInfo;

public interface UserDao {
	void insertUser(UserInfo userInfo);
	
	UserInfo selectUser(String username);
}
