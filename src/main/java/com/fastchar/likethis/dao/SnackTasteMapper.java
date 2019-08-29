package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.SnackTaste;

public interface SnackTasteMapper {
    int insert(SnackTaste record);

    int insertSelective(SnackTaste record);
}