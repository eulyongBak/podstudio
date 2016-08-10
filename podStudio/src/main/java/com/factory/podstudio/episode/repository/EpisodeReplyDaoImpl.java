package com.factory.podstudio.episode.repository;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.episode.model.EpisodeReply;

@Repository
public class EpisodeReplyDaoImpl implements IEpisodeReplyDao {
	private static final String NAME_SPACE = "com.factory.podstudio.episode.repository.EpisodeReplyMapper.xml";
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplateEpisodeReply;
	
	@Override
	public List<EpisodeReply> episodeReplyList(Map<String, Object> map) {
		return null;
	}

}
