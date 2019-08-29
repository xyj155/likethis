package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.ShopList;

public interface ShopListMapper {
    int insert(ShopList record);

    int insertSelective(ShopList record);
}