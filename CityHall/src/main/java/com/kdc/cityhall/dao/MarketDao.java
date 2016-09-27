package com.kdc.cityhall.dao;

import java.util.List;

import com.kdc.cityhall.dto.MarketDto;

public interface MarketDao {

	public int createMarket(MarketDto dto);
	public List<MarketDto> readMarketAll();
	public MarketDto readMarketOne(int num);
	public MarketDto readMarketByRegisterNum(int register_num);
	public List<MarketDto> readMarketByName(String name);
	public int updateMarket(MarketDto dto);
	public int deleteMarket(int num);
	public int deleteMarketByName(String name);
	public int deleteMarketByRegisterNum(int register_num);
	
}
