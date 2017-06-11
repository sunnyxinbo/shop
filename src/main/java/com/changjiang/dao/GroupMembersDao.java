package com.changjiang.dao;
import com.changjiang.entity.GroupMembers;
import java.util.List;
public interface GroupMembersDao{
    long getGroupMembersRowCount();
    List<GroupMembers> selectGroupMembers();
    GroupMembers selectGroupMembersById(Integer id);
    int insertGroupMembers(GroupMembers value);
    int insertNonEmptyGroupMembers(GroupMembers value);
    int deleteGroupMembersById(Integer id);
    int updateGroupMembersById(GroupMembers enti);
    int updateNonEmptyGroupMembersById(GroupMembers enti);
}