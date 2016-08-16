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
		// 생년월일 문자열 잘라서 데이터베이스에 넣기
		String birth = user.getUserBirth(), year, month, day;
		int x = birth.indexOf("년");
		int y = birth.indexOf("월");
		int z = birth.indexOf("일");
		year = birth.substring(0, x);
		month = birth.substring(x + 1, y);
		day = birth.substring(y + 1, z);
		birth = year + month + day;
		user.setUserBirth(birth);
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
		switch (user.getCategoryNo()) {
		case "서울":
			user.setCategoryNo("category_22");
			break;

		case "부산":
			user.setCategoryNo("category_23");
			break;

		case "대구":
			user.setCategoryNo("category_24");
			break;

		case "인천":
			user.setCategoryNo("category_25");
			break;

		case "광주":
			user.setCategoryNo("category_26");
			break;

		case "대전":
			user.setCategoryNo("category_27");
			break;

		case "울산":
			user.setCategoryNo("category_28");
			break;

		case "세종":
			user.setCategoryNo("category_29");
			break;

		case "경기":
			user.setCategoryNo("category_30");
			break;

		case "강원":
			user.setCategoryNo("category_31");
			break;

		case "충북":
			user.setCategoryNo("category_32");
			break;

		case "충남":
			user.setCategoryNo("category_33");
			break;

		case "전북":
			user.setCategoryNo("category_34");
			break;

		case "전남":
			user.setCategoryNo("category_35");
			break;

		case "경북":
			user.setCategoryNo("category_36");
			break;

		case "경남":
			user.setCategoryNo("category_37");
			break;

		case "제주":
			user.setCategoryNo("category_38");
			break;

		}
		return userDao.insertUser(user);
	}

	// 로그인 처리
	@Override
	public User selectUserByIdAndPw(User user) {
		return userDao.selectUserByIdAndPw(user);
	}
}
