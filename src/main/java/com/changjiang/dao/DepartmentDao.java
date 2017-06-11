package com.changjiang.dao;
import com.changjiang.entity.Department;
import java.util.List;
public interface DepartmentDao{
    long getDepartmentRowCount();
    List<Department> selectDepartment();
    Department selectDepartmentById(Integer id);
    int insertDepartment(Department value);
    int insertNonEmptyDepartment(Department value);
    int deleteDepartmentById(Integer id);
    int updateDepartmentById(Department enti);
    int updateNonEmptyDepartmentById(Department enti);
}