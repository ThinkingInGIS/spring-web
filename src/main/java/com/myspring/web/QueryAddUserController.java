package com.myspring.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.domain.AddUser;
import com.myspring.service.ShowAddUserService;

@Controller
@RequestMapping("/select")
public class QueryAddUserController {
	
	@Autowired
	private ShowAddUserService showAddUserService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView queryAddUser(HttpServletRequest request){
		String QaddUserName = request.getParameter("QaddUserName");
		String QaddRealName = request.getParameter("QaddRealName");
		List<AddUser> list = showAddUserService.getQueryAddUserList(QaddUserName, QaddRealName);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("showAddUsers");
		mav.addObject("list",list);
		return mav;
	}
}
