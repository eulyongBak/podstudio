package com.factory.podstudio.notice.controller;

import java.util.List;

import org.apache.tiles.template.AddAttributeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.factory.podstudio.notice.model.Notice;
import com.factory.podstudio.notice.service.NoticeServiceImpl;

@Controller
public class NoticeController {

	@Autowired
	private NoticeServiceImpl noticeService;
	
	
	//리스트 처리
	@RequestMapping(value = "/noticeList", method = RequestMethod.GET)
	public String noticeList(Model model, @RequestParam(value = "page", defaultValue = "1") int page, 
			@RequestParam(value = "word", required = false) String word) {
		List<Notice> noticelist = noticeService.selectNoticeByNoticeNo(page, word);
		model.addAttribute("noticeList", noticelist);
		// 값이 제대로 들어오는지
		System.out.println(noticelist);
		model.addAttribute("page", page);
		model.addAttribute("lastPage", noticeService.getLastPage());
		return "Customercenter/noticeList";
	}
	//입력 화면
	@RequestMapping(value = "/noticeWrite", method = RequestMethod.GET)
	public String noticeWrite() {
		return "Customercenter/noticeInsertForm";
	}
	//입력 처리
	@RequestMapping(value = "/addNotice", method = RequestMethod.POST)
	public String boardWrite(Notice notice) {
		noticeService.insertNotice(notice);
		// notice 에 저장된 값을 보여준다.
		System.out.println(notice);
		return "redirect:/noticeList";
	}
	//상세보기
	@RequestMapping(value= "/noticeContent", method = RequestMethod.GET)
	public String noticeContent(Model model , Notice notice){
		Notice resultNotice = noticeService.selectOneBynoticeNo(notice);
		model.addAttribute("noticeOne", resultNotice);
		return "Customercenter/noticeDetail";
	}
	//수정 화면
	@RequestMapping(value="/modifyform", method =RequestMethod.GET)
	public String noticeModifyForm(Model model, Notice notice){
		model.addAttribute("noticeOne", noticeService.selectOneBynoticeNo(notice));
		return "Customercenter/noticeModifyForm";
	}
	//수정 하기
	@RequestMapping(value="/noticeModify", method = RequestMethod.POST)
	public String noticeModify(Model model , Notice notice){
		noticeService.modifyNoticeByNoticeNo(notice);
		return "redirect:/noticeList";
	}
	
	//삭제 화면
	@RequestMapping(value="/noticeDeleteForm", method =RequestMethod.GET)
	public String noticeDeleteForm(Model model, Notice notice){
		model.addAttribute("noticeOne", noticeService.selectOneBynoticeNo(notice));
		return "Customercenter/noticeDeleteForm";
	}

	//삭제하기
		@RequestMapping(value="/noticeDelete", method= RequestMethod.POST)
		public String noticeDelete(Model model , Notice notice){
			System.out.println("삭제하기 noticeNo : "+notice.getNoticeNo());
			noticeService.deleteNoticeByNoticeNo(notice);
			return "redirect:/noticeList";
	}
}
