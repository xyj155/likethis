package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.UserPostPicture;

public interface UserPostPictureMapper {
    int insert(UserPostPicture record);

    int insertSelective(UserPostPicture record);
}