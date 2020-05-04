package com.example.springboot.entity;

import java.util.Date;

/**
 * @author:fjh
 * @Date: 09:40
 */
public class SelectUser {
    private String roleName;

    private String userAcct;
    private String userName;
    private String sex;

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "SelectUser{" +
                "roleName='" + roleName + '\'' +
                ", userAcct='" + userAcct + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", gmt_Modified=" + gmt_Modified +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                '}';
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private Date gmt_Modified;

    private String lastModifiedBy;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUserAcct() {
        return userAcct;
    }

    public void setUserAcct(String userAcct) {
        this.userAcct = userAcct;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getGmt_Modified() {
        return gmt_Modified;
    }

    public void setGmt_Modified(Date gmt_Modified) {
        this.gmt_Modified = gmt_Modified;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
}
