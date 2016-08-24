package com.factory.podstudio.good.service;

import java.util.List;

import com.factory.podstudio.good.model.Good;

public interface IGoodService {
	
	void insertGood();
	
	List<Good> selectGoodRankingByGoodCount(Good good);



}
