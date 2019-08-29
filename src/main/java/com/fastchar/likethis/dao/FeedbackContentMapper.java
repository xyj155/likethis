package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.FeedbackContent;

public interface FeedbackContentMapper {
    int insert(FeedbackContent record);

    int insertSelective(FeedbackContent record);
}