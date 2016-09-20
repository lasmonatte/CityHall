package com.kdc.cityhall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dao.AdvertisementDao;
import com.kdc.cityhall.dto.AdvertisementDto;

@Component
public class AdvertisementServiceImpl implements AdvertisementService{

	@Autowired AdvertisementDao dao;

	@Override
	public int createAdvertisement(AdvertisementDto dto) {
		// TODO Auto-generated method stub
		return dao.createAdvertisement(dto);
	}

	@Override
	public List<AdvertisementDto> readAdvertisementAllService() {
		// TODO Auto-generated method stub
		return dao.readAdvertisementAll();
	}

	@Override
	public AdvertisementDto readAdvertisementOne(int num) {
		// TODO Auto-generated method stub
		return dao.readAdvertisementOne(num);
	}

	@Override
	public List<AdvertisementDto> readAdvertisementByContractNum(int c_num) {
		// TODO Auto-generated method stub
		return dao.readAdvertisementByContractNum(c_num);
	}

	@Override
	public int updateAdvertisement(AdvertisementDto dto) {
		// TODO Auto-generated method stub
		return dao.updateAdvertisement(dto);
	}

	@Override
	public int deleteAdvertisement(int num) {
		// TODO Auto-generated method stub
		return dao.deleteAdvertisement(num);
	}

	@Override
	public int deleteAdvertisementByContractNum(int c_num) {
		// TODO Auto-generated method stub
		return dao.deleteAdvertisementByContractNum(c_num);
	}
	
}
