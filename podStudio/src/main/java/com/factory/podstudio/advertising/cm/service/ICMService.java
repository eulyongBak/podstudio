package com.factory.podstudio.advertising.cm.service;

import java.util.List;

import com.factory.podstudio.advertising.cm.model.CM;

public interface ICMService {

	int insertCM(CM cm);
	List<CM> selectCMByUserNo(CM cm);
	
	CM selectCMList(CM cm);
	
	void modifyCMByCMNo();
	
	void deleteCMByCMNo();


}
