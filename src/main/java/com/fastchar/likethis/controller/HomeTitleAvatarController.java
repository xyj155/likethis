package com.fastchar.likethis.controller;

import com.fastchar.likethis.enums.MessageEnum;
import com.fastchar.likethis.exception.AspException;
import com.fastchar.likethis.pojo.HomeAvatarTitle;
import com.fastchar.likethis.service.serviceImpl.HomeTitleAvatarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/index")
public class HomeTitleAvatarController {
    @Autowired
    private HomeTitleAvatarServiceImpl homeTitleAvatarService;

    @ResponseBody
    @RequestMapping("/homeTitle")
    public List<HomeAvatarTitle> queryHomeTitle() {
        System.out.println("异常");
        List<HomeAvatarTitle> homeTitleAvatar = homeTitleAvatarService.getHomeTitleAvatar();
        if (homeTitleAvatar.size()>0){
            throw new AspException(MessageEnum.SYSTEM_ERROR);
        }

        return homeTitleAvatar;
    }
}
