package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.SnackShopCar;

public interface SnackShopCarMapper {
    int insert(SnackShopCar record);

    int insertSelective(SnackShopCar record);
}