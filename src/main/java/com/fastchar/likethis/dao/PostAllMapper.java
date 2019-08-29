package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.PostAll;

public interface PostAllMapper {
    int insert(PostAll record);

    int insertSelective(PostAll record);
}