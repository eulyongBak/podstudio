package com.factory.podstudio.podcast.repository;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.podcast.model.PodCast;

@Repository

public class PodCastDaoImpl implements IPodCastDao {
	
	private final String NAME_SPACE_PODCAST = "com.factory.podstudio.podcast.repository.PodCastMapper";
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplatePodCast;
	@Override
	public PodCast selectPodcast(Map<String,Object> map) {
		
		return sqlSessionTemplatePodCast.selectOne(NAME_SPACE_PODCAST+".selectPodCast", map);
	}

}
