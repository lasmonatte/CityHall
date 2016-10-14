package com.kdc.cityhall.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContractController {

	
	@RequestMapping(value="market/c_inquiry", method=RequestMethod.GET)
	public ModelAndView m_listAllControl(ModelAndView mav, Authentication auth){
		
		System.out.println("ASF");
		mav.setViewName("t:market/c_inquiry");
		
		return mav;
	}
}
