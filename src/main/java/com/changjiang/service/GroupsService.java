package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Groups;
public interface GroupsService{
    long getGroupsRowCount();
    List<Groups> selectGroups();
    Groups selectGroupsById(Integer id);
    int insertGroups(Groups value);
    int insertNonEmptyGroups(Groups value);
    int deleteGroupsById(Integer id);
    int updateGroupsById(Groups enti);
    int updateNonEmptyGroupsById(Groups enti);
}