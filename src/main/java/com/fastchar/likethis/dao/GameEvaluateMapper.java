package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.GameEvaluate;

public interface GameEvaluateMapper {
    int insert(GameEvaluate record);

    int insertSelective(GameEvaluate record);
}