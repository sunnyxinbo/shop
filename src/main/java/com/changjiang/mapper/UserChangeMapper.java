package com.changjiang.mapper;

import com.changjiang.entity.UserChange;

public interface UserChangeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserChange record);

    int insertSelective(UserChange record);

    UserChange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserChange record);

    int updateByPrimaryKey(UserChange record);
}