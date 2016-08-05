package com.factory.podstudio.podcast.service;


import com.factory.podstudio.podcast.model.PodCast;

public interface IPodcastService {
	void insertPodcast();

	void modifyPodcastByPodcastNo();

	PodCast selectPodcastByPodcastNo(PodCast podCast);

	void deletePodcastByPodcastNo();

}
