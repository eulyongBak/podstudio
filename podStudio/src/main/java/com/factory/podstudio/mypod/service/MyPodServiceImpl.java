package com.factory.podstudio.mypod.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.mypod.model.MyPod;
import com.factory.podstudio.mypod.repository.MyPodDaoImpl;
import com.factory.podstudio.notice.model.PageHelper;

@Service
public class MyPodServiceImpl implements IMyPodService {
	
	private static final int LINE_PER_PAGE = 10;
	
	@Autowired
	private MyPodDaoImpl myPodDao;
	@Override
	public List<MyPod> selectMypodByUserNo(int page, MyPod userNo) {
		PageHelper pagehelper = new PageHelper(page, LINE_PER_PAGE);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageHelper", pagehelper);
		map.put("MyPod", userNo);
		return myPodDao.selectMypodList(map);
	}
	@Override
	public int getLastPage() {
		return (int) (Math.ceil((double) myPodDao.selectTotalCount() / LINE_PER_PAGE));
	}
	@Override
	public void modifyMypodByMypodNo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteMypodByMypodNo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertMypod() {
		// TODO Auto-generated method stub
		
	}
	

}
