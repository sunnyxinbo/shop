package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.RoleDao;
import com.changjiang.entity.Role;
import com.changjiang.common.Assist;
@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
	private RoleDao roleDao;
    @Override
    public long getRoleRowCount(Assist assist){
        return roleDao.getRoleRowCount(assist);
    }
    @Override
    public List<Role> selectRole(Assist assist){
        return roleDao.selectRole(assist);
    }
    @Override
    public Role selectRoleById(Integer id){
        return roleDao.selectRoleById(id);
    }
    @Override
    public int insertRole(Role value){
        return roleDao.insertRole(value);
    }
    @Override
    public int insertNonEmptyRole(Role value){
        return roleDao.insertNonEmptyRole(value);
    }
    @Override
    public int deleteRoleById(Integer id){
        return roleDao.deleteRoleById(id);
    }
    @Override
    public int deleteRole(Assist assist){
        return roleDao.deleteRole(assist);
    }
    @Override
    public int updateRoleById(Role enti){
        return roleDao.updateRoleById(enti);
    }
    @Override
    public int updateRole(Role value, Assist assist){
        return roleDao.updateRole(value,assist);
    }
    @Override
    public int updateNonEmptyRoleById(Role enti){
        return roleDao.updateNonEmptyRoleById(enti);
    }
    @Override
    public int updateNonEmptyRole(Role value, Assist assist){
        return roleDao.updateNonEmptyRole(value,assist);
    }

    public RoleDao getRoleDao() {
        return this.roleDao;
    }

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

}