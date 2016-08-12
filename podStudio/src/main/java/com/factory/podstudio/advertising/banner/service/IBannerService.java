package com.factory.podstudio.advertising.banner.service;

import com.factory.podstudio.advertising.banner.model.Banner;

public interface IBannerService {

	int insertBanner(Banner banner);
	
	void selectBannerByBannerNo();
	
	void modifyBannerByBannerNo();
	
	void deleteBannerByBannerNo();

	
}
