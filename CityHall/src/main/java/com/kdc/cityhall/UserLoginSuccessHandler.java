package com.kdc.cityhall;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class UserLoginSuccessHandler implements AuthenticationSuccessHandler{

	private static final Logger logger = LoggerFactory.getLogger(UserLoginSuccessHandler.class);	

	@Override
	public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication auth)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		logger.info(auth.getName());
		logger.info(auth.getAuthorities().toString());
		logger.info(auth.getDetails().toString());
		logger.info(auth.getPrincipal().toString());

		for(GrantedAuthority a : auth.getAuthorities())
			logger.info(a.getAuthority());

		UserDetails user = (UserDetails)auth.getPrincipal();

		logger.info(String.valueOf(user.isAccountNonExpired()));
		logger.info(String.valueOf(user.isAccountNonLocked()));
		logger.info(String.valueOf(user.isCredentialsNonExpired()));
		logger.info(String.valueOf(user.isEnabled()));

		resp.sendRedirect(req.getContextPath()+"/");

	}

}

