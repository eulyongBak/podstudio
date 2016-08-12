package com.factory.podstudio.user.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.user.model.User;

@Repository
public class UserDaoImpl implements IUserDao {

	private final String NAME_SPACE_USER = "com.factory.podstudio.user.repository.UserMapper";

	@Autowired
	private SqlSessionTemplate sqlSessionTemplateUser;

	// 회원가입처리
	@Override
	public int insertUser(User user) {
		return sqlSessionTemplateUser.insert(NAME_SPACE_USER + ".insertUser", user);
		// sqlSessionTemplateUser.insert("com.factory.podstudio.user.repository.UserMapper.insertUser",
		// user);
	}

	// 로그인 처리
	@Override
	public User selectUserByIdAndPw(User user) {
		return sqlSessionTemplateUser.selectOne(NAME_SPACE_USER + ".selectUserByIdAndPw", user);
	}

	// 개인회원정보보기
	@Override
	public User selectUserByUserNo(User user) {
		return sqlSessionTemplateUser.selectOne(NAME_SPACE_USER + ".selectUserByUserNo", user);
	}

	// 회원정보수정처리
	@Override
	public int modifyUserByUserNo(User user) {
		return sqlSessionTemplateUser.update(NAME_SPACE_USER + ".modifyUserByUserNo", user);
	}

	// 회원정보삭제처리
	@Override
	public int deleteUserByUserNo(User user) {
		return sqlSessionTemplateUser.update(NAME_SPACE_USER + ".deleteUserByUserId", user);
	}

}
