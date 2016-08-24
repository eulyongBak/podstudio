package com.factory.podstudio.listen.service;

import java.util.List;

import com.factory.podstudio.listen.model.Listen;

public interface IListenService {
	void insertListen();
	
	List<Listen> selectListenRankingByListenCount(Listen listen);
}
