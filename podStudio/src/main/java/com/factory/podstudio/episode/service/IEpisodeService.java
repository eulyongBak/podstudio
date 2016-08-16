package com.factory.podstudio.episode.service;

import java.util.List;

import com.factory.podstudio.episode.model.Episode;

public interface IEpisodeService {
	
	void insertEpisode();
	
	List<Episode> selectEpisodeListByPodCastNo(Episode episode);
	
	void modifyEpisodeByEpisodeNo();
	
	void deleteEpisodeByEpisodeNo();

}
