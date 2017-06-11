package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.DepartmentDao;
import com.changjiang.entity.Department;
@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
    private DepartmentDao departmentDao;
    @Override
    public long getDepartmentRowCount(){
        return departmentDao.getDepartmentRowCount();
    }
    @Override
    public List<Department> selectDepartment(){
        return departmentDao.selectDepartment();
    }
    @Override
    public Department selectDepartmentById(Integer id){
        return departmentDao.selectDepartmentById(id);
    }
    @Override
    public int insertDepartment(Department value){
        return departmentDao.insertDepartment(value);
    }
    @Override
    public int insertNonEmptyDepartment(Department value){
        return departmentDao.insertNonEmptyDepartment(value);
    }
    @Override
    public int deleteDepartmentById(Integer id){
        return departmentDao.deleteDepartmentById(id);
    }
    @Override
    public int updateDepartmentById(Department enti){
        return departmentDao.updateDepartmentById(enti);
    }
    @Override
    public int updateNonEmptyDepartmentById(Department enti){
        return departmentDao.updateNonEmptyDepartmentById(enti);
    }

    public DepartmentDao getDepartmentDao() {
        return this.departmentDao;
    }

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

}