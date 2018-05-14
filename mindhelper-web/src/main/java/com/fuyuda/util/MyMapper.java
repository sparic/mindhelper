package com.fuyuda.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Selim on 2017/6/13.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
