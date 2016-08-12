package com.factory.podstudio.advertising.banner.service;

import java.util.List;

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
	public List<Banner> selectBannerByUserNo(Banner banner) {
		return bannerDao.selectBannerByUserNo(banner);

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
