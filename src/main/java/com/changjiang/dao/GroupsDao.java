package com.changjiang.dao;
import com.changjiang.entity.Groups;
import java.util.List;
public interface GroupsDao{
    long getGroupsRowCount();
    List<Groups> selectGroups();
    Groups selectGroupsById(Integer id);
    int insertGroups(Groups value);
    int insertNonEmptyGroups(Groups value);
    int deleteGroupsById(Integer id);
    int updateGroupsById(Groups enti);
    int updateNonEmptyGroupsById(Groups enti);
}