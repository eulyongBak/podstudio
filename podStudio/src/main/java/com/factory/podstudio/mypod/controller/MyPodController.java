package com.factory.podstudio.mypod.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.factory.podstudio.mypod.model.MyPod;
import com.factory.podstudio.mypod.service.MyPodServiceImpl;
import com.factory.podstudio.user.model.User;

@Controller
public class MyPodController {
	
	@Autowired
	private MyPodServiceImpl myPodService;
	@RequestMapping(value="/myPodcast", method=RequestMethod.POST )
	public String myPodList(Model model, HttpSession session,MyPod mypod, @RequestParam(value = "page", defaultValue = "1") int page){
		User user = (User)session.getAttribute("sessionUser");
		System.out.println("User user ::::" + user);
		
		mypod.setUserNo(user.getUserNo());
		System.out.println("MyPod myPod ::::" + mypod);
		
		List<MyPod> myPodList = myPodService.selectMypodByUserNo(page, mypod);
		
		model.addAttribute("userNo", mypod.getUserNo());
		model.addAttribute("myPodList", myPodList);
		// 값이 제대로 들어오는지
//		System.out.println(myPodList);
		model.addAttribute("page", page);
		model.addAttribute("lastPage", myPodService.getLastPage());
		return "mypage/myPod/myPodList";
		
	}
	@RequestMapping(value="/myPodcast", method=RequestMethod.GET )
	public String myPodList2(Model model, HttpSession session,MyPod mypod, @RequestParam(value = "page", defaultValue = "1") int page){
		User user = (User)session.getAttribute("sessionUser");
		System.out.println("User user ::::" + user);
		
		mypod.setUserNo(user.getUserNo());
		System.out.println("MyPod myPod ::::" + mypod);
		
		List<MyPod> myPodList = myPodService.selectMypodByUserNo(page, mypod);
		
		model.addAttribute("userNo", mypod.getUserNo());
		model.addAttribute("myPodList", myPodList);
		// 값이 제대로 들어오는지
//		System.out.println(myPodList);
		model.addAttribute("page", page);
		model.addAttribute("lastPage", myPodService.getLastPage());
		return "mypage/myPod/myPodList";
		
	}
}
