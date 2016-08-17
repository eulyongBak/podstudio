package com.factory.podstudio.mypod.repository;

import java.util.List;
import java.util.Map;

import com.factory.podstudio.mypod.model.MyPod;

public interface IMyPodDao {
	List<MyPod> selectMypodList(Map<String,Object> map);
	
	int selectTotalCount();
}
