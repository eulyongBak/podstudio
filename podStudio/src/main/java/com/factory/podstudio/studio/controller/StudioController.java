package com.factory.podstudio.studio.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.factory.podstudio.studio.model.Studio;
import com.factory.podstudio.studio.service.StudioServiceImpl;

@Controller
public class StudioController {
	private static final Logger logger = LoggerFactory.getLogger(StudioController.class);
	
	@Autowired
	private StudioServiceImpl studioService;
	
	
	//리스트처리
	@RequestMapping(value ="/studioList", method = RequestMethod.GET)
	public String studioList(Model model,@RequestParam(value="page", defaultValue="1") int page,
			@RequestParam(value="word", required =false) String word){
		List<Studio> studioList = studioService.selectStudioByStudioNo(page, word);
		model.addAttribute("studioList", studioList);
		System.out.println(studioList);
		model.addAttribute("page", page);      
		model.addAttribute("lastPage", studioService.getLastPage());
		return "studio/studioList";
	}
	
	//입력화면
	@RequestMapping(value = "/insertStudio", method = RequestMethod.GET)
	public String insert(){
		return "studio/studioInsertForm";
	}
	
	//입력처리
	@RequestMapping(value = "/insertStudio", method = RequestMethod.POST)
	public String studioInsert(Studio studio) {
		// studio에 저장된 값을 보여준다.
		studioService.insertStudio(studio);
		System.out.println(studio);
		return "redirect:/studio/studioList";
	}
	//상세보기
	@RequestMapping(value= "/studioContent", method = RequestMethod.GET)
	public String studioContent(Model model , Studio studio){
		logger.info("Studio ::::::::: {}",studio);
		Studio resultStudio = studioService.selectOneByStudioNo(studio);
		model.addAttribute("studioOne", resultStudio);
		return "studio/studioDetail";
	}
	//수정화면
	@RequestMapping(value="/studioModify", method = RequestMethod.GET)
	public String studioModifyForm(Model model, Studio studio){
		model.addAttribute("studioOne", studioService.selectOneByStudioNo(studio));
		return "studio/studioModifyForm";
	}
	
	//수정 하기
	@RequestMapping(value="/studioModify", method = RequestMethod.POST)
	public String studioModify(Model model , Studio studio){
		studioService.modifyStudioByStudioNo(studio);
		return "redirect:/studio/studioList";
		}
	//삭제 화면
	@RequestMapping(value="/studioDeleteForm", method =RequestMethod.GET)
	public String studioDeleteForm(Model model, Studio studio){
		model.addAttribute("studioOne", studioService.selectOneByStudioNo(studio));
		return "studio/studioDeleteForm";
	}
	//삭제하기
	@RequestMapping(value="/studioDelete", method= RequestMethod.POST)
	public String studioDelete(Model model , Studio studio){
		studioService.deleteStudioByStudioNo(studio);
		return "redirect:/studio/studioList";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
