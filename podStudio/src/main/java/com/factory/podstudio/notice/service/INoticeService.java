package com.factory.podstudio.notice.service;

import java.util.*;

import com.factory.podstudio.notice.model.Notice;

public interface INoticeService {
	
	int insertNotice(Notice notice);
	
	List<Notice> selectNoticeByNoticeNo(int page, String word);
	
	int getLastPage();
	
	Notice selectOneBynoticeNo(Notice notice);
	
	void modifyNoticeByNoticeNo();
	
	void deleteNoticeByNoticeNo();


}
