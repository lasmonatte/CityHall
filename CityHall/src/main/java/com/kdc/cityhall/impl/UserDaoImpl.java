package com.kdc.cityhall.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.model.UserDao;
import com.kdc.cityhall.model.UserDto;
import com.kdc.cityhall.security.UserDetailsVO;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	SqlSession session;
	
	@Override
	public int createUser(UserDto dto) {
		// TODO Auto-generated method stub
		System.out.println(dto.getName());
		return session.insert("kdc.user.createUser", dto);
	}

	@Override
	public UserDto readUser(String id) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.user.readUser", id);
	}

	@Override
	public int updateUser(UserDto dto) {
		// TODO Auto-generated method stub
		return session.update("kdc.user.updateUser", dto);
	}

	@Override
	public int deleteUser(String id) {
		// TODO Auto-generated method stub
		return session.delete("kdc.user.deleteUser", id);
	}

	@Override
	public UserDetailsVO loginUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> searchUsersById(String id) {
		// TODO Auto-generated method stub
		return session.selectList(id);
	}

	@Override
	public int grantAuthorities(UserDto dto) {
		// TODO Auto-generated method stub
		return session.insert("kdc.user.grantAutorities", dto);
	}

	@Override
	public int updateAuthorities(UserDto dto) {
		// TODO Auto-generated method stub
		return session.update("kdc.user.updateAuthorities", dto);
	}

}
