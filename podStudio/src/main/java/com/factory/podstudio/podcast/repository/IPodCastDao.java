package com.factory.podstudio.podcast.repository;

import java.util.List;

import com.factory.podstudio.podcast.model.PodCast;

public interface IPodCastDao {
	List<PodCast> selectPodcast(PodCast podCast);
}
