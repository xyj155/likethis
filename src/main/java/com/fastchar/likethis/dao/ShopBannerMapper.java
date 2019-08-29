package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.ShopBanner;

public interface ShopBannerMapper {
    int insert(ShopBanner record);

    int insertSelective(ShopBanner record);
}