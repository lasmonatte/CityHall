package com.kdc.cityhall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kdc.cityhall.dto.ContractMarketDto;
import com.kdc.cityhall.dto.DisplayDto;
import com.kdc.cityhall.dto.MarketDto;
import com.kdc.cityhall.dto.PaymentDto;
import com.kdc.cityhall.service.ContractMarketService;
import com.kdc.cityhall.service.DisplayService;
import com.kdc.cityhall.service.MarketService;
import com.kdc.cityhall.service.PaymentService;

@Controller
public class MarketController {

	@Autowired MarketService marketService;
	@Autowired ContractMarketService c_marketService;
	@Autowired DisplayService displayService;
	@Autowired PaymentService paymentService;
	
	/* Market */
	@RequestMapping(value="market/m_registration", method=RequestMethod.GET)
	public ModelAndView m_registrationControl(ModelAndView mav, Authentication auth){
		
		mav.setViewName("t:market/m_registration");
		
		return mav;
	}
	
	@RequestMapping(value="market/m_listAll", method=RequestMethod.GET)
	public ModelAndView m_listAllControl(ModelAndView mav, Authentication auth){
		List<MarketDto> marketDtoList = marketService.readMarketAllService();
		mav.addObject("marketDtoList", marketDtoList);
		mav.setViewName("t:market/m_listAll");
		
		return mav;
	}
	
	/* Search */
	@RequestMapping(value="market/search")
	public ModelAndView m_searchControl(ModelAndView mav, Authentication auth, String search){
		
		List<MarketDto> marketDtoList = marketService.readMarketByNameService(search);
		
		mav.addObject("marketDtoList", marketDtoList);
		return mav;
	}
	
	
	@RequestMapping(value="market/m_inquiry")
	public ModelAndView m_inquiryControl(ModelAndView mav, Authentication auth, int market_num){
		System.out.println("I'm Here");
		MarketDto marketDtoList = marketService.readMarketOneService(market_num);
		ContractMarketDto c_marketDtoList = c_marketService.readContractMarketOneService(market_num);
		List<DisplayDto> displayDtoList = displayService.readDisplayByMarketNumService(market_num);
		List<PaymentDto> paymentDtoList = paymentService.readPaymentByMarketNumService(market_num);
				
		mav.addObject("marketDtoList", marketDtoList);
		mav.addObject("c_marketDtoList", c_marketDtoList);
		mav.addObject("displayDtoList", displayDtoList);
		mav.addObject("paymentDtoList", paymentDtoList);
		
		mav.setViewName("t:market/m_inquiry");
		
		return mav;
	}
}
