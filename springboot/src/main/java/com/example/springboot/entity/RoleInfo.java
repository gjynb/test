package com.example.springboot.entity;

import java.util.Date;

/**
 * @author:fjh
 * @Date: 09:39
 */
public class RoleInfo {
    private String id;

    private String roleName;

    private String isDeleted;


    private Date gmt_create;

    private String create_By;

    private Date gmt_Modified;

    private String lastModifiedBy;

    private String version;

    @Override
    public String toString() {
        return "RoleInfo{" +
                "id='" + id + '\'' +
                ", roleName='" + roleName + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", gmt_create=" + gmt_create +
                ", create_By='" + create_By + '\'' +
                ", gmt_Modified=" + gmt_Modified +
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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public String getCreate_By() {
        return create_By;
    }

    public void setCreate_By(String create_By) {
        this.create_By = create_By;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
