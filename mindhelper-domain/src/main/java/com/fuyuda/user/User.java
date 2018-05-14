package com.fuyuda.user;

import com.fuyuda.core.BaseBean;

import javax.persistence.Table;

/**
 * Created by Administrator on 2018/3/4.
 * 用户表
 */
@Table(name = "USER")
public class User extends BaseBean {

    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
