package com.factory.podstudio.advertising.cm.service;

import com.factory.podstudio.advertising.cm.model.CM;

public interface ICMService {

	int insertCM(CM cm);
	
	void selectCMByCMNo();
	
	void modifyCMByCMNo();
	
	void deleteCMByCMNo();
	
	void selectCMList(CM cm);

}
