package com.lian.web.mapper;

import com.lian.web.model.Test;

public interface TestMapper {
    int deleteByPrimaryKey(Integer b);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer b);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}