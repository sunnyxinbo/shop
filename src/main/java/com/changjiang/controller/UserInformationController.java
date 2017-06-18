package com.changjiang.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.changjiang.entity.UserEvaluation;
import com.changjiang.entity.UserInformation;
import com.changjiang.service.UserInformationService;

/**
 * 
 * 用户信息控制层
 */
@Controller
@RequestMapping("/userinformation")
public class UserInformationController {
	@Autowired
	private UserInformationService userInformationService;
	/**
	 * 查询用户信息和他的所有评价
	 */
	@RequestMapping(value="/queryuserinfoandevalu/{userinforid}")
	public String queryUserInformationAndEvaluations(@PathVariable("userinforid") Integer userinforid){
		List<UserInformation> userInformations = userInformationService.queryUserInformationAndEvaluations(userinforid);
		if(userInformations != null && userInformations.size() > 0){
			System.out.println("userInformations.size() :" + userInformations.size());
			for(UserInformation userInformation : userInformations){
				List<UserEvaluation> userEvaluations = userInformation.getUserEvaluations();
				if(userEvaluations != null && userEvaluations.size() > 0){
					System.out.println("userEvaluations.size() :"  +  userEvaluations.size());
				}
			}
		}
		System.out.println("userinforid :"  + userinforid);
		return "index";
	}
}
