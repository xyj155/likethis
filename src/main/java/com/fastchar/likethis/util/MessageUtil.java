package com.fastchar.likethis.util;

import com.fastchar.likethis.base.BaseData;

public class MessageUtil {

    /**
     * 成功方法
     * @param object
     * @return
     */
    public static BaseData success(Object object) {
        BaseData result = new BaseData();
        result.setReturnCode("0");
        result.setReturnMsg("SUCCESS");
        result.setData(object);

        return result;
    }

    /**
     * 成功但是
     */
    public static BaseData success() {
        return success(null);
    }

    /**
     * 失败方法
     * @param code
     * @param message
     * @return
     */
    public static BaseData error(String  code, String message) {
        BaseData result = new BaseData();
        result.setReturnCode(code);
        result.setReturnMsg(message);

        return result;
    }
}