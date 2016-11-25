package com.kdc.cityhall.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kdc.cityhall.dto.ContractMarketDto;

@Controller
public class ContractController {

	
	@RequestMapping(value="market/c_inquiry", method=RequestMethod.GET)
	public ModelAndView m_listAllControl(ModelAndView mav, Authentication auth){
		
		System.out.println("ASF");
		mav.setViewName("t:market/c_inquiry");
		
		return mav;
	}
	
	@RequestMapping(value="market/c_registration", method=RequestMethod.GET)
	public ModelAndView c_registControl(ModelAndView mav, Authentication auth){
		
		mav.setViewName("t:market/c_registration");
		
		return mav;
	}
	
	@RequestMapping(value="market/c_registration", method=RequestMethod.POST)
	public ModelAndView c_registrationControl(ModelAndView mav, Authentication auth, ContractMarketDto dto){
		
		System.out.println("Come");
		System.out.println(dto);
		mav.setViewName("t:market/c_registration");
		
		return mav;
	}
	
}
