package com.changjiang.mapper;

import com.changjiang.entity.Function;
import com.changjiang.entity.FunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface FunctionMapper {
	//直接获取所有功能表的数据
	@Select("SELECT * FROM function")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="function_name",property="functionName"),
		@Result(column="upper_level_id",property="upperLevelId"),
		@Result(column="current_level",property="currentLevel")
	})
	List<Function> selectAllFuncton();
    long countByExample(FunctionExample example);

    int deleteByExample(FunctionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Function record);

    int insertSelective(Function record);

    List<Function> selectByExample(FunctionExample example);

    Function selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Function record, @Param("example") FunctionExample example);

    int updateByExample(@Param("record") Function record, @Param("example") FunctionExample example);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);
}