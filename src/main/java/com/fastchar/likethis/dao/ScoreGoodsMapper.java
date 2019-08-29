package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.ScoreGoods;

public interface ScoreGoodsMapper {
    int insert(ScoreGoods record);

    int insertSelective(ScoreGoods record);
}