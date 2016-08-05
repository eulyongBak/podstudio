package com.factory.podstudio.customercenter.repository;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.customercenter.model.Customercenter;

@Repository
public class CustomerCenterDaoImpl implements ICustomerCenterDao {
	private static final String NAME_SPACE ="com.factory.podstudio.customercenter.repository.CustomerCenterMapper";
	@Autowired
	private SqlSessionTemplate sqlSessionTemplateCustomerCenter;
	
	@Override
	public List<Customercenter> selectquestionList(Map<String, Object> map) {
		return sqlSessionTemplateCustomerCenter.selectList(NAME_SPACE+".selectQuestion", map);
	}

	@Override
	public int selectTotalCount() {
		return sqlSessionTemplateCustomerCenter.selectOne(NAME_SPACE+".selectTotalCount");
	}

}
