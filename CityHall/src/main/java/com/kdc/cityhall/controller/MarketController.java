package com.kdc.cityhall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kdc.cityhall.service.MarketService;

@Controller
public class MarketController {

	@Autowired MarketService marketService;

	
	/* Market */
	@RequestMapping(value="market/m_registration", method=RequestMethod.GET)
	public ModelAndView m_registrationControl(ModelAndView mav, Authentication auth){
		
		mav.setViewName("t:market/m_registration");
		
		return mav;
	}
	
	@RequestMapping(value="market/m_listAll", method=RequestMethod.GET)
	public ModelAndView m_listAllControl(ModelAndView mav, Authentication auth){
		
		mav.setViewName("t:market/m_listAll");
		
		return mav;
	}
}
