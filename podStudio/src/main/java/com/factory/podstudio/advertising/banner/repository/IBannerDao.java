package com.factory.podstudio.advertising.banner.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.factory.podstudio.advertising.banner.model.Banner;

@Repository
public interface IBannerDao {
	int insertBanner(Banner banner);
	
	List<Banner> selectBannerByUserNo(Banner banner);
}
