package com.myspring.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.domain.User;
import com.myspring.service.UserService;

@Controller //标注为一个SpringMVC的Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	//处理index.jsp的请求
	@RequestMapping(value = "/index.html")
	public String loginPage(){
		return "index";
	}
	
	@RequestMapping(value="/loginCheck.html")
	public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand){
		boolean isValidUser = userService.hasMatchUser(loginCommand.getUserName(), loginCommand.getPassword());
		if(!isValidUser){
			return new ModelAndView("index","error","用户名或密码错误");
		}else{
			User user = userService.findUserByUserName(loginCommand.getUserName());
			user.setLastVisit(new Date());
			user.setLastIp(request.getRemoteAddr());
			userService.loginSuccess(user);
			request.getSession().setAttribute("user", user);
			return new ModelAndView("main");
		}
		
	}
}
