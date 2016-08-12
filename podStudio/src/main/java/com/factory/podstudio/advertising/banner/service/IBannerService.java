package com.factory.podstudio.advertising.banner.service;

import java.util.List;

import com.factory.podstudio.advertising.banner.model.Banner;

public interface IBannerService {

	int insertBanner(Banner banner);
	
	List<Banner> selectBannerByUserNo(Banner banner);
	
	void modifyBannerByBannerNo();
	
	void deleteBannerByBannerNo();

	
}
