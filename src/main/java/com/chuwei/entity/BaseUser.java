package com.chuwei.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Description:
 * Created by chuw@winning.com
 * Created Date 2017/12/12 10:25
 */
@Entity
@Table(name = "base_user")
public class BaseUser implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String username;
    private String password;
    private String mobile;
    private String email;
    private int status;
    private Date createtime;
    private Date modifytime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 32)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 128)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "mobile", nullable = true, length = 32)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 128)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "createtime", nullable = false)
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "modifytime", nullable = false)
    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseUser baseUser = (BaseUser) o;

        if (id != baseUser.id) return false;
        if (status != baseUser.status) return false;
        if (username != null ? !username.equals(baseUser.username) : baseUser.username != null) return false;
        if (password != null ? !password.equals(baseUser.password) : baseUser.password != null) return false;
        if (mobile != null ? !mobile.equals(baseUser.mobile) : baseUser.mobile != null) return false;
        if (email != null ? !email.equals(baseUser.email) : baseUser.email != null) return false;
        if (createtime != null ? !createtime.equals(baseUser.createtime) : baseUser.createtime != null) return false;
        if (modifytime != null ? !modifytime.equals(baseUser.modifytime) : baseUser.modifytime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (modifytime != null ? modifytime.hashCode() : 0);
        return result;
    }
}
