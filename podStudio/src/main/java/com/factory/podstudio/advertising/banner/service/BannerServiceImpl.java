package com.factory.podstudio.advertising.banner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.podstudio.advertising.banner.model.Banner;
import com.factory.podstudio.advertising.banner.repository.BannerDaoImpl;

@Service
public class BannerServiceImpl implements IBannerService {
	
	@Autowired
	BannerDaoImpl bannerDao;

	@Override
	public int insertBanner(Banner banner) {
		return bannerDao.insertBanner(banner);
	}
	@Override
	public void selectBannerByBannerNo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void modifyBannerByBannerNo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteBannerByBannerNo() {
		// TODO Auto-generated method stub
		
	}

}
