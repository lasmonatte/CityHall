package com.kdc.cityhall.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/user/loginPage")
	public String loginPage(){
		System.out.println("SSSS");
		return "/user/loginPage";
	}
	
}
