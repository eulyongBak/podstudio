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
		return "cm/cmInsertForm";
	}
	
	@RequestMapping(value = "/insertCM", method = RequestMethod.POST)
	public String insert(CM cm) {
		cmService.insertCM(cm);
		return "redirect:/";
	}
	
	
	//내용 백업용
	/*@RequestMapping(value = "/detailListCM", method = RequestMethod.GET)
	public String detail(Model model, CM cm) {
		
		CM resultCM = cmService.selectCMByUserNo(cm);
		model.addAttribute("cmProduct", resultCM.getCmProduct());
		model.addAttribute("cmCompany", resultCM.getCmCompany());
		model.addAttribute("cmContent", resultCM.getCmContent());
		model.addAttribute("cmCount", resultCM.getCmCount());
		model.addAttribute("cmDate", resultCM.getCmDate());
		model.addAttribute("cmServiceStart", resultCM.getCmServiceStart());
		model.addAttribute("cmServiceEnd", resultCM.getCmServiceEnd());
		model.addAttribute("cmStatus", resultCM.getCmStatus());
		
		return "cm/cmDetailForm";
	}*/
	
	/*@RequestMapping(value = "/detailListCM", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam(value = "page", defaultValue = "1") int page,
						@RequestParam(value = "word", required = false) String word, String userNo, CM cm) {
		System.out.println("userNo : "+userNo);
		cm.setUserNo(userNo);
		System.out.println("cm.userNo : "+cm.getUserNo());
		List<CM> cmList = cmService.selectCMByUserNo(page, word, cm);
		//CM resultCM = cmService.selectCMByUserNo(userNo, cm);
		
		model.addAttribute("cmList", cmList);
		
		return "cm/cmDetailForm";
	}*/
	
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


	@RequestMapping(value = "/cmList", method = RequestMethod.GET)
	public String selectList(CM cm) {
		cmService.selectCMList(cm); 
		return "cm/cmList";
	}
	
	/*@RequestMapping(value = "/noticeList", method = RequestMethod.GET)
	public String boardList(Model model, @RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "word", required = false) String word) {
		List<Notice> noticelist = noticeservice.selectNoticeByNoticeNo(page, word);
		model.addAttribute("noticeList", noticelist);
		System.out.println(noticelist);
		model.addAttribute("page", page);
		model.addAttribute("lastPage", noticeservice.getLastPage());
		return "customercenter/noticeList";
	}*/
}