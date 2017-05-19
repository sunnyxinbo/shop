package com.changjiang.mapper;

import com.changjiang.entity.Duty;
import com.changjiang.entity.DutyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Results;
import org.springframework.stereotype.Repository;
@Repository
public interface DutyMapper {
	@Select("SELECT * FROM duty WHERE id=#{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="name",property="name"),
		@Result(column="desc",property="desc"),
		@Result(column="grade_id",property="gradeId"),
		@Result(column="store_id",property="storeId"),
		@Result(column="state",property="state")
	})
	Duty testSelect(Integer id);
    long countByExample(DutyExample example);

    int deleteByExample(DutyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Duty record);

    int insertSelective(Duty record);

    List<Duty> selectByExample(DutyExample example);

    Duty selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Duty record, @Param("example") DutyExample example);

    int updateByExample(@Param("record") Duty record, @Param("example") DutyExample example);

    int updateByPrimaryKeySelective(Duty record);

    int updateByPrimaryKey(Duty record);
}