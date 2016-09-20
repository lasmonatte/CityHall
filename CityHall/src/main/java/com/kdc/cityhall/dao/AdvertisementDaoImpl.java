package com.kdc.cityhall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.AdvertisementDto;

@Component
public class AdvertisementDaoImpl implements AdvertisementDao{

	@Autowired SqlSession session;

	@Override
	public int createAdvertisement(AdvertisementDto dto) {
		// TODO Auto-generated method stub
		return session.insert("kdc.advertisement.createAdvertisement", dto);
	}

	@Override
	public List<AdvertisementDto> readAdvertisementAll() {
		// TODO Auto-generated method stub
		return session.selectList("kdc.advertisement.readAdvertisementAll");
	}

	@Override
	public AdvertisementDto readAdvertisementOne(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.advertisement.readAdvertisementOne", num);
	}

	@Override
	public List<AdvertisementDto> readAdvertisementByContractNum(int c_num) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.advertisement.readAdvertisementByContractNum", c_num);
	}

	@Override
	public int updateAdvertisement(AdvertisementDto dto) {
		// TODO Auto-generated method stub
		return session.update("kdc.advertisement.updateAdvertisement", dto);
	}

	@Override
	public int deleteAdvertisement(int num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.advertisement.deleteAdvertisement", num);
	}

	@Override
	public int deleteAdvertisementByContractNum(int c_num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.advertisement.deleteAdvertisementAll", c_num);
	}
	
	
}
