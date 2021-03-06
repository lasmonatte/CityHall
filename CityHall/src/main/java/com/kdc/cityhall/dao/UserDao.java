package com.kdc.cityhall.dao;

import java.util.List;

import com.kdc.cityhall.dto.UserDto;
import com.kdc.cityhall.security.UserDetailsVO;

public interface UserDao {
	//CRUD USER
	public int createUser(UserDto dto);
	public UserDto readUser(String id);
	public int updateUser(UserDto dto);
	public int deleteUser(String id);

	//Grant Authorities
	public int grantAuthorities(UserDto dto);
	public int updateAuthorities(UserDto dto);
	
	//Complex
	public UserDetailsVO loginUser(String username);
	public List<UserDto> searchUsersById(String id);
	
	//Update Latest_date
	public int updateLatestDate(String id);
	
}
