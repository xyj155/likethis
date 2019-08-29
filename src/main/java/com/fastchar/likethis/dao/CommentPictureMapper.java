package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.CommentPicture;

public interface CommentPictureMapper {
    int insert(CommentPicture record);

    int insertSelective(CommentPicture record);
}