package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.UserMission;

public interface UserMissionMapper {
    int insert(UserMission record);

    int insertSelective(UserMission record);
}