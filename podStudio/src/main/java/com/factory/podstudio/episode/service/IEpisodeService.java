package com.factory.podstudio.episode.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.episode.model.EpisodeFileUpload;

public interface IEpisodeService {
	
	Episode insertEpisode(EpisodeFileUpload episodeFileUpload, HttpServletRequest request);
	//Article addArticle(ArticleCommand articleCommand, HttpServletRequest request);
	
	//에피소드 리스트(controller -> service -> dao -> mapper) - 제작자 권한
	List<Episode> selectEpisodeByUserNo(Episode episode);
	
	List<Episode> selectEpisodeListByPodCastNo(Episode episode);
	
	void modifyEpisodeByEpisodeNo();
	
	void deleteEpisodeByEpisodeNo();

}
