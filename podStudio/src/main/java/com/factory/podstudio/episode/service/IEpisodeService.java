package com.factory.podstudio.episode.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.episode.model.EpisodeFileUpload;

public interface IEpisodeService {
	
	int insertEpisode(Episode episode, MultipartFile[] files, String path);
	
	//에피소드 리스트(controller -> service -> dao -> mapper) - 제작자 권한
	List<Episode> selectEpisodeByUserNo(Episode episode);
	
	List<Episode> selectEpisodeListByPodCastNo(Episode episode);
	
	void modifyEpisodeByEpisodeNo();
	
	void deleteEpisodeByEpisodeNo();

}
