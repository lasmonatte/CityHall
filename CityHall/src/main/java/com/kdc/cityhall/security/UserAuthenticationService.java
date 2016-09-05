package com.kdc.cityhall.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserAuthenticationService implements UserDetailsService {

	private SqlSessionTemplate sqlSession;

	public UserAuthenticationService() {
		// TODO Auto-generated constructor stub
	}

	public UserAuthenticationService(SqlSessionTemplate sqlSession) {
		// TODO Auto-generated constructor stub
		this.sqlSession = sqlSession;
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Map<String, Object> user = sqlSession.selectOne("kdc.user.loginUser", username);
		if(user == null ) throw new UsernameNotFoundException(username);
		
		List<GrantedAuthority> gas = new ArrayList<GrantedAuthority>();
		gas.add(new SimpleGrantedAuthority(user.get("authority").toString()));
		return new UserDetailsVO(user.get("username").toString(), user.get("password").toString(), user.get("enabled").equals(true),
				true, true, true, gas, user.get("name").toString(), user.get("position").toString());
		
	}
}


