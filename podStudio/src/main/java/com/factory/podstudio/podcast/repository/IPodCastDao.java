package com.factory.podstudio.podcast.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.factory.podstudio.podcast.model.PodCast;

@Repository
public interface IPodCastDao {
	//팟캐스트 등록 처리 (controller -> service -> dao -> mapper)
	int insertPodcast(PodCast podCast);
	
	//카테고리 번호2까지 다 나오거나 NULL이면 나오지 않도록
	PodCast selectPodcast(Map<String,Object> map);
	
	//나의 팟캐스트 리스트 보기
	List<PodCast> selectPodCastByUserNo(PodCast podCast);
}
