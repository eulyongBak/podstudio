package com.factory.podstudio.episode.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.episode.model.EpisodeFile;

@Repository
public class EpisodeDaoImpl implements IEpisodeDao {
	private final String NAME_SPACE_EPISODE = "com.factory.podstudio.episode.repository.EpisodeMapper";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplateEpisode;
	
	@Override
	public List<Episode> selectEpisodeListByPodCastNo(Episode episode) {
		return sqlSessionTemplateEpisode.selectList(NAME_SPACE_EPISODE+".selectEpisodeListByPodCastNo", episode);
	}

	//에피소드 리스트(controller -> service -> dao -> mapper) - 제작자 권한
	@Override
	public List<Episode> selectEpisodeByUserNo(Episode episode) {
		return sqlSessionTemplateEpisode.selectList(NAME_SPACE_EPISODE+".selectEpisodeListByEpisodeNo", episode);
	}

	@Override
	public int insertEpisode(Episode episode) {
		return sqlSessionTemplateEpisode.insert(NAME_SPACE_EPISODE+".insertEpisode", episode);
	}
}
