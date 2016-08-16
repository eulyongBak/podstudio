package com.factory.podstudio.episode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.episode.repository.EpisodeDaoImpl;

@Service
public class EpisodeServiceImpl implements IEpisodeService {
	@Autowired
	EpisodeDaoImpl episodeDao;
	
	@Override
	public void insertEpisode() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Episode> selectEpisodeListByPodCastNo(Episode episode) {
		return episodeDao.selectEpisodeListByPodCastNo(episode);
	}
	@Override
	public void modifyEpisodeByEpisodeNo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteEpisodeByEpisodeNo() {
		// TODO Auto-generated method stub
		
	}

}
