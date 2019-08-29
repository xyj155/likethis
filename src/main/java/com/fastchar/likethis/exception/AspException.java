package com.fastchar.likethis.exception;

import com.fastchar.likethis.enums.MessageEnum;

public class AspException extends RuntimeException {
    private String  code;

    public AspException(MessageEnum messageEnum) {
        super(messageEnum.getMessage());
        this.code = messageEnum.getCode();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}