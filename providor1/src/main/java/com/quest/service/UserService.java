package com.quest.service;

import com.quest.entity.UserInfo;

public interface UserService {
	boolean regist(UserInfo userInfo);
	
	boolean login(String username, String password);
	
}
