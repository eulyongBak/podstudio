package com.factory.podstudio.studio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.factory.podstudio.advertising.cm.controller.CMController;
import com.factory.podstudio.advertising.cm.service.CMServiceImpl;
import com.factory.podstudio.studio.service.StudioServiceImpl;

@Controller
public class StudioController {
	private static final Logger logger = LoggerFactory.getLogger(StudioController.class);
	private StudioServiceImpl StudioService;
	
	@RequestMapping(value = "/insertStudio", method = RequestMethod.GET)
	public String insert() {
		return "studio/studioInsertForm";
	}

}
