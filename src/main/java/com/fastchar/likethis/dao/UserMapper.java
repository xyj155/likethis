package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}