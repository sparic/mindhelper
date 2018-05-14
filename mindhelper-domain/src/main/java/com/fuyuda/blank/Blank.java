package com.fuyuda.blank;

import com.fuyuda.core.BaseBean;

import javax.persistence.Table;

/**
 * Created by Administrator on 2018/3/4.
 * 栏目表
 */
@Table(name = "BLANK")
public class Blank extends BaseBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
