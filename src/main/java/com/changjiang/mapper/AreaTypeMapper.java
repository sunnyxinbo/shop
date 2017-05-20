package com.changjiang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.changjiang.entity.Area;
import com.changjiang.entity.AreaType;

public interface AreaTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AreaType record);

    int insertSelective(AreaType record);

    AreaType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AreaType record);

    int updateByPrimaryKey(AreaType record);
    @Select("call select_area_by_type(#{typeId,jdbcType=INTEGER,mode=IN})")
    @Results({
    	@Result(id=true,column="id",property="id"),
    	@Result(column="name",property="name"),
    	@Result(column="area_type_id",property="areaTypeId"),
    	@Result(column="store_id",property="storeId"),
    	@Result(column="state",property="state"),
    	@Result(column="desc",property="desc"),
    	@Result(column="upper_level_id",property="upperLevelId"),
    	@Result(column="current_level",property="currentLevel")
    })
    List<Area> selectAreaByType(Integer typeId);
}