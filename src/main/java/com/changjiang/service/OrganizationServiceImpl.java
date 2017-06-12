package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.OrganizationDao;
import com.changjiang.entity.Organization;
import com.changjiang.common.Assist;
@Service
public class OrganizationServiceImpl implements OrganizationService{
	@Autowired
    private OrganizationDao organizationDao;
    @Override
    public long getOrganizationRowCount(Assist assist){
        return organizationDao.getOrganizationRowCount(assist);
    }
    @Override
    public List<Organization> selectOrganization(Assist assist){
        return organizationDao.selectOrganization(assist);
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
    public int deleteOrganization(Assist assist){
        return organizationDao.deleteOrganization(assist);
    }
    @Override
    public int updateOrganizationById(Organization enti){
        return organizationDao.updateOrganizationById(enti);
    }
    @Override
    public int updateOrganization(Organization value, Assist assist){
        return organizationDao.updateOrganization(value,assist);
    }
    @Override
    public int updateNonEmptyOrganizationById(Organization enti){
        return organizationDao.updateNonEmptyOrganizationById(enti);
    }
    @Override
    public int updateNonEmptyOrganization(Organization value, Assist assist){
        return organizationDao.updateNonEmptyOrganization(value,assist);
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