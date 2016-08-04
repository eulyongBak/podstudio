package com.factory.podstudio.user.repository;

import org.springframework.stereotype.Repository;

import com.factory.podstudio.user.model.User;

@Repository
public interface IUserDao {
	int insertUser(User user);
	User selectUserByIdAndPw(User user);
	User selectUserByUserNo(User user);
}
