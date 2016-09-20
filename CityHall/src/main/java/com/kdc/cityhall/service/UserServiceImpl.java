package com.kdc.cityhall.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dao.UserDao;
import com.kdc.cityhall.dto.UserDto;
import com.kdc.cityhall.security.ShaEncoder;

@Component
public class UserServiceImpl implements UserService{

	@Autowired UserDao dao;
	@Resource(name="shaEncoder") private ShaEncoder encoder;

	@Override
	public int createUserService(UserDto dto) {
		// TODO Auto-generated method stub
		dto.setPassword(encoder.saltEncoding(dto.getPassword(), dto.getId()));
		dao.createUser(dto);
		return dao.grantAuthorities(dto);
	}
	@Override
	public UserDto readUserService(String id) {
		// TODO Auto-generated method stub
		return dao.readUser(id);
	}
	@Override
	public int updateUserInfoService(UserDto dto) {
		// TODO Auto-generated method stub
		
		return dao.updateUser(dto);
	}
	@Override
	public int deleteUserService(String id) {
		// TODO Auto-generated method stub
		return dao.deleteUser(id);
	}
	@Override
	public List<UserDto> searchUserByIdService(String id) {
		// TODO Auto-generated method stub
		return dao.searchUsersById(id);
	}


}
