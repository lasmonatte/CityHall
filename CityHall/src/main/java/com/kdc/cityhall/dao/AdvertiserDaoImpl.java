package com.kdc.cityhall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.AdvertiserDto;

@Component
public class AdvertiserDaoImpl implements AdvertiserDao{

	@Autowired SqlSession session;
	
	@Override
	public int createAdvertiser(AdvertiserDto dto) {
		// TODO Auto-generated method stub
		return session.insert("kdc.advertiser.createAdvertiser", dto);
	}

	@Override
	public List<AdvertiserDto> readAdvertiserAll() {
		// TODO Auto-generated method stub
		return session.selectList("kdc.advertiser.readAdvertiserAll");
	}

	@Override
	public AdvertiserDto readAdvertiserOne(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.advertiser.readAdvertiserOne", num);
	}

	@Override
	public List<AdvertiserDto> readAdvertiserByBName(String search) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.advertiser.readAdvertiserByBName", search);
	}

	@Override
	public AdvertiserDto readAdvertiserByRegisterNum(int register_num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.advertiser.readAdvertiserByRegisterNum", register_num);
	}

	@Override
	public int updateAdvertiser(AdvertiserDto dto) {
		// TODO Auto-generated method stub
		return session.update("kdc.advertiser.updateAdvertiser", dto);
	}

	@Override
	public int deleteAdvertiser(int num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.advertiser.deleteAdvertiser", num);
	}

	@Override
	public int deleteAdvertiserByRegisterNum(int register_num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.advertiser.deleteAdvertiserByRegisterNum", register_num);
	}

	@Override
	public int deleteAdvertiserByBName(String b_name) {
		// TODO Auto-generated method stub
		return session.delete("kdc.advertiser.deleteAdvertiserByBName", b_name);
	}

}
