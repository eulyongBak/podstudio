package com.factory.podstudio.advertising.banner.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
