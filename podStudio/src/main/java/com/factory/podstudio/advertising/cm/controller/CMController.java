package com.factory.podstudio.advertising.cm.controller;

import java.util.List;

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
		logger.debug("{}", cm.toString());
		return "redirect:/";
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