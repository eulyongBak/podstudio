package com.factory.podstudio.episode.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.episode.model.EpisodeFileUpload;
import com.factory.podstudio.episode.service.EpisodeServiceImpl;


@Controller
public class EpisodeController {
	
	@Autowired
	EpisodeServiceImpl episodeService;
	
	
	
	//에피소드 등록 처리
	@RequestMapping(value = "/episodeInsert", method = RequestMethod.GET)
	public ModelAndView insertEpisode(HttpSession session
									, @ModelAttribute(value="episode") Episode episode
									, @RequestParam(value="files") MultipartFile[] files)	{
		System.out.println("episodeInsert test!");
		final String PATH = session.getServletContext().getRealPath("/resources/upload");
		System.out.println("PATH : "+PATH);
		episode.setPodCastNo((String) session.getAttribute("podCastNo"));
		
		episodeService.insertEpisode(episode, files, PATH);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/");
		
        return modelAndView;
    }
   
	//에피소드 등록
    @RequestMapping(value="/mypage/episode/episodeInsert")
    public ModelAndView addForm(){
        return new ModelAndView("/mypage/episode/episodeInsert");
    }
	
	
	
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
	
	
	
	//팟캐스트 리스트 - 모든 권한(오디오)
	@RequestMapping(value = "/episodeAudioList", method = RequestMethod.GET)
	public String selectEpisodetByUserNo(Model model, Episode episode)	{
		List<Episode> episodeList = episodeService.selectEpisodeListByPodCastNo(episode);
		System.out.println(episodeList.size() + "<-- episodeList.size()");
		
		
		model.addAttribute("episodeList", episodeList);
		
		return "mypage/episode/episodeVideoListForm";
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
}