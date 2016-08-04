package com.factory.podstudio.notice.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.notice.model.Notice;
import com.factory.podstudio.notice.model.PageHelper;
import com.factory.podstudio.notice.repository.INoticeDao;

@Service
public class NoticeServiceImpl implements INoticeService {
	private static final int LINE_PER_PAGE = 10;
	
	@Autowired
	private INoticeDao noticeDao;
	
	@Override
	public List<Notice> selectNoticeByNoticeNo(int page, String word) {
		PageHelper pagehelper = new PageHelper(page, LINE_PER_PAGE);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageHelper", pagehelper);
		map.put("word", word);
		return noticeDao.selectNotice(map);
	}
	@Override
	public int getLastPage() {
		return (int) (Math.ceil((double) noticeDao.selectTotalCount() / LINE_PER_PAGE));
	}
	
	@Override
	public int insertNotice(Notice notice) {
		return noticeDao.insertNotice(notice);
	}
	@Override
	public Notice selectOneBynoticeNo(Notice notice) {
		return noticeDao.noticeOne(notice);
	}
	@Override
	public int modifyNoticeByNoticeNo(Notice notice) {
		return noticeDao.modifyNotice(notice);
	}
	@Override
	public void deleteNoticeByNoticeNo() {
		
	}
	
}
