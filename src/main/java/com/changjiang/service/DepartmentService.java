package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Department;
import com.changjiang.common.Assist;
public interface DepartmentService{
    long getDepartmentRowCount(Assist assist);
    List<Department> selectDepartment(Assist assist);
    Department selectDepartmentById(Integer id);
    int insertDepartment(Department value);
    int insertNonEmptyDepartment(Department value);
    int deleteDepartmentById(Integer id);
    int deleteDepartment(Assist assist);
    int updateDepartmentById(Department enti);
    int updateDepartment(Department value, Assist assist);
    int updateNonEmptyDepartmentById(Department enti);
    int updateNonEmptyDepartment(Department value, Assist assist);
}