package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.GroupMembersDao;
import com.changjiang.entity.GroupMembers;
@Service
public class GroupMembersServiceImpl implements GroupMembersService{
	@Autowired
    private GroupMembersDao groupMembersDao;
    @Override
    public long getGroupMembersRowCount(){
        return groupMembersDao.getGroupMembersRowCount();
    }
    @Override
    public List<GroupMembers> selectGroupMembers(){
        return groupMembersDao.selectGroupMembers();
    }
    @Override
    public GroupMembers selectGroupMembersById(Integer id){
        return groupMembersDao.selectGroupMembersById(id);
    }
    @Override
    public int insertGroupMembers(GroupMembers value){
        return groupMembersDao.insertGroupMembers(value);
    }
    @Override
    public int insertNonEmptyGroupMembers(GroupMembers value){
        return groupMembersDao.insertNonEmptyGroupMembers(value);
    }
    @Override
    public int deleteGroupMembersById(Integer id){
        return groupMembersDao.deleteGroupMembersById(id);
    }
    @Override
    public int updateGroupMembersById(GroupMembers enti){
        return groupMembersDao.updateGroupMembersById(enti);
    }
    @Override
    public int updateNonEmptyGroupMembersById(GroupMembers enti){
        return groupMembersDao.updateNonEmptyGroupMembersById(enti);
    }

    public GroupMembersDao getGroupMembersDao() {
        return this.groupMembersDao;
    }

    public void setGroupMembersDao(GroupMembersDao groupMembersDao) {
        this.groupMembersDao = groupMembersDao;
    }

}