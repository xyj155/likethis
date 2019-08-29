package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.UserPostComment;

public interface UserPostCommentMapper {
    int insert(UserPostComment record);

    int insertSelective(UserPostComment record);
}