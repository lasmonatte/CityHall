package com.kdc.cityhall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dao.AdvertiserDao;
import com.kdc.cityhall.dto.AdvertiserDto;

@Component
public class AdvertiserServiceImpl implements AdvertiserService{

	@Autowired AdvertiserDao dao;
	
	@Override
	public int createAdvertiserService(AdvertiserDto dto) {
		// TODO Auto-generated method stub
		return dao.createAdvertiser(dto);
	}

	@Override
	public List<AdvertiserDto> readAdvertiserAllService() {
		// TODO Auto-generated method stub
		return dao.readAdvertiserAll();
	}

	@Override
	public AdvertiserDto readAdvertiserOneService(int num) {
		// TODO Auto-generated method stub
		return dao.readAdvertiserOne(num);
	}

	@Override
	public List<AdvertiserDto> readAdvertiserByBNameService(String search) {
		// TODO Auto-generated method stub
		return dao.readAdvertiserByBName(search);
	}

	@Override
	public AdvertiserDto readAdvertiserByRegisterNumService(int register_num) {
		// TODO Auto-generated method stub
		return dao.readAdvertiserByRegisterNum(register_num);
	}

	@Override
	public int updateAdvertiserService(AdvertiserDto dto) {
		// TODO Auto-generated method stub
		return dao.updateAdvertiser(dto);
	}

	@Override
	public int deleteAdvertiserService(int num) {
		// TODO Auto-generated method stub
		return dao.deleteAdvertiser(num);
	}

	@Override
	public int deleteAdvertiserByRegisterNumService(int register_num) {
		// TODO Auto-generated method stub
		return dao.deleteAdvertiserByRegisterNum(register_num);
	}

	@Override
	public int deleteAdvertiserByBNameService(String b_name) {
		// TODO Auto-generated method stub
		return dao.deleteAdvertiserByBName(b_name);
	}

}
