package com.factory.podstudio.advertising.banner.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.advertising.banner.model.Banner;

@Repository
public class BannerDaoImpl implements IBannerDao {
	private final String NAME_SPACE_BANNER = "com.factory.podstudio.advertising.banner.repository.BannerMapper";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplateBanner;
	
	@Override
	public int insertBanner(Banner banner) {
		return sqlSessionTemplateBanner.insert(NAME_SPACE_BANNER + ".insertBanner", banner);
	}

}
