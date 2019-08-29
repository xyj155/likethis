package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.SnackKind;

public interface SnackKindMapper {
    int insert(SnackKind record);

    int insertSelective(SnackKind record);
}