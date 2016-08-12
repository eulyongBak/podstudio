package com.factory.podstudio.advertising.cm.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.advertising.cm.model.CM;
import com.factory.podstudio.advertising.cm.model.CMPageHelper;
import com.factory.podstudio.advertising.cm.repository.CMDaoImpl;
import com.factory.podstudio.notice.model.PageHelper;

@Service
public class CMServiceImpl implements ICMService {
	
	@Autowired
	private CMDaoImpl cmDao;
	
	private static final int LINE_PER_PAGE = 10;
	
	//CM광고 등록
	@Override
	public int insertCM(CM cm) {
		return cmDao.insertCM(cm);
	}
	
	//회원정보(광고주)에 따른 CM광고 정보 리스트 보기
	@Override
	public List<CM> selectCMByUserNo(CM cm) {
		return cmDao.selectCMByUserNo(cm);
	}
	
	@Override
	public void modifyCMByCMNo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteCMByCMNo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public CM selectCMList(CM cm) {
		return null;//cmDao.selectCMList(cm);
	}
}
