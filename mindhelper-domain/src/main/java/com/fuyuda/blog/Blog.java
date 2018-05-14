package com.fuyuda.blog;

import com.fuyuda.core.BaseBean;

import javax.persistence.Table;

/**
 * Created by Administrator on 2018/3/4.
 * 博客表
 */
@Table(name = "BLOG")
public class Blog extends BaseBean{

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
