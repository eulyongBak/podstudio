package com.factory.podstudio.customercenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.factory.podstudio.customercenter.model.Customercenter;
import com.factory.podstudio.customercenter.service.CustomerCenterServiceImpl;

@Controller
public class CustommerCenterController {

	@Autowired 
	private CustomerCenterServiceImpl customerCenterservice;

	@RequestMapping(value="/questionList", method = RequestMethod.GET)
	public String questionList(Model model, @RequestParam(value = "page", defaultValue = "1") int page){
		List<Customercenter> questionList = customerCenterservice.selectCustomerCenterByUserNo(page);
		model.addAttribute("questionList", questionList);
		// 값이 제대로 들어오는지
		System.out.println("questionList :" +questionList);
		model.addAttribute("page", page);
		model.addAttribute("lastPage", customerCenterservice.getLastPage());
		return "Customercenter/questionList";
	}	

}
