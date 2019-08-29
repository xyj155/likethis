package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.UserBottle;

public interface UserBottleMapper {
    int insert(UserBottle record);

    int insertSelective(UserBottle record);
}