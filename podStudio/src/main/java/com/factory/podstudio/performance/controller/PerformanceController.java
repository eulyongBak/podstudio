package com.factory.podstudio.performance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.factory.podstudio.performance.model.Performance;
import com.factory.podstudio.performance.service.PerformanceService;

@Controller
public class PerformanceController {

	@Autowired
	private PerformanceService service;

	@RequestMapping(value = "/performanceList", method = RequestMethod.GET)
	public ModelAndView tourlist(@RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
			@RequestParam(value = "startPage", defaultValue = "1") int startPage, Performance performance,
			@RequestParam(value="areacode", defaultValue="37") int areacode) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("PerpomanceList", service.listPerformance(pageSize,startPage));
		mav.setViewName("performance/PerpomanceList");
		mav.addObject("areacode", areacode);
		mav.addObject("startPage", startPage);
		mav.addObject("pageSize", pageSize);
		return mav;
	}

}
