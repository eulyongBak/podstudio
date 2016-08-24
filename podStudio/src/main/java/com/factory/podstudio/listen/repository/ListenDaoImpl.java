package com.factory.podstudio.listen.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.listen.model.Listen;

@Repository
public class ListenDaoImpl implements IListenDao {
	private final String NAME_SPACE_LISTEN = "com.factory.podstudio.listen.repository.ListenMapper";
	@Autowired
	SqlSessionTemplate sqlSessionTemplateListen;

	@Override
	public List<Listen> selectListenRankingByListenCount(Listen listen) {
		return sqlSessionTemplateListen.selectList(NAME_SPACE_LISTEN +".selectListenRankingByListenCount", listen);
	}

}
