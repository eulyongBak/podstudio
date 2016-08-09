package com.factory.podstudio.podmeeting.service;

import com.factory.podstudio.podmeeting.model.PodMeeting;

public interface IPodMeetingService {
	int insertPodMeeting(PodMeeting podMeeting);
	void selectPodMeetingByUserNo();
	
	void modifyPodMeetingByPodMeeting();
	
	void deletePodMeetingByPodMeeting();

}
