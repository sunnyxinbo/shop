package com.changjiang.dao;
import com.changjiang.entity.SerialNumber;
import java.util.List;
public interface SerialNumberDao{
    long getSerialNumberRowCount();
    List<SerialNumber> selectSerialNumber();
    SerialNumber selectSerialNumberById(Integer id);
    int insertSerialNumber(SerialNumber value);
    int insertNonEmptySerialNumber(SerialNumber value);
    int deleteSerialNumberById(Integer id);
    int updateSerialNumberById(SerialNumber enti);
    int updateNonEmptySerialNumberById(SerialNumber enti);
}