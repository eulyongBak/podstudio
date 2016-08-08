package com.factory.podstudio.advertising.cm.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.factory.podstudio.advertising.cm.model.CM;

@Repository
public interface ICMDao {
	int insertCM(CM cm);
	
	List<CM> selectCMByUserNo(CM cm);
	
	List<CM> selectCMList(Map<String, Object> map);
}
