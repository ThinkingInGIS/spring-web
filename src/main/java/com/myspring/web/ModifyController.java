package com.myspring.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.domain.AddUser;
import com.myspring.service.ModifyService;
import com.myspring.service.ShowAddUserService;

@Controller
@RequestMapping("/modifyUser")
public class ModifyController {
	@Autowired
	private ModifyService modifyService;
	
	@Autowired
	private ShowAddUserService showAddUserService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView updateAddUser(HttpServletRequest request){
		
		String addUserName = request.getParameter("addUserName");
		String addPassword = request.getParameter("addPassword");
		String addReallName = request.getParameter("addReallName");
		modifyService.updateAddUser(addUserName, addPassword, addReallName);
		ModelAndView mav = new ModelAndView();
		List<AddUser> list = showAddUserService.showAllAddUser();
		mav.setViewName("showAddUsers");
		mav.addObject("list",list);
		return mav;
	}
}
