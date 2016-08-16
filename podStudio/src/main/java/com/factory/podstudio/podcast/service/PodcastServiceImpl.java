package com.factory.podstudio.podcast.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.podcast.repository.PodCastDaoImpl;

@Service
public class PodcastServiceImpl implements IPodcastService {
	
	@Autowired
	private PodCastDaoImpl podCastDao;

	//팟캐스트 등록 처리 (controller -> service -> dao -> mapper)
	@Override
	public int insertPodcast(PodCast podCast) {
		return podCastDao.insertPodcast(podCast);
	}
	
	@Override
	public void modifyPodcastByPodcastNo() {

	}

	@Override
	public PodCast selectPodcastByPodCastNo(PodCast podCast) {
		Category category = new Category();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("podCast", podCast);
		map.put("category", category);
		
		return podCastDao.selectPodcast(map);
	}

	@Override
	public void deletePodcastByPodcastNo() {

	}

	@Override
	public List<PodCast> selectPodCastByUserNo(PodCast podCast) {
		return podCastDao.selectPodCastByUserNo(podCast);
	}

}
