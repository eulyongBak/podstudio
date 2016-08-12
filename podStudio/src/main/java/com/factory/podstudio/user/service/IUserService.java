package com.factory.podstudio.user.service;

import com.factory.podstudio.user.model.User;

public interface IUserService {

	// 회원가입처리
	int insertUser(User user);

	// 개인 회원정보보기
	User selectUserByUserNo(User user);

	// 회원수정처리
	int modifyUserByUserNo(User user);

	// 회원삭제처리
	int deleteUserByUserNo(User user);

	// 로그인처리
	User selectUserByIdAndPw(User user);

}
