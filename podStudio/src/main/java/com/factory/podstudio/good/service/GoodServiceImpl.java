package com.factory.podstudio.good.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.good.model.Good;
import com.factory.podstudio.good.repository.GoodDaoImpl;

@Service
public class GoodServiceImpl implements IGoodService {
	@Autowired
	GoodDaoImpl goodDao;
	
	@Override
	public void insertGood() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Good> selectGoodRankingByGoodCount(Good good) {
		return goodDao.selectGoodRankingByGoodCount(good);
	}
}
