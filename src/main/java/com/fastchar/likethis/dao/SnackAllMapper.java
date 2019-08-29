package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.SnackAll;

public interface SnackAllMapper {
    int insert(SnackAll record);

    int insertSelective(SnackAll record);
}