package com.fastchar.likethis.dao;

import com.fastchar.likethis.pojo.HomeAvatarTitle;

import java.util.List;

public interface HomeAvatarTitleMapper {
    int insert(HomeAvatarTitle record);

    int insertSelective(HomeAvatarTitle record);

    List<HomeAvatarTitle> selectAll( );
}