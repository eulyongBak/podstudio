package com.factory.podstudio.mypod.service;

import java.util.List;

import com.factory.podstudio.mypod.model.MyPod;

public interface IMyPodService {
	
	void insertMypod();
	
	int getLastPage();
	
	void modifyMypodByMypodNo();
	
	void deleteMypodByMypodNo();
	
	List<MyPod> selectMypodByUserNo(int page,MyPod userNo);

}
