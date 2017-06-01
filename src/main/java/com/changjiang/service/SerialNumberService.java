package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.SerialNumber;
import com.changjiang.common.Assist;
public interface SerialNumberService{
    long getSerialNumberRowCount(Assist assist);
    List<SerialNumber> selectSerialNumber(Assist assist);
    SerialNumber selectSerialNumberById(Integer id);
    int insertSerialNumber(SerialNumber value);
    int insertNonEmptySerialNumber(SerialNumber value);
    int deleteSerialNumberById(Integer id);
    int deleteSerialNumber(Assist assist);
    int updateSerialNumberById(SerialNumber enti);
    int updateSerialNumber(SerialNumber value, Assist assist);
    int updateNonEmptySerialNumberById(SerialNumber enti);
    int updateNonEmptySerialNumber(SerialNumber value, Assist assist);
}