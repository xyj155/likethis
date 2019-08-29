package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.ChatRoomType;

public interface ChatRoomTypeMapper {
    int insert(ChatRoomType record);

    int insertSelective(ChatRoomType record);
}