package com.factory.podstudio;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/introduce", method = RequestMethod.GET)
	public String introduce() {
		return "project/introduce";
	}

	@RequestMapping(value = "/developmentEnvironment", method = RequestMethod.GET)
	public String development() {
		return "project/developmentEnvironment";
	}

	@RequestMapping(value = "/erdisign", method = RequestMethod.GET)
	public String erdisign() {
		return "project/erdisign";
	}

	@RequestMapping(value = "/flowChart", method = RequestMethod.GET)
	public String flowChart() {
		return "project/folwChart";
	}

	@RequestMapping(value = "/officialName", method = RequestMethod.GET)
	public String officalName() {
		return "project/officialName";
	}

}
