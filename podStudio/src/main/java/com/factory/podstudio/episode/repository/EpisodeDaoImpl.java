package com.factory.podstudio.episode.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.episode.model.Episode;

@Repository
public class EpisodeDaoImpl implements IEpisodeDao {
	private final String NAME_SPACE_EPISODE = "com.factory.podstudio.episode.repository.EpisodeMapper";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplateEpisode;
	
	@Override
	public List<Episode> selectEpisodeListByPodCastNo(Episode episode) {
		return sqlSessionTemplateEpisode.selectList(NAME_SPACE_EPISODE+".selectEpisodeListByPodCastNo", episode);
	}

}
