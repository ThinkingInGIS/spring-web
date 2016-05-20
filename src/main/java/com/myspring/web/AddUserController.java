package com.myspring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.domain.AddUser;
import com.myspring.service.AddUserService;

@Controller
@RequestMapping("/addUser")//addUser
public class AddUserController {
	@Autowired
	private AddUserService addUserService;
	
//	@RequestMapping("/register")
//	public String register(){
//		return "addUser/register";
//	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView addUser(AddUser addUser){
		
		addUserService.createAddUser(addUser);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("createSuccess");
		mav.addObject("addUser",addUser);
		return mav;
	}
	
//	@RequestMapping(method=RequestMethod.POST)
//	public ModelAndView addUser(){
//		
//		List<AddUser> list = addUserService.showAllAddUser();
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("showAddUsers");
//		mav.addObject("list",list);
//		return mav;
//	}
	
}
