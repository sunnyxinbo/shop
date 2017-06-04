package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.SerialNumber;
public interface SerialNumberService{
    long getSerialNumberRowCount();
    List<SerialNumber> selectSerialNumber();
    SerialNumber selectSerialNumberById(Integer id);
    int insertSerialNumber(SerialNumber value);
    int insertNonEmptySerialNumber(SerialNumber value);
    int deleteSerialNumberById(Integer id);
    int updateSerialNumberById(SerialNumber enti);
    int updateNonEmptySerialNumberById(SerialNumber enti);
}