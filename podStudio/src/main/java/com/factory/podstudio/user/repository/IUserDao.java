package com.factory.podstudio.user.repository;

import org.springframework.stereotype.Repository;

import com.factory.podstudio.user.model.User;

@Repository
public interface IUserDao {

	// 회원가입처리
	int insertUser(User user);

	// 로그인처리
	User selectUserByIdAndPw(User user);

	// 개인회원정보보기
	User selectUserByUserNo(User user);

	// 회원정보수정처리
	int modifyUserByUserNo(User user);

	// 회원정보삭제처리
	int deleteUserByUserNo(User user);
}
