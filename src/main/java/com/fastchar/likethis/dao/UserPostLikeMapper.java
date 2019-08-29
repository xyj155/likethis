package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.UserPostLike;

public interface UserPostLikeMapper {
    int insert(UserPostLike record);

    int insertSelective(UserPostLike record);
}