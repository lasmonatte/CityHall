package com.kdc.cityhall.user.model;

import java.util.List;

public interface UserService {

	// Basic
	public int createUserService(UserDto dto);
	public UserDto readUserService(String id);
	public int updateUserInfoService(UserDto before_dto, UserDto after_Dto);
	public int deleteUserService(String id);
	
	
	// Complex
	public List<UserDto> searchUserByIdService(String search);
//	public UserDetailsVO loginUserService(String id);
		
}
