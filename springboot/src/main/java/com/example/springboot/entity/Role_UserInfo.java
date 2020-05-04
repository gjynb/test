package com.example.springboot.entity;

import java.util.Date;

/**
 * @author:fjh
 * @Date: 09:40
 */
public class Role_UserInfo {
    private String id;

    private String roleID;

    private String userId;

    private String isDeleted;

    private Date gmtCreate;

    private String create_by;

    private Date gmtModified;

    private String lastModifiedBy;

    private String version;

    @Override
    public String toString() {
        return "Role_UserInfo{" +
                "id='" + id + '\'' +
                ", roleID='" + roleID + '\'' +
                ", userId='" + userId + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", create_by='" + create_by + '\'' +
                ", gmtModified=" + gmtModified +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
