package com.factory.podstudio.studio.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.studio.model.PageHelper;
import com.factory.podstudio.studio.model.Studio;
import com.factory.podstudio.studio.repository.IStudioDao;

@Service
public class StudioServiceImpl implements IStudioService {
	private static final int LINE_PER_PAGE = 10;
	
	@Autowired
	private IStudioDao studioDao;
	
	@Override
	public int insertStudio(Studio studio) {
		return studioDao.insertStudio(studio);
	}
	@Override
	public List<Studio> selectStudioByStudioNo(int page, String word) {
		PageHelper pagehelper = new PageHelper(page, LINE_PER_PAGE);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageHelper", pagehelper);
		map.put("word", word);
		return studioDao.selectStudio(map);
	}
	
	@Override
	public int modifyStudioByStudioNo(Studio studio) {
		return studioDao.modifyStudio(studio);
		
	}
	@Override
	public int deleteStudioByStudioNo(Studio studio) {
		return studioDao.deleteStudio(studio);
	}
	
	@Override
	public Studio selectOneByStudioNo(Studio studio) {
		return studioDao.studioOne(studio);
	}
	@Override
	public int selectStudioByStudioNo(Studio studio) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getLastPage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
