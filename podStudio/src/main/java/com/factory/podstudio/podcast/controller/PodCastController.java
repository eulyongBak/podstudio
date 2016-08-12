package com.factory.podstudio.podcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.podcast.service.PodcastServiceImpl;

@Controller
public class PodCastController {

	@Autowired
	private PodcastServiceImpl podcastService;
	
	@RequestMapping(value = "/podmain", method = RequestMethod.GET)
	public String podcastEpisode(PodCast podcast, Model model) {
		System.out.println("PodCast" + podcast);
		PodCast resultPodCast = podcastService.selectPodcastByPodcastNo(podcast);
		System.out.println(resultPodCast);
		model.addAttribute("categoryMain" , resultPodCast.getCategoryMain());
		model.addAttribute("podcastTitle" ,resultPodCast.getPodCastTitle());
		model.addAttribute("podcastSubTitle", resultPodCast.getPodCastSubTitle());
		return "podMain";
	}
}
