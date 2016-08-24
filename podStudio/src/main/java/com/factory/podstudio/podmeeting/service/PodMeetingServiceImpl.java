package com.factory.podstudio.podmeeting.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.customercenter.model.PageHelper;
import com.factory.podstudio.podmeeting.model.PodMeeting;
import com.factory.podstudio.podmeeting.repository.PodMeetingDaoImpl;

@Service
public class PodMeetingServiceImpl implements IPodMeetingService {
	private static final int LINE_PER_PAGE = 10;
	
	@Autowired
	private PodMeetingDaoImpl podMeetingDao;

	@Override
	public int insertPodMeeting(PodMeeting podMeeting) {
		return podMeetingDao.insertPodMeeting(podMeeting);
	}
	
	@Override
	public List<PodMeeting> selectPodMeetingByPodMeetingNo(int page, String word) {
		PageHelper pageHelper = new PageHelper(page, LINE_PER_PAGE);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageHelper", pageHelper);
		map.put("word", word);
		return podMeetingDao.selectPodMeeting(map);
	}

	@Override
	public int getLastPage() {
		return (int) (Math.ceil((double) podMeetingDao.selectTotalCount() / LINE_PER_PAGE));
	}
	
	@Override
	public void selectPodMeetingByUserNo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyPodMeetingByPodMeeting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePodMeetingByPodMeeting() {
		// TODO Auto-generated method stub

	}
	
}
