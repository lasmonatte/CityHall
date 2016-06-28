package com.kdc.cityhall.user.model;

import java.util.List;

import com.kdc.cityhall.common.service.UserDetailsVO;

public interface UserDao {
	//Basic
	public int createUser(UserDto dto);
	public UserDto readUser(String id);
	public int updateUserInfo(UserDto dto);
	public int deleteUser(String id);

	//Complex
	public UserDetailsVO loginUser(String username);
	public List<UserDto> searchUserById(String search);
	
}
