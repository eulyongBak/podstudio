package com.factory.podstudio.advertising.banner.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.factory.podstudio.advertising.banner.model.Banner;
import com.factory.podstudio.advertising.banner.service.BannerServiceImpl;

@Controller
public class BannerController {
	
	private static final Logger logger = LoggerFactory.getLogger(BannerController.class);
	
	@Autowired
	private BannerServiceImpl bannerService;

	//배너광고 추가
	@RequestMapping(value = "/insertBanner", method = RequestMethod.GET)
	public String insert() {
		return "advertising/bannerInsertForm";
	}
	
	// 회원가입 처리
		@RequestMapping(value = "/insertBanner", method = RequestMethod.POST)
		public String insert(Banner banner) {
			logger.info("{}", banner.toString());
			bannerService.insertBanner(banner);
			return "redirect:/";
		}
		
		@RequestMapping(value = "/detailListBanner", method = RequestMethod.GET)
		public String  detail(Model model, @RequestParam(value = "userNo") String userNo, Banner banner)	{
			System.out.println("userNo : "+userNo);
			banner.setUserNo(userNo);
			System.out.println("banner.userNo : "+banner.getUserNo());
			List<Banner> bannerList = bannerService.selectBannerByUserNo(banner);
			System.out.println(bannerList.size() + "<-- bannerList.size()");
			
			
			model.addAttribute("bannerList", bannerList);
			
			return "advertising/bannerDetailList";
		}
}
