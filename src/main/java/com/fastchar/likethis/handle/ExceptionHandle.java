package com.fastchar.likethis.handle;

import com.fastchar.likethis.base.BaseData;
import com.fastchar.likethis.exception.AspException;
import com.fastchar.likethis.util.MessageUtil;
import org.apache.ibatis.annotations.Result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseData handle(Exception e) {
        logger.info("进入error");

        // 是否属于自定义异常
        if (e instanceof AspException) {
            AspException userException = (AspException) e;

            return MessageUtil.error(userException.getCode(), userException.getMessage());
        } else {
            logger.error("系统异常 {}", e);
            return MessageUtil.error("BaseData", "系统异常!");
        }
    }
}