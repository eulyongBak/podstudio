package com.factory.podstudio.podcast.repository;

import java.util.List;
import java.util.Map;

import com.factory.podstudio.podcast.model.PodCast;

public interface IPodCastDao {
	PodCast selectPodcast(Map<String,Object> map);
	
	List<PodCast> selectPodCastByUserNo(PodCast podCast);
}
