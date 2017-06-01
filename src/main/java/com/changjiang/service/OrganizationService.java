package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Organization;
import com.changjiang.common.Assist;
public interface OrganizationService{
    long getOrganizationRowCount(Assist assist);
    List<Organization> selectOrganization(Assist assist);
    Organization selectOrganizationById(Integer id);
    int insertOrganization(Organization value);
    int insertNonEmptyOrganization(Organization value);
    int deleteOrganizationById(Integer id);
    int deleteOrganization(Assist assist);
    int updateOrganizationById(Organization enti);
    int updateOrganization(Organization value, Assist assist);
    int updateNonEmptyOrganizationById(Organization enti);
    int updateNonEmptyOrganization(Organization value, Assist assist);
}