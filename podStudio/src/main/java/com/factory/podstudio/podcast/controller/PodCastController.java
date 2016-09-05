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
		public String podCast(PodCast podCast) {
			
			return "redirect:/podcastEpisode?podCastNo=" + podCast.getPodCastNo();
		}
	
	//내 팟캐스트 정보 - 미구현
	@RequestMapping(value = "/myPodCastInfo", method = RequestMethod.GET)
	public String myPodCastInfo(PodCast podCast)	{
		return "redirect:/myPage";
	}
	
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
		return "redirect:/home";
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
