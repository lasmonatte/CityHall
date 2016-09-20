package com.kdc.cityhall.service;

import java.util.List;

import com.kdc.cityhall.dto.UserDto;

public interface UserService {

	// Basic
	public int createUserService(UserDto dto);
	public UserDto readUserService(String id);
	public int updateUserInfoService(UserDto dto);
	public int deleteUserService(String id);
	
	
	// Complex
	public List<UserDto> searchUserByIdService(String id);
//	public UserDetailsVO loginUserService(String id);
		
}
