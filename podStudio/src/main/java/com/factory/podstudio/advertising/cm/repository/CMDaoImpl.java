package com.factory.podstudio.advertising.cm.repository;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.advertising.cm.model.CM;

@Repository
public class CMDaoImpl implements ICMDao {
	
private static final String NAME_SPACE_CM ="com.factory.podstudio.advertising.repository.CMMapper";
	
	@Autowired 
	private SqlSessionTemplate sqlSessionTemplateCM;
	
	
	@Override
	public int insertCM(CM cm) {
		
		return sqlSessionTemplateCM.insert(NAME_SPACE_CM+".insertCM", cm);
	}
	
	@Override
	public List<CM> selectCMList(Map<String, Object> map) {
		return sqlSessionTemplateCM.selectList(NAME_SPACE_CM+".selectNotice", map);
	}


}
