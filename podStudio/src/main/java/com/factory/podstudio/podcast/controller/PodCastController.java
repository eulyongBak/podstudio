package com.factory.podstudio.podcast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.podcast.service.PodcastServiceImpl;

@Controller
public class PodCastController {

	@Autowired
	private PodcastServiceImpl podCastService;
	
	//팟캐스트보기
	@RequestMapping(value = "/podmain", method = RequestMethod.GET)
	public String podcastEpisode(PodCast podcast, Model model) {
		System.out.println("PodCast" + podcast);
		PodCast resultPodCast = podCastService.selectPodcastByPodCastNo(podcast);
		System.out.println(resultPodCast);
		model.addAttribute("categoryMain" , resultPodCast.getCategoryMain());
		model.addAttribute("podcastTitle" ,resultPodCast.getPodCastTitle());
		model.addAttribute("podcastSubTitle", resultPodCast.getPodCastSubTitle());
		return "podMain";
	}
	
	/*
	@RequestMapping(value = "/myPodCastInfo", method = RequestMethod.GET)
	public String myPodCastInfo(PodCast podCast)	{
		return "redirect:/myPage";
	}
	*/
	
	//팟캐스트 등록	
	@RequestMapping(value = "/insertPodCast", method = RequestMethod.GET)
	public String insertPodCast()	{
		return "mypage/podcast/podCastInsertForm";
	}
	
	//팟캐스트 등록 처리
	@RequestMapping(value = "/insertPodCast", method = RequestMethod.POST)
	public String insertPodCast(PodCast podCast)	{
		System.out.println("podCast.userNo : "+podCast.getUserNo());
		podCastService.insertPodcast(podCast);
		System.out.println("podCast.userNo : "+podCast.getUserNo());
		return "redirect:/";
	}
	
	//팟캐스트 리스트
	@RequestMapping(value = "/podCastList", method = RequestMethod.GET)
	public String selectPodCastByUserNo(Model model, @RequestParam(value = "userNo") String userNo, PodCast podCast)	{
		System.out.println("userNo : "+userNo);
		podCast.setUserNo(userNo);
		System.out.println("podCast.userNo : "+podCast.getUserNo());
		List<PodCast> podCastList = podCastService.selectPodCastByUserNo(podCast);
		System.out.println(podCastList.size() + "<-- podCastList.size()");
		
		
		model.addAttribute("podCastList", podCastList);
		
		return "mypage/podcast/podCastListForm";
	}
	
}
