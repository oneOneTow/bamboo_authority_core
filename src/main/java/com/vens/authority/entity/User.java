package com.vens.authority.entity;

import java.util.Date;

public class User {
    private long id;
    private String userName;
    private String phone;
    private String email;
    private String password;
    private int createIp;
    private Date createDate;
    private int lastLoginIp;
    private Date lastLoginDate;
    private boolean status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCreateIp() {
        return createIp;
    }

    public void setCreateIp(int createIp) {
        this.createIp = createIp;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(int lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
