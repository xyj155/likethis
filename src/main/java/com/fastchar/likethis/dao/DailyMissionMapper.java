package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.DailyMission;

public interface DailyMissionMapper {
    int insert(DailyMission record);

    int insertSelective(DailyMission record);
}