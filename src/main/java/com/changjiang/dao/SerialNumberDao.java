package com.changjiang.dao;
import com.changjiang.entity.SerialNumber;
import java.util.List;
import com.changjiang.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface SerialNumberDao{
    long getSerialNumberRowCount(Assist assist);
    List<SerialNumber> selectSerialNumber(Assist assist);
    SerialNumber selectSerialNumberById(Integer id);
    int insertSerialNumber(SerialNumber value);
    int insertNonEmptySerialNumber(SerialNumber value);
    int deleteSerialNumberById(Integer id);
    int deleteSerialNumber(Assist assist);
    int updateSerialNumberById(SerialNumber enti);
    int updateSerialNumber(@Param("enti") SerialNumber value, @Param("assist") Assist assist);
    int updateNonEmptySerialNumberById(SerialNumber enti);
    int updateNonEmptySerialNumber(@Param("enti") SerialNumber value, @Param("assist") Assist assist);
}