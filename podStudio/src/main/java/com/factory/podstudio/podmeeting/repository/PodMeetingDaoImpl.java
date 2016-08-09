package com.factory.podstudio.podmeeting.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.podmeeting.model.PodMeeting;

@Repository
public class PodMeetingDaoImpl implements IPodMeetingDao {

private final String NAME_SPACE="com.factory.podstudio.podmeeting.repository.PodMeetingMapper";
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplatePodMeeting;
	
	@Override
	public int insertPodMeeting(PodMeeting podMeeting) {
		return sqlSessionTemplatePodMeeting.insert(NAME_SPACE+".insertPodMeeting",podMeeting);
		//sqlSessionTemplate.insert("cafe.isa.lew.repository.LewMapper.insertText",lewBoard);
	}

}
