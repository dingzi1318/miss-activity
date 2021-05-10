package com.miss.activity.enums;

/**
 * 平台枚举
 *
 * @author dingzi
 */
public enum PlatformEnum {

    JD_DAOJIA(0, "京东到家"),

    DUODIAN(1, "多点"),

    MEITUAN(2, "美团");

    private final int type;
    private final String desc;

    PlatformEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
