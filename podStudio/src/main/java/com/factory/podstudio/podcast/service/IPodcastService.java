package com.factory.podstudio.podcast.service;


import java.util.List;

import com.factory.podstudio.podcast.model.PodCast;

public interface IPodcastService {
	void insertPodcast();

	void modifyPodcastByPodcastNo();

	PodCast selectPodcastByPodCastNo(PodCast podCast);
	
	List<PodCast> selectPodCastByUserNo(PodCast podCast);
	
	void deletePodcastByPodcastNo();

}
