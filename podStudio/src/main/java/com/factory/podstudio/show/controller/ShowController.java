package com.factory.podstudio.show.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.factory.podstudio.show.model.Performance;
import com.factory.podstudio.show.service.PerformanceService;



@Controller
public class ShowController {

	@Autowired
	private PerformanceService service;
	
	@RequestMapping(value = "/performanceList", method=RequestMethod.GET)
	public ModelAndView tourlist(@RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
			@RequestParam(value = "statPage", defaultValue = "1") int startPage, Performance performance ,@RequestParam(value = "서울", defaultValue="1") int areaCode) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("PerpomanceList", service.listPerformance(pageSize, (pageSize - 10) + startPage));
		
		mav.setViewName("performance/PerpomanceList");
		return mav;
	}
	
	@RequestMapping(value = "/performanceCategory" , method=RequestMethod.GET)
	public String tourCategory(){
		return "performance/PerpomanceCategory";
	}
}
