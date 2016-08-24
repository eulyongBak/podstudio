package com.factory.podstudio.good.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.good.model.Good;

@Repository
public class GoodDaoImpl implements IGoodDao {
	private final String NAME_SPACE_GOOD = "com.factory.podstudio.good.repository.GoodMapper";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplateGood;

	@Override
	public List<Good> selectGoodRankingByGoodCount(Good good) {
		return sqlSessionTemplateGood.selectList(NAME_SPACE_GOOD +".selectGoodRankingByGoodCount", good);
	}

}
