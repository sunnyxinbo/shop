package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Department;
public interface DepartmentService{
    long getDepartmentRowCount();
    List<Department> selectDepartment();
    Department selectDepartmentById(Integer id);
    int insertDepartment(Department value);
    int insertNonEmptyDepartment(Department value);
    int deleteDepartmentById(Integer id);
    int updateDepartmentById(Department enti);
    int updateNonEmptyDepartmentById(Department enti);
}