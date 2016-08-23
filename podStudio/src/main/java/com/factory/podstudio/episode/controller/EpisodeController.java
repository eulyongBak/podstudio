package com.factory.podstudio.episode.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.episode.service.EpisodeServiceImpl;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.podcast.service.PodcastServiceImpl;


@Controller
public class EpisodeController {
	
	@Autowired
	private EpisodeServiceImpl episodeService;
	
	@Autowired
	private PodcastServiceImpl podCastService;
	
	// 에피소드 보기
	@RequestMapping(value="/podcastEpisode", method= RequestMethod.GET)
	public String episode(Episode episode, PodCast podCast, Model model) {
		System.out.println("Episode :" + episode);
		System.out.println("PodCast :" + podCast);
		PodCast resultPodCast = podCastService.selectPodcastByPodCastNo(podCast);
		System.out.println("resultPodCast :" + resultPodCast);
		podCast.setPodCastNo(resultPodCast.getPodCastNo());
		
		model.addAttribute("categoryMain" , resultPodCast.getCategoryMain());
		model.addAttribute("podcastTitle" ,resultPodCast.getPodCastTitle());
		model.addAttribute("podcastSubTitle", resultPodCast.getPodCastSubTitle());
		
		episode.setPodCastNo(podCast.getPodCastNo());
		
		
		return "podMain";
	}
	
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