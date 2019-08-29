package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.GameInvite;

public interface GameInviteMapper {
    int insert(GameInvite record);

    int insertSelective(GameInvite record);
}