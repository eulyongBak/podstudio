package com.factory.podstudio.episode.repository;

import java.util.List;

import com.factory.podstudio.episode.model.Episode;

public interface IEpisodeDao {
	List<Episode> selectEpisodeListByPodCastNo(Episode episode);
	
	//에피소드 리스트(controller -> service -> dao -> mapper) - 제작자 권한
	List<Episode> selectEpisodeByUserNo(Episode episode);
}
