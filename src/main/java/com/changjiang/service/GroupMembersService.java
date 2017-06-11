package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.GroupMembers;
public interface GroupMembersService{
    long getGroupMembersRowCount();
    List<GroupMembers> selectGroupMembers();
    GroupMembers selectGroupMembersById(Integer id);
    int insertGroupMembers(GroupMembers value);
    int insertNonEmptyGroupMembers(GroupMembers value);
    int deleteGroupMembersById(Integer id);
    int updateGroupMembersById(GroupMembers enti);
    int updateNonEmptyGroupMembersById(GroupMembers enti);
}