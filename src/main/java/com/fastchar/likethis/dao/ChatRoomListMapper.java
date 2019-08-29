package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.ChatRoomList;

public interface ChatRoomListMapper {
    int insert(ChatRoomList record);

    int insertSelective(ChatRoomList record);
}