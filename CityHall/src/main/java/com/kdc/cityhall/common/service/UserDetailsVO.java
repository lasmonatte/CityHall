package com.kdc.cityhall.common.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityCoreVersion;
import org.springframework.security.core.userdetails.User;

public class UserDetailsVO extends User {
	private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

//	String user_urlpath;
	
	public UserDetailsVO(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
//			Collection<? extends GrantedAuthority> authorities, String user_thumb) {
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		// TODO Auto-generated constructor stub
//		this.user_urlpath = user_thumb;
	}

//	public String getUser_thumb() {
//		return user_urlpath;
//	}
//
//	public void setUser_thumb(String user_thumb) {
//		this.user_urlpath = user_thumb;
//	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString() + "; user_urlpath: " + this.user_urlpath;
//	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
