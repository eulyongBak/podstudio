package com.factory.podstudio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.factory.podstudio.good.model.Good;
import com.factory.podstudio.good.service.GoodServiceImpl;
import com.factory.podstudio.listen.model.Listen;
import com.factory.podstudio.listen.service.ListenServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	GoodServiceImpl goodService;
	
	@Autowired
	ListenServiceImpl listenService;
	
	
	//처음 실행시 - index.jsp로 이동
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {

		return "index";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model1, Model model2, Good good, Listen listen) {
		List<Good> goodRankingList = goodService.selectGoodRankingByGoodCount(good);
		model1.addAttribute("goodRankingList", goodRankingList);
		System.out.println("good : "+good);
		System.out.println("goodRnkingList.size : "+goodRankingList.size());
		
		List<Listen> listenRankingList = listenService.selectListenRankingByListenCount(listen);
		model2.addAttribute("listenRankingList", listenRankingList);
		System.out.println("listen : "+listen);
		System.out.println("listenRankingList.size : "+listenRankingList.size());
		

		return "home";
	}

	@RequestMapping(value = "/introduce", method = RequestMethod.GET)
	public String introduce() {
		return "index";
	}

	@RequestMapping(value="/myPage", method = RequestMethod.GET)
	public String myPage(){
		return "mypage";
		
	}

}
