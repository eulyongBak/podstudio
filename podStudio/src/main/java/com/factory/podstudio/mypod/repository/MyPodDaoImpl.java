package com.factory.podstudio.mypod.repository;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.mypod.model.MyPod;

@Repository
public class MyPodDaoImpl implements IMyPodDao {
	private static final String NAME_SPACE ="com.factory.podstudio.mypod.repository.MyPodMapper";
	@Autowired
	SqlSessionTemplate sqlSessionTemplateMyPod;
	
	@Override
	public List<MyPod> selectMypodList(Map<String,Object> map) {
		return sqlSessionTemplateMyPod.selectList(NAME_SPACE+".selectMypodList", map);
	}

	@Override
	public int selectTotalCount() {
		return sqlSessionTemplateMyPod.selectOne(NAME_SPACE+".selectTotalCount");
	}

}
