package com.factory.podstudio.podmeeting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.factory.podstudio.podmeeting.model.PodMeeting;
import com.factory.podstudio.podmeeting.service.PodMeetingServiceImpl;

@Controller
public class PodMeetingController {

	@Autowired
	private PodMeetingServiceImpl podMeetingService;

	// 홈화면에서 글입력 화면으로
	@RequestMapping(value = "/insertPodMeeting", method = RequestMethod.GET)
	public String insert() {//웹요청을 처리할 메서드
		return "podmeeting/podmeetingInsertForm"; //뷰이름 리턴
		// /WEB-INF/views/podmeeting/podmeetingInsertForm.jsp
	}
  
	// 글 입력화면에서 글입력 처리
	@RequestMapping(value = "/insertPodMeeting", method = RequestMethod.POST)
	public String insert(PodMeeting podMeeting) {
		System.out.println(podMeeting);
		podMeetingService.insertPodMeeting(podMeeting);
		// return "redirect:podmeeting/list";
		return "redirect:/home";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model, @RequestParam(value = "page", defaultValue = "1") int page, 
			@RequestParam(value = "word", required = false) String word) {
		List<PodMeeting> podMeetingList = podMeetingService.selectPodMeetingByPodMeetingNo(page, word);
		model.addAttribute("podMeetingList", podMeetingList);
		// 값이 제대로 들어오는지
		System.out.println(podMeetingList);
		model.addAttribute("page", page);
		model.addAttribute("lastPage", podMeetingService.getLastPage());
		return "podMeeting/podMeetingList";
	}

}
