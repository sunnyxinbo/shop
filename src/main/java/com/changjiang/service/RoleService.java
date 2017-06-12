package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Role;
import com.changjiang.common.Assist;
public interface RoleService{
    long getRoleRowCount(Assist assist);
    List<Role> selectRole(Assist assist);
    Role selectRoleById(Integer id);
    int insertRole(Role value);
    int insertNonEmptyRole(Role value);
    int deleteRoleById(Integer id);
    int deleteRole(Assist assist);
    int updateRoleById(Role enti);
    int updateRole(Role value, Assist assist);
    int updateNonEmptyRoleById(Role enti);
    int updateNonEmptyRole(Role value, Assist assist);
}