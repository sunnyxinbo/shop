package com.changjiang.dao;
import com.changjiang.entity.SerialNumber;
import java.util.List;
/**
 * 
 * @author a1996_000
 * 流水号
 */
public interface SerialNumberDao{
    long getSerialNumberRowCount();
    /**
     * 查询所有的流水号
     * @return
     */
    List<SerialNumber> selectSerialNumber();
    SerialNumber selectSerialNumberById(Integer id);
    int insertSerialNumber(SerialNumber value);
    int insertNonEmptySerialNumber(SerialNumber value);
    int deleteSerialNumberById(Integer id);
    int updateSerialNumberById(SerialNumber enti);
    int updateNonEmptySerialNumberById(SerialNumber enti);
}