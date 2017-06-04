package com.changjiang.dao;
import com.changjiang.entity.Organization;
import java.util.List;
public interface OrganizationDao{
    long getOrganizationRowCount();
    List<Organization> selectOrganization();
    Organization selectOrganizationById(Integer id);
    int insertOrganization(Organization value);
    int insertNonEmptyOrganization(Organization value);
    int deleteOrganizationById(Integer id);
    int updateOrganizationById(Organization enti);
    int updateNonEmptyOrganizationById(Organization enti);
    /**
     * 查询某组织下的所有组织
     */
    List<Organization> selectOrganizationByCurrentLevelId(Integer upperlevelid);
}