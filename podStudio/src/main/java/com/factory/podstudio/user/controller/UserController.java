package com.factory.podstudio.user.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.factory.podstudio.user.model.User;
import com.factory.podstudio.user.service.UserServiceImpl;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserServiceImpl userService;

	// 회원가입
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String insert() {
		return "user/userInsertForm";
	}

	// 회원가입 처리
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String insert(User user) {
		logger.info("{}", user.toString());
		userService.insertUser(user);
		return "redirect:/";
	}

	// 로그인
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpSession session, User user) {
		User sessionUser = userService.selectUserByIdAndPw(user);
		if (sessionUser.getUserLeaveDate() == null) {
			// model.addAttribute("sessionUser", sessionUser);
			session.setAttribute("sessionUser", sessionUser);
			// 모델2하고는 가장 비슷한 방법이긴 하나 좋지 않은 방법이다
			// spring 쓰면서 서블릿이 보이지 않게 만든것인데 서블릿이 보이기 때문
			logger.info("sessionUser : {}", sessionUser);
			return "redirect:/";
		}
		return "redirect:/";

	}

	// 로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	// 개인 회원정보보기
	@RequestMapping(value = "/userDetail", method = RequestMethod.GET)
	public String userDetail(HttpSession session, Model model) {
		User user = (User) session.getAttribute("sessionUser");
		User resultUser = userService.selectUserByUserNo(user);
		logger.info("resultUser : {}", resultUser);
		model.addAttribute("user", resultUser);
		return "mypage/user/userDetailForm";

	}

	// 회원 정보수정폼
	@RequestMapping(value = "/modifyUser", method = RequestMethod.GET)
	public String modifyUser(HttpSession session, Model model) {
		User resultUser = (User) session.getAttribute("sessionUser");
		switch (resultUser.getCategoryNo()) {
		case "category_22":
			resultUser.setCategoryNo("서울");
			break;

		case "category_23":
			resultUser.setCategoryNo("부산");
			break;

		case "category_24":
			resultUser.setCategoryNo("대구");
			break;

		case "category_25":
			resultUser.setCategoryNo("인천");
			break;

		case "category_26":
			resultUser.setCategoryNo("광주");
			break;

		case "category_27":
			resultUser.setCategoryNo("대전");
			break;

		case "category_28":
			resultUser.setCategoryNo("울산");
			break;

		case "category_29":
			resultUser.setCategoryNo("세종");
			break;

		case "category_30":
			resultUser.setCategoryNo("경기");
			break;

		case "category_31":
			resultUser.setCategoryNo("강원");
			break;

		case "category_32":
			resultUser.setCategoryNo("충북");
			break;

		case "category_33":
			resultUser.setCategoryNo("충남");
			break;

		case "category_34":
			resultUser.setCategoryNo("전북");
			break;

		case "category_35":
			resultUser.setCategoryNo("전남");
			break;

		case "category_36":
			resultUser.setCategoryNo("경북");
			break;

		case "category_37":
			resultUser.setCategoryNo("경남");
			break;

		case "category_38":
			resultUser.setCategoryNo("제주");
			break;

		}
		model.addAttribute("user", resultUser);
		return "mypage/user/userUpdateForm";
	}

	// 회원정보 수정처리
	@RequestMapping(value = "/modifyUser", method = RequestMethod.POST)
	public String modifyUser(User user) {
		logger.info("user :::::: {} :::::::", user);
		userService.modifyUserByUserNo(user);
		return "redirect:/myPage";
	}

	// 삭제 화면
	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public String noticeDeleteForm() {
		return "mypage/user/userDeleteForm";
	}

	// 회원정보 삭제 처리 탈퇴시간을 기록하기 위해서 update문을 사용한다.
	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public String deleteUser(HttpSession session, User user) {
		logger.info("user ::::::::{}", user);
		userService.deleteUserByUserNo(user);
		session.invalidate();
		return "redirect:/";
	}
}
