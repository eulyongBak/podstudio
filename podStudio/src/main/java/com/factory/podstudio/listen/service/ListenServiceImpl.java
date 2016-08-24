package com.factory.podstudio.listen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.listen.model.Listen;
import com.factory.podstudio.listen.repository.ListenDaoImpl;

@Service
public class ListenServiceImpl implements IListenService {
	@Autowired
	ListenDaoImpl listenDao;
	
	@Override
	public void insertListen() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Listen> selectListenRankingByListenCount(Listen listen) {
		return listenDao.selectListenRankingByListenCount(listen);
	}

}
