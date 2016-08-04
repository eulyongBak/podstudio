package com.factory.podstudio.podcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PodCastController {

	@RequestMapping(value = "/podmain", method = RequestMethod.GET)
	public String podcastEpisode() {
		return "podMain";
	}
}
