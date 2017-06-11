package com.changjiang.dao;
import com.changjiang.entity.Area;
import java.util.List;
public interface AreaDao{
    long getAreaRowCount();
    List<Area> selectArea();
    Area selectAreaById(Integer id);
    int insertArea(Area value);
    int insertNonEmptyArea(Area value);
    int deleteAreaById(Integer id);
    int updateAreaById(Area enti);
    int updateNonEmptyAreaById(Area enti);
}