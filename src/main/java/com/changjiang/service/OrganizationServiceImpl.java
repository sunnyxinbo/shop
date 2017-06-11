package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.OrganizationDao;
import com.changjiang.entity.Organization;
@Service
public class OrganizationServiceImpl implements OrganizationService{
	@Autowired
    private OrganizationDao organizationDao;
    @Override
    public long getOrganizationRowCount(){
        return organizationDao.getOrganizationRowCount();
    }
    @Override
    public List<Organization> selectOrganization(){
        return organizationDao.selectOrganization();
    }
    @Override
    public Organization selectOrganizationById(Integer id){
        return organizationDao.selectOrganizationById(id);
    }
    @Override
    public int insertOrganization(Organization value){
        return organizationDao.insertOrganization(value);
    }
    @Override
    public int insertNonEmptyOrganization(Organization value){
        return organizationDao.insertNonEmptyOrganization(value);
    }
    @Override
    public int deleteOrganizationById(Integer id){
        return organizationDao.deleteOrganizationById(id);
    }
    @Override
    public int updateOrganizationById(Organization enti){
        return organizationDao.updateOrganizationById(enti);
    }
    @Override
    public int updateNonEmptyOrganizationById(Organization enti){
        return organizationDao.updateNonEmptyOrganizationById(enti);
    }

    public OrganizationDao getOrganizationDao() {
        return this.organizationDao;
    }

    public void setOrganizationDao(OrganizationDao organizationDao) {
        this.organizationDao = organizationDao;
    }
    /**
     * 通过currentLevelId查找其下所有的组织
     */
    public List<Organization> selectOrganizationByCurrentLevelId(Integer currentLevelId){
        return organizationDao.selectOrganizationByCurrentLevelId(currentLevelId);
    }
}