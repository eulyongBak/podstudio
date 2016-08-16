package com.factory.podstudio.episode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.episode.service.EpisodeServiceImpl;


@Controller
public class EpisodeController {
	
	@Autowired
	EpisodeServiceImpl episodeService;
	
	
	//팟캐스트 리스트 - 모든 권한(오디오)
	@RequestMapping(value = "/episodeList", method = RequestMethod.GET)
	public String selectPodCastByUserNo(Model model, Episode episode)	{
		List<Episode> episodeList = episodeService.selectEpisodeListByPodCastNo(episode);
		System.out.println(episodeList.size() + "<-- episodeList.size()");
		
		
		model.addAttribute("episodeList", episodeList);
		
		return "mypage/episode/episodeListForm";
	}
	
	/*
	//팟캐스트 리스트 - 모든 권한 (비디오)
	@RequestMapping(value = "/episodeList", method = RequestMethod.GET)
	public String selectPodCastByUserNo(Model model, Episode episode)	{
		List<Episode> episodeList = episodeService.selectEpisodeListByPodCastNo(episode);
		System.out.println(episodeList.size() + "<-- episodeList.size()");
		
		
		model.addAttribute("episodeList", episodeList);
		
		return "mypage/episode/episodeListForm";
	}
	*/
	
	/*
	//팟캐스트 리스트 - 제작자 권한
	@RequestMapping(value = "/episodeList", method = RequestMethod.GET)
	public String selectPodCastByUserNo(Model model, @RequestParam(value = "userNo") String userNo, Episode episode)	{
		System.out.println("userNo : "+userNo);
		episode.setUserNo(userNo);
		System.out.println("episode.userNo : "+episode.getUserNo());
		List<Episode> EpisodeList = episodeService.selectEpisodeByUserNo(episode);
		System.out.println(podCastList.size() + "<-- podCastList.size()");
		
		
		model.addAttribute("episodeList", episodeList);
		
		return "mypage/podcast/podCastListForm";
	}
	*/
}
