package com.factory.podstudio.podcast.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.podcast.repository.PodCastDaoImpl;
import com.factory.podstudio.user.model.User;

@Service
public class PodcastServiceImpl implements IPodcastService {
	
	@Autowired
	private PodCastDaoImpl podCastDaoImpl;
	@Override
	public void insertPodcast() {

	}

	@Override
	public void modifyPodcastByPodcastNo() {

	}

	@Override
	public PodCast selectPodcastByPodcastNo(PodCast podCast) {
		Category category = new Category();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("podCast", podCast);
		map.put("category", category);
		
		return podCastDaoImpl.selectPodcast(map);
	}

	@Override
	public void deletePodcastByPodcastNo() {

	}
}
