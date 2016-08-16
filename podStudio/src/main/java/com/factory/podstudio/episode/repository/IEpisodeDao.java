package com.factory.podstudio.episode.repository;

import java.util.List;

import com.factory.podstudio.episode.model.Episode;

public interface IEpisodeDao {
	List<Episode> selectEpisodeListByPodCastNo(Episode episode);
}
