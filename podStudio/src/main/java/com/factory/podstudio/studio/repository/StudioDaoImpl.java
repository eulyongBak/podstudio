package com.factory.podstudio.studio.repository;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.studio.model.Studio;

@Repository
public class StudioDaoImpl implements IStudioDao {
	private final String NAME_SPACE ="com.factory.podstudio.studio.repository.StudioMapper";
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplateStudio;
	
	@Override
	public List<Studio> selectStudio(Map<String, Object> map) {
		return sqlSessionTemplateStudio.selectList(NAME_SPACE+".selectStudio", map);
	}
	
	@Override
	public int selectTotalCount(Studio studio) {
		return sqlSessionTemplateStudio.selectOne(NAME_SPACE+".selectTotalCount");
	}
	
	@Override
	public int insertStudio(Studio studio) {
		return sqlSessionTemplateStudio.insert(NAME_SPACE +".insertStudio", studio);
	}
	
	@Override
	public Studio studioOne(Studio studio) {
		return sqlSessionTemplateStudio.selectOne(NAME_SPACE+".selectOneStudio", studio);
	}
	
	@Override
	public int modifyStudio(Studio studio) {
		return sqlSessionTemplateStudio.update(NAME_SPACE+".modifyStudio", studio);
	}
	
	@Override
	public int deleteStudio(Studio studio) {
		return sqlSessionTemplateStudio.delete(NAME_SPACE+".deleteStudio", studio);
	}

	@Override
	public List<Studio> selectStudioByStudioNo(Studio studio) {
		// TODO Auto-generated method stub
		return null;
	}




}
