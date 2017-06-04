package com.changjiang.controller;



import com.changjiang.entity.Organization;
import com.changjiang.service.OrganizationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by a1996_000 on 2017/6/1.
 * 组织控制层
 */
@Controller
@RequestMapping("/organization")
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;
    /**
     * 查询所有的组织
     * @return
     */
    @RequestMapping(value = "/queryAll")
    public String queryAll(){
        List<Organization> organizations = organizationService.selectOrganization();
        if(organizations != null && organizations.size() > 0){
            for (Organization organization:organizations){
                System.out.println(organization.getName());
            }
        }
        return null;
    }
    /**
     * 查询id为2的组织以及它下所有的组织
     */
    @RequestMapping(value = "/queryByIdBelow")
    public String queryByIdAndBelow(){
        int id=3;
        Organization organization = organizationService.selectOrganizationById(id);
        if (organization != null){
            System.out.println(organization.getName()+"的当前层是: " + organization.getCurrentLevel());
            //查询某组织下的所有组织
            if(organization!=null && organization.getCurrentLevel()!=0){
                List<Organization> organizationList = organizationService.selectOrganizationByCurrentLevelId(organization.getCurrentLevel());
                if(organizationList!=null&&organizationList.size()>0){
                    for(Organization organization1:organizationList){
                        System.out.println(organization1.getName());
                    }
                }
            }
        }
        return null;
    }
}
