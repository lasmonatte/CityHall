package com.kdc.cityhall.model;

import java.util.List;

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
