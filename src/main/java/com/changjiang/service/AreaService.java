package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Area;
import com.changjiang.common.Assist;
public interface AreaService{
    long getAreaRowCount(Assist assist);
    List<Area> selectArea(Assist assist);
    Area selectAreaById(Integer id);
    int insertArea(Area value);
    int insertNonEmptyArea(Area value);
    int deleteAreaById(Integer id);
    int deleteArea(Assist assist);
    int updateAreaById(Area enti);
    int updateArea(Area value, Assist assist);
    int updateNonEmptyAreaById(Area enti);
    int updateNonEmptyArea(Area value, Assist assist);
}