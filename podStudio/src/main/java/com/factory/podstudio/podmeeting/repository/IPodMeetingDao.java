package com.factory.podstudio.podmeeting.repository;

import org.springframework.stereotype.Repository;

import com.factory.podstudio.podmeeting.model.PodMeeting;

@Repository
public interface IPodMeetingDao {

	int insertPodMeeting(PodMeeting podMeeting);
	
}
