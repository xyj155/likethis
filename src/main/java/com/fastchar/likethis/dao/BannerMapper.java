package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.Banner;

public interface BannerMapper {
    int insert(Banner record);

    int insertSelective(Banner record);
}