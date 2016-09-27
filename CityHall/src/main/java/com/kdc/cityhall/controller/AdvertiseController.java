package com.kdc.cityhall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kdc.cityhall.service.AdvertisementService;
import com.kdc.cityhall.service.AdvertiserService;

@Controller
public class AdvertiseController {

	@Autowired AdvertiserService adsService;
	@Autowired AdvertisementService admService;
	
	@RequestMapping(value="advertiser/registration")
	public ModelAndView registAdvertiserControl(ModelAndView mav){
		
		mav.setViewName("t:advertise/registration_ads");
		return mav;
	}
}
