package com.changjiang.dao;
import com.changjiang.entity.Role;
import java.util.List;
public interface RoleDao{
    long getRoleRowCount();
    List<Role> selectRole();
    Role selectRoleById(Integer id);
    int insertRole(Role value);
    int insertNonEmptyRole(Role value);
    int deleteRoleById(Integer id);
    int updateRoleById(Role enti);
    int updateNonEmptyRoleById(Role enti);
}