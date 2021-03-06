package com.factory.podstudio.studio.repository;

import java.util.List;
import java.util.Map;

import com.factory.podstudio.studio.model.Studio;

public interface IStudioDao {
	List<Studio> selectStudio(Map<String, Object> map);
	

	int selectTotalCount();
	
	int insertStudio(Studio studio);
	
	Studio studioOne(Studio studio);
	
	int modifyStudio(Studio studio);
	
	int deleteStudio(Studio studio);

}
