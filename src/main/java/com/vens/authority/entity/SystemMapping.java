package com.vens.authority.entity;

import java.util.Date;

public class SystemMapping {
    private int id;
    private String systemName;
    private String SystemDesc;
    private String SystemDomain;
    private int createBy;
    private Date createDate;
    private int updateBy;
    private Date updateDate;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemDesc() {
        return SystemDesc;
    }

    public void setSystemDesc(String systemDesc) {
        SystemDesc = systemDesc;
    }

    public String getSystemDomain() {
        return SystemDomain;
    }

    public void setSystemDomain(String systemDomain) {
        SystemDomain = systemDomain;
    }

    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(int updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
