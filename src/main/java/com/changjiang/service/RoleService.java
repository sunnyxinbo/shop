package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Role;
public interface RoleService{
    long getRoleRowCount();
    List<Role> selectRole();
    Role selectRoleById(Integer id);
    int insertRole(Role value);
    int insertNonEmptyRole(Role value);
    int deleteRoleById(Integer id);
    int updateRoleById(Role enti);
    int updateNonEmptyRoleById(Role enti);
}