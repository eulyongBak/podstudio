package com.factory.podstudio.podmeeting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.podmeeting.model.PodMeeting;
import com.factory.podstudio.podmeeting.repository.PodMeetingDaoImpl;

@Service
public class PodMeetingServiceImpl implements IPodMeetingService {
	
	@Autowired
	private PodMeetingDaoImpl podMeetingDao;

	@Override
	public int insertPodMeeting(PodMeeting podMeeting) {
		return podMeetingDao.insertPodMeeting(podMeeting);
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
