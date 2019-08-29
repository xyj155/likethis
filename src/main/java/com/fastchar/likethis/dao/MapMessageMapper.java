package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.MapMessage;

public interface MapMessageMapper {
    int insert(MapMessage record);

    int insertSelective(MapMessage record);
}