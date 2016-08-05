package com.factory.podstudio.customercenter.repository;

import java.util.List;
import java.util.Map;

import com.factory.podstudio.customercenter.model.Customercenter;

public interface ICustomerCenterDao {

	List<Customercenter> selectquestionList(Map<String, Object> map);
	
	int selectTotalCount();
}
