package com.factory.podstudio.customercenter.service;

import java.util.List;

import com.factory.podstudio.customercenter.model.Customercenter;

public interface ICustomerCenterService {
	
	int insertCustomerCenter(Customercenter customercenter);
	
	List<Customercenter> selectCustomerCenterByUserNo(int page);
	
	int getLastPage();
	
	Customercenter selectOneCustomercenter(Customercenter customercenter);

}
