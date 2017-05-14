package com.changjiang.mapper;

import com.changjiang.entity.Serial;
import com.changjiang.entity.SerialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SerialMapper {
    long countByExample(SerialExample example);

    int deleteByExample(SerialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Serial record);

    int insertSelective(Serial record);

    List<Serial> selectByExample(SerialExample example);

    Serial selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Serial record, @Param("example") SerialExample example);

    int updateByExample(@Param("record") Serial record, @Param("example") SerialExample example);

    int updateByPrimaryKeySelective(Serial record);

    int updateByPrimaryKey(Serial record);
}