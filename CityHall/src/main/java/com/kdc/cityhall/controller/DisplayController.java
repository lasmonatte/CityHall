package com.kdc.cityhall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kdc.cityhall.service.DisplayService;

@Controller
public class DisplayController {

	@Autowired DisplayService service;
	
	@RequestMapping(value="display/registration", method=RequestMethod.GET)
	public ModelAndView registrationControl(ModelAndView mav, Authentication auth){
		
		mav.setViewName("t:display/registration");
		
		return mav;
	}
	
	@RequestMapping(value="display/inquiry", method=RequestMethod.GET)
	public ModelAndView inquiryControl(ModelAndView mav, Authentication auth){
		
		mav.setViewName("t:display/inquiry");

		return mav;
	}
}
