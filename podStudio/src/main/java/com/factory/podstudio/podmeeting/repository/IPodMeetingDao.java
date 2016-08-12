package com.factory.podstudio.podmeeting.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.factory.podstudio.podmeeting.model.PodMeeting;

@Repository
public interface IPodMeetingDao {

	int insertPodMeeting(PodMeeting podMeeting);
	List<PodMeeting> selectPodMeeting(Map<String, Object> map);
	int selectTotalCount();
	
}
