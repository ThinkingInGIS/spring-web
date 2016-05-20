package com.myspring.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.domain.AddUser;
import com.myspring.service.ShowAddUserService;

@Controller
@RequestMapping("/showAddUsers")
public class ShowAddUserController {
	@Autowired
	private ShowAddUserService showAddUserService;
	
//	@RequestMapping("/showAddUsers")
//	public String register(){
//		return "selectUser/showAddUsers";
//	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView getUserList(){
		List<AddUser> list = showAddUserService.showAllAddUser();
		//int numbers = showAddUserService.count();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("showAddUsers");
		mav.addObject("list",list);
		//mav.addObject("numbers",numbers);返回count(*)的个数
		return mav;
	}
	
}
