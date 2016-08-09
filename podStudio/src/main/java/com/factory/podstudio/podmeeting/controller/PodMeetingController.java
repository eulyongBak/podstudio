package com.factory.podstudio.podmeeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.factory.podstudio.podmeeting.model.PodMeeting;
import com.factory.podstudio.podmeeting.service.PodMeetingServiceImpl;



@Controller
public class PodMeetingController {

	@Autowired
	private PodMeetingServiceImpl podMeetingService;
	
	
	@RequestMapping(value="/insertPodMeeting", method=RequestMethod.GET)
	public String insert(){
		return "podmeeting/podmeetingInsertForm";
	}
	
	@RequestMapping(value="/insertPodMeeting", method=RequestMethod.POST)
	public String insert(PodMeeting podMeeting){
		System.out.println(podMeeting);
		podMeetingService.insertPodMeeting(podMeeting);
		//return "redirect:podmeeting/list";
		return "redirect:/";
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(){
		return "podmeeting/list";
	}	
	
}
