package com.factory.podstudio.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.user.model.User;
import com.factory.podstudio.user.repository.UserDaoImpl;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserDaoImpl userDao;

	// 개인 회원정보보기
	@Override
	public User selectUserByUserNo(User user) {
		return userDao.selectUserByUserNo(user);
	}

	// 회원정보 수정처리
	@Override
	public int modifyUserByUserNo(User user) {

		return userDao.modifyUserByUserNo(user);
	}

	// 회원정보 삭제처리
	@Override
	public int deleteUserByUserNo(User user) {
		return userDao.deleteUserByUserNo(user);
	}

	// 회원가입처리
	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	// 로그인 처리
	@Override
	public User selectUserByIdAndPw(User user) {
		return userDao.selectUserByIdAndPw(user);
	}
}
