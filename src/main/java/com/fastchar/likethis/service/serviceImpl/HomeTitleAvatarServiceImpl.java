package com.fastchar.likethis.service.serviceImpl;

import com.fastchar.likethis.dao.HomeAvatarTitleMapper;
import com.fastchar.likethis.pojo.HomeAvatarTitle;
import com.fastchar.likethis.service.HomeTitleAvatarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeTitleAvatarServiceImpl implements HomeTitleAvatarService {
    @Autowired
    private HomeAvatarTitleMapper homeAvatarTitleMapper;

    @Override
    public List<HomeAvatarTitle> getHomeTitleAvatar() {
        List<HomeAvatarTitle> homeAvatarTitles = homeAvatarTitleMapper.selectAll();
        return homeAvatarTitles;
    }
}
