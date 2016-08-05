package com.factory.podstudio.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.user.model.User;
import com.factory.podstudio.user.repository.UserDaoImpl;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserDaoImpl userDao;
	
	@Override
	public User selectUserByUserNo(User user) {
		return userDao.selectUserByUserNo(user);
	}
	
	@Override
	public int modifyUserByUserNo(int userNo) {
		
		return 0;
		//return userDao.selectUserByIdAndPw(user);
	}
	
	@Override
	public void deleteUserByUserNo() {
	}
	
	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public User getUserByIdAndPw(User user) {
		return userDao.selectUserByIdAndPw(user);
	}
}
