package com.factory.podstudio.user.repository;

import org.springframework.stereotype.Repository;

import com.factory.podstudio.user.model.User;

@Repository
public interface IUserDao {
	int insertUser(User user);

	User selectUserNo(User user);
	
	User selectUserByIdAndPw(User user);

	User selectUserByUserNo(User user);

	int modifyUserByUserNo(User user);
	
	int deleteUserByUserNo(User user);
}
