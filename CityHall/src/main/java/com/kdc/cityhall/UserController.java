package com.kdc.cityhall;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/user/loginPage")
	public String loginPage(){
		return "/user/loginPage";
	}
	
}
