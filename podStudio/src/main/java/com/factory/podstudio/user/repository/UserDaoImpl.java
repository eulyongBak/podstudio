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

	@Override
	public int insertUser(User user) {
		return sqlSessionTemplateUser.insert(NAME_SPACE_USER + ".insertUser", user);
		//sqlSessionTemplateUser.insert("com.factory.podstudio.user.repository.UserMapper.insertUser", user);
	}
	

	@Override
	public User selectUserByIdAndPw(User user) {
		return sqlSessionTemplateUser.selectOne(NAME_SPACE_USER+".selectUserByIdAndPw", user);
	}

	@Override
	public User selectUserByUserNo(User user) {
		return sqlSessionTemplateUser.selectOne(NAME_SPACE_USER + ".selectUserByUserNo", user);
	}


	@Override
	public int modifyUserByUserNo(User user) {
		return sqlSessionTemplateUser.update(NAME_SPACE_USER+ ".modifyUserByUserNo", user);
	}

}
