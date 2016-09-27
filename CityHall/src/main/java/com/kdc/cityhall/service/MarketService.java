package com.kdc.cityhall.service;

import java.util.List;

import com.kdc.cityhall.dto.MarketDto;

public interface MarketService {

	public int createMarketService(MarketDto dto);
	public List<MarketDto> readMarketAllService();
	public MarketDto readMarketOneService(int num);
	public MarketDto readMarketByRegisterNumService(int register_num);
	public List<MarketDto> readMarketByNameService(String name);
	public int updateMarketService(MarketDto dto);
	public int deleteMarketService(int num);
	public int deleteMarketByNameService(String name);
	public int deleteMarketByRegisterNumService(int register_num);
	
}
