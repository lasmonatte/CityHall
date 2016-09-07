package com.kdc.cityhall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kdc.cityhall.model.UserDto;
import com.kdc.cityhall.model.UserService;

@Controller
public class UserController {

	@Autowired UserService userService;

	@RequestMapping(value="/user/login")
	public ModelAndView loginPage(ModelAndView mav, Authentication auth){
		
		mav.setViewName("/user/login");
		return mav;
	}

	@RequestMapping(value="/user/signUp", method=RequestMethod.POST)
	public ModelAndView signUpControl(ModelAndView mav, UserDto dto, Authentication auth){
		if(dto.getAuthorities()==null || dto.getAuthorities()=="")
			dto.setAuthorities("ROLE_USER");
		
		userService.createUserService(dto);
		mav.setViewName("redirect:/");

		return mav;
	}


	/*// Goto write.jsp
		@RequestMapping(value="/feed/writefeed.it", method=RequestMethod.GET)
		public ModelAndView control(ModelAndView mav, Authentication auth){
			mav.setViewName("t:feed/writefeed");
			return mav;
		}*/
}
