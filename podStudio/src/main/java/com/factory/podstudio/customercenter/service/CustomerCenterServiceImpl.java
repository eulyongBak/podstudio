package com.factory.podstudio.customercenter.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.customercenter.model.Customercenter;
import com.factory.podstudio.customercenter.repository.CustomerCenterDaoImpl;
import com.factory.podstudio.notice.model.PageHelper;

@Service
public class CustomerCenterServiceImpl implements ICustomerCenterService {
	private static final int LINE_PER_PAGE = 10;
	
	@Autowired private CustomerCenterDaoImpl customerCenterDao;
	
	@Override
	public List<Customercenter> selectCustomerCenterByUserNo(int page) {
		PageHelper pagehelper = new PageHelper(page, LINE_PER_PAGE);
		Map<String ,Object> map = new HashMap<String , Object>();
		map.put("pageHelper", pagehelper);
		return customerCenterDao.selectquestionList(map);
	}
	@Override
	public int getLastPage() {
		
		return (int) (Math.ceil((double) customerCenterDao.selectTotalCount() / LINE_PER_PAGE));
	}
	@Override
	public int insertCustomerCenter(Customercenter customercenter) {
		return customerCenterDao.insertQuestion(customercenter);
	}

	@Override
	public void modifyCustomerCenterByCustomerCenterNo() {
		
	}
	@Override
	public void deleteCustomerCenterByCustomerCenterNo() {
		
	}
	


}
