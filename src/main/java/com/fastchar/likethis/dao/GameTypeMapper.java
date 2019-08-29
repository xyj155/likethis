package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.GameType;

public interface GameTypeMapper {
    int insert(GameType record);

    int insertSelective(GameType record);
}