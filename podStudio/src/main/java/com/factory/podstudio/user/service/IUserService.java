package com.factory.podstudio.user.service;

import com.factory.podstudio.user.model.User;

public interface IUserService {
	int insertUser(User user);
	
	User selectUserByUserNo(User user);
	//int selectUserByUserNo(int userNo);
	
	int modifyUserByUserNo(User user);
	
	int deleteUserByUserNo(User user);
	
	User getUserByIdAndPw(User user);


}
