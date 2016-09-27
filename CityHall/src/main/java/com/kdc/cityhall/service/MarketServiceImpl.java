package com.kdc.cityhall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dao.MarketDao;
import com.kdc.cityhall.dto.MarketDto;

@Component
public class MarketServiceImpl implements MarketService{

	@Autowired MarketDao dao;

	@Override
	public int createMarketService(MarketDto dto) {
		// TODO Auto-generated method stub
		return dao.createMarket(dto);
	}

	@Override
	public List<MarketDto> readMarketAllService() {
		// TODO Auto-generated method stub
		return dao.readMarketAll();
	}

	@Override
	public MarketDto readMarketOneService(int num) {
		// TODO Auto-generated method stub
		return dao.readMarketOne(num);
	}

	@Override
	public MarketDto readMarketByRegisterNumService(int register_num) {
		// TODO Auto-generated method stub
		return dao.readMarketByRegisterNum(register_num);
	}

	@Override
	public List<MarketDto> readMarketByNameService(String name) {
		// TODO Auto-generated method stub
		return dao.readMarketByName(name);
	}

	@Override
	public int updateMarketService(MarketDto dto) {
		// TODO Auto-generated method stub
		return dao.updateMarket(dto);
	}

	@Override
	public int deleteMarketService(int num) {
		// TODO Auto-generated method stub
		return dao.deleteMarket(num);
	}

	@Override
	public int deleteMarketByNameService(String name) {
		// TODO Auto-generated method stub
		return dao.deleteMarketByName(name);
	}

	@Override
	public int deleteMarketByRegisterNumService(int register_num) {
		// TODO Auto-generated method stub
		return dao.deleteMarketByRegisterNum(register_num);
	}
}
