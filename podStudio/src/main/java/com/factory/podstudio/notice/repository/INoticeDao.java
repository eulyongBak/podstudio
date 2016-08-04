package com.factory.podstudio.notice.repository;

import java.util.List;
import java.util.Map;

import com.factory.podstudio.notice.model.Notice;

public interface INoticeDao {
	
	List<Notice> selectNotice(Map<String, Object> map);
	
	int selectTotalCount();
	
	int insertNotice(Notice notice);
	
	Notice noticeOne(Notice notice);
}
