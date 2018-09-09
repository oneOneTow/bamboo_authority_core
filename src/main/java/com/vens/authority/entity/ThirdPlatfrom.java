package com.vens.authority.entity;

import com.vens.authority.enumType.PlatFromType;

import java.util.Date;

public class ThirdPlatfrom {
    private int id;
    private long uid;
    private String platform;
    private String platformToken;
    private PlatFromType type;
    private String nickname;
    private String avatar;
    private Date createDate;
    private Date updateDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatformToken() {
        return platformToken;
    }

    public void setPlatformToken(String platformToken) {
        this.platformToken = platformToken;
    }

    public PlatFromType getType() {
        return type;
    }

    public void setType(PlatFromType type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
