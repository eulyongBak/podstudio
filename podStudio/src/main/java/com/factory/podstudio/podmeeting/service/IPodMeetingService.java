package com.factory.podstudio.podmeeting.service;

import java.util.List;

import com.factory.podstudio.podmeeting.model.PodMeeting;

public interface IPodMeetingService {
	int insertPodMeeting(PodMeeting podMeeting);
	List<PodMeeting> selectPodMeetingByPodMeetingNo(int page, String word);
	int getLastPage();
	
	void selectPodMeetingByUserNo();
	
	void modifyPodMeetingByPodMeeting();
	
	void deletePodMeetingByPodMeeting();
	

}
