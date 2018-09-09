package com.vens.authority.enumType;

public enum PlatFromType implements BaseEnum {
    qq(0,"QQ"),
    weiBo(1,"微博"),
    weChat(2,"微信"),
    facebook(3,"facebook"),
    github(4,"github");
    private int code;
    private String desc;

    PlatFromType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return 0;
    }
}
