package com.factory.podstudio.podcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.factory.podstudio.podcast.model.PodCast;

@Controller
public class PodCastController {

	@RequestMapping(value = "/podmain", method = RequestMethod.GET)
	public String podcastEpisode(PodCast podcast, Model model) {
		model.addAttribute("podcast", podcast.getPodCastNo());
		return "podMain";
	}
}
