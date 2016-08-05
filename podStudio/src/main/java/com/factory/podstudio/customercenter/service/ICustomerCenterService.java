package com.factory.podstudio.customercenter.service;

import java.util.List;

import com.factory.podstudio.customercenter.model.Customercenter;

public interface ICustomerCenterService {
	
	void insertCustomerCenter();
	
	List<Customercenter> selectCustomerCenterByUserNo(int page);
	
	int getLastPage();
	
	void modifyCustomerCenterByCustomerCenterNo();
	
	void deleteCustomerCenterByCustomerCenterNo();

}
