package com.quest.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.quest.dao.UserDao;
import com.quest.entity.UserInfo;
import com.quest.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	@Override
	public boolean regist(UserInfo userInfo) {
		
		try {
			userDao.insertUser(userInfo);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean login(String username, String password) {
		UserInfo userInfo = userDao.selectUser(username);
		if(password.equals(userInfo.getPassword())){
			return true;
		}
		return false;
	}

}
