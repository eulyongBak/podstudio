package com.factory.podstudio.advertising.cm.controller;

import java.security.Provider.Service;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.factory.podstudio.advertising.cm.model.CM;
import com.factory.podstudio.advertising.cm.service.CMServiceImpl;
import com.factory.podstudio.notice.model.Notice;
import com.factory.podstudio.user.model.User;

@Controller
public class CMController {
	private static final Logger logger = LoggerFactory.getLogger(CMController.class);
	
	@Autowired
	private CMServiceImpl cmService;
	
	@RequestMapping(value = "/insertCM", method = RequestMethod.GET)
	public String insert() {
		return "advertising/cmInsertForm";
	}
	
	@RequestMapping(value = "/insertCM", method = RequestMethod.POST)
	public String insert(CM cm) {
		cmService.insertCM(cm);
		return "redirect:/home";
	}
	
	@RequestMapping(value = "/detailListCM", method = RequestMethod.GET)
	public String  detail(Model model, @RequestParam(value = "userNo") String userNo, CM cm)	{
		System.out.println("userNo : "+userNo);
		cm.setUserNo(userNo);
		System.out.println("cm.userNo : "+cm.getUserNo());
		List<CM> cmList = cmService.selectCMByUserNo(cm);
		System.out.println(cmList.size() + "<-- cmList.size()");
		
		
		model.addAttribute("cmList", cmList);
		
		return "advertising/cmDetailList";
	}
}