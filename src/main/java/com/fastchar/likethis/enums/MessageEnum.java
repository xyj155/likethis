package com.fastchar.likethis.enums;

public enum MessageEnum {
    SYSTEM_ERROR("1001", "系统异常"),
    NAME_EXCEEDED_CHARRACTER_LIMIT("2000", "姓名超过了限制，最大4个字符!");

    private String  code;

    private String message;

    MessageEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}