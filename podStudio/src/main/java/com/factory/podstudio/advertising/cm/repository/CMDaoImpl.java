package com.factory.podstudio.advertising.cm.repository;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.advertising.cm.model.CM;

@Repository
public class CMDaoImpl implements ICMDao {
	
private static final String NAME_SPACE_CM ="com.factory.podstudio.advertising.banner.repository.CMMapper";
	
	@Autowired 
	private SqlSessionTemplate sqlSessionTemplateCM;
	
	//CM광고등록
	@Override
	public int insertCM(CM cm) {
		return sqlSessionTemplateCM.insert(NAME_SPACE_CM+".insertCM", cm);
	}
	
	//회원번호에 따른 CM광고정보 리스트보기
	@Override
	public List<CM> selectCMByUserNo(CM cm) {
		return sqlSessionTemplateCM.selectList(NAME_SPACE_CM +".selectCMByUserNo", cm);
				
	}
}
