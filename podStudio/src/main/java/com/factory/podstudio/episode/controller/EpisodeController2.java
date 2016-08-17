package com.factory.podstudio.episode.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.episode.model.EpisodeFileUpload;
import com.factory.podstudio.episode.service.EpisodeServiceImpl;

//EpisodeController 내용 백업용.

@Controller
public class EpisodeController2 {
	/*
	@Autowired
	EpisodeServiceImpl episodeService;
	//에피소드 등록
	
	//에피소드 등록 처리
	@RequestMapping(value = "/episodeInsert", method = RequestMethod.GET)
	public String insertEpisode(EpisodeFileUpload episodeFileUpload, HttpServletRequest request, Model model)	{
		Episode resultEpisode = episodeService.insertEpisode(episodeFileUpload, request);
		model.addAttribute("fileName", resultEpisode);
		return "redirect:/";
	}
	
	*/
	
	/*
	@RequestMapping(value = "/addArticle", method = RequestMethod.POST)
	public String addArticle(ArticleCommand article , HttpServletRequest request , Model model) {
		logger.info("{}",article);
		Article resultarticle = articleService.addArticle(article, request);
		// WEB-INF/views/addArticle.jsp
		model.addAttribute("fileName", resultarticle);
		return "redirect:/";
	}
	*/
	
	
	/*
	//팟캐스트 리스트 - 모든 권한(오디오)
	@RequestMapping(value = "/episodeAudioList", method = RequestMethod.GET)
	public String selectEpisodetByUserNo(Model model, Episode episode)	{
		List<Episode> episodeList = episodeService.selectEpisodeListByPodCastNo(episode);
		System.out.println(episodeList.size() + "<-- episodeList.size()");
		
		
		model.addAttribute("episodeList", episodeList);
		
		return "mypage/episode/episodeVideoListForm";
	}
	*/
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
		List<Episode> episodeList = episodeService.selectEpisodeByUserNo(episode);
		System.out.println(episodeList.size() + "<-- episodeList.size()");
		
		model.addAttribute("episodeList", episodeList);
		
		return "mypage/episode/episodeListForm";
	}
	*/
}