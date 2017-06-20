package com.changjiang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.changjiang.entity.Users;
import com.changjiang.service.UsersService;

@Controller
public class UsersController {
	@Autowired
	private UsersService service;
	//登录post提交到此
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("username") String username,@RequestParam
			("password") String password,RedirectAttributes model){
		Users u=service.login(username, password);
		//验证成功
		if(u!=null){
			model.addFlashAttribute("user",u);
			return "redirect:/index/";
		}else{
			model.addAttribute("login","1");//验证失败
			return "login";
		}
	}
	//要求在session中可以找到user，才可以登录到index首页
	@RequestMapping(value="/indexManage",method=RequestMethod.GET)
	public String index(Model model){
		if(!model.containsAttribute("user")){
			return "redirect:/login";
		}
		return "index_manage";
	}
}
