package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.DailySign;

public interface DailySignMapper {
    int insert(DailySign record);

    int insertSelective(DailySign record);
}