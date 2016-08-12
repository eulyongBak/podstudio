package com.factory.podstudio.advertising.banner.repository;

import org.springframework.stereotype.Repository;

import com.factory.podstudio.advertising.banner.model.Banner;

@Repository
public interface IBannerDao {
	int insertBanner(Banner banner);
}
