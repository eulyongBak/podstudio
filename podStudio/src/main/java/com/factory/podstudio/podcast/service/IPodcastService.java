package com.factory.podstudio.podcast.service;


import java.util.List;

import com.factory.podstudio.podcast.model.PodCast;

public interface IPodcastService {
	//팟캐스트 등록 처리 (controller -> service -> dao -> mapper)
	int insertPodcast(PodCast podCast);

	void modifyPodcastByPodcastNo();

	//카테고리 번호2까지 다 나오거나 NULL이면 나오지 않도록
	PodCast selectPodcastByPodCastNo(PodCast podCast);

	//나의 팟캐스트 리스트 보기
	List<PodCast> selectPodCastByUserNo(PodCast podCast);
	
	void deletePodcastByPodcastNo();

}
