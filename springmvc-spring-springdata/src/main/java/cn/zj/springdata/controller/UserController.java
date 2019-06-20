package cn.zj.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zj.springdata.pojo.User;
import cn.zj.springdata.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/login")
	public String login(User user,Model m) {
		System.out.println(user);
		
		User findUser = service.login(user);
		//账号密码错误，登录失败
		if(findUser == null) {
			m.addAttribute("errorMsg", "亲，账号密码错误！！！");
			return "/login.jsp";
		}
		
		return "/index.jsp";
	}
}
