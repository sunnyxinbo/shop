package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Organization;
public interface OrganizationService{
    long getOrganizationRowCount();
    List<Organization> selectOrganization();
    Organization selectOrganizationById(Integer id);
    int insertOrganization(Organization value);
    int insertNonEmptyOrganization(Organization value);
    int deleteOrganizationById(Integer id);
    int updateOrganizationById(Organization enti);
    int updateNonEmptyOrganizationById(Organization enti);
    /**
     * 通过currentLevelId查找其下所有的组织
     * @param currentLevelId
     * @return
     */
    public List<Organization> selectOrganizationByCurrentLevelId(Integer currentLevelId);
}