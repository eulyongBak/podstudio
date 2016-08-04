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

	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String insert() {
		return "user/userInsertForm";
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String insert(User user) {
		logger.info("{}", user.toString());
		userService.insertUser(user);
		return "redirect:/";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpSession session, User user) {
		User sessionUser = userService.getUserByIdAndPw(user);
		logger.info("sessionUser : {}", sessionUser);
		if (sessionUser == null) {
			logger.info("sessionUser : {}", sessionUser);
			return "redirect:/";
			// 로그인 폼으로 포워딩
		} else {
			// model.addAttribute("sessionUser", sessionUser);
			session.setAttribute("sessionUser", sessionUser);
			// 모델2하고는 가장 비슷한 방법이긴 하나 좋지 않은 방법이다
			// spring 쓰면서 서블릿이 보이지 않게 만든것인데 서블릿이 보이기 때문
			logger.info("sessionUser : {}", sessionUser);
			return "redirect:/";
		}
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	@RequestMapping(value = "/userDetail", method = RequestMethod.GET)
	public String userDetail(Model model, User user) {
		User resultUser = userService.selectUserByUserNo(user);
		logger.info("resultUser : {}" , resultUser);
		model.addAttribute("userId", resultUser.getUserId());
		model.addAttribute("userNickname", resultUser.getUserNickname());
		model.addAttribute("userBirth", resultUser.getUserBirth());
		model.addAttribute("userGender", resultUser.getUserGender());
		model.addAttribute("userEmail", resultUser.getUserEmail());
		model.addAttribute("userTelecome", resultUser.getUserTelecom());
		model.addAttribute("userPhone", resultUser.getUserPhone());
		model.addAttribute("userLevel", resultUser.getUserLevel());
		model.addAttribute("userJob", resultUser.getUserJob());
		return "user/userDetailForm";
	}

}
