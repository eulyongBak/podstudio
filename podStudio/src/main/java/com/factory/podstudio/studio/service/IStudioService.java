package com.factory.podstudio.studio.service;

import java.util.List;

import com.factory.podstudio.studio.model.Studio;

public interface IStudioService {
	int insertStudio(Studio studio);
	
	int selectStudioByStudioNo(Studio studio);
	
	int modifyStudioByStudioNo(Studio studio);
	
	int deleteStudioByStudioNo(Studio studio);
	
	int getLastPage();
	
	List<Studio> selectStudioByStudioNo(int page, String word);
	
	Studio selectOneByStudioNo(Studio studio);
	

}
