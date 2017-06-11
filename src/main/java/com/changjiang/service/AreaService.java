package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Area;
public interface AreaService{
    long getAreaRowCount();
    List<Area> selectArea();
    Area selectAreaById(Integer id);
    int insertArea(Area value);
    int insertNonEmptyArea(Area value);
    int deleteAreaById(Integer id);
    int updateAreaById(Area enti);
    int updateNonEmptyAreaById(Area enti);
}