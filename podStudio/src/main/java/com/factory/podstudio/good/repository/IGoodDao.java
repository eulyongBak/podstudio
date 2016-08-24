package com.factory.podstudio.good.repository;

import java.util.List;

import com.factory.podstudio.good.model.Good;

public interface IGoodDao {
	List<Good> selectGoodRankingByGoodCount(Good good);
}
