package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.GroupsDao;
import com.changjiang.entity.Groups;
@Service
public class GroupsServiceImpl implements GroupsService{
	@Autowired
    private GroupsDao groupsDao;
    @Override
    public long getGroupsRowCount(){
        return groupsDao.getGroupsRowCount();
    }
    @Override
    public List<Groups> selectGroups(){
        return groupsDao.selectGroups();
    }
    @Override
    public Groups selectGroupsById(Integer id){
        return groupsDao.selectGroupsById(id);
    }
    @Override
    public int insertGroups(Groups value){
        return groupsDao.insertGroups(value);
    }
    @Override
    public int insertNonEmptyGroups(Groups value){
        return groupsDao.insertNonEmptyGroups(value);
    }
    @Override
    public int deleteGroupsById(Integer id){
        return groupsDao.deleteGroupsById(id);
    }
    @Override
    public int updateGroupsById(Groups enti){
        return groupsDao.updateGroupsById(enti);
    }
    @Override
    public int updateNonEmptyGroupsById(Groups enti){
        return groupsDao.updateNonEmptyGroupsById(enti);
    }

    public GroupsDao getGroupsDao() {
        return this.groupsDao;
    }

    public void setGroupsDao(GroupsDao groupsDao) {
        this.groupsDao = groupsDao;
    }

}