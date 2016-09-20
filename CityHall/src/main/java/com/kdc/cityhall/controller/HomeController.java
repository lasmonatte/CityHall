package com.kdc.cityhall.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kdc.cityhall.security.UserDetailsVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, ModelAndView mav, Authentication auth) {
		logger.info("Welcome home! The client locale is {}.", locale);
	
		UserDetailsVO vo = (UserDetailsVO) auth.getPrincipal();
		 logger.info("Welcome checkAuth! Authentication is {}.", auth);
		 logger.info("UserDetailsVO == {}.", vo);
		/* System.out.println(auth);
		 System.out.println(vo);*/
/*		 model.addAttribute("auth", auth );
		 model.addAttribute("vo", vo );
*/		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		mav.addObject("serverTime", formattedDate );
		mav.setViewName("t:home");
		return mav;
	}
	
}
