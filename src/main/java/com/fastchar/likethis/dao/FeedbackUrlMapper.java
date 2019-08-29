package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.FeedbackUrl;

public interface FeedbackUrlMapper {
    int insert(FeedbackUrl record);

    int insertSelective(FeedbackUrl record);
}