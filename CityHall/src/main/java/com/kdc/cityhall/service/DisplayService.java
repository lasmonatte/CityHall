package com.kdc.cityhall.service;

import java.util.List;

import com.kdc.cityhall.dto.DisplayDto;

public interface DisplayService {

	public int createDisplayService(DisplayDto dto);
	public List<DisplayDto> readDisplayAllService();
	public DisplayDto readDisplayOneService(int num);
	public List<DisplayDto> readDisplayByMarketNumService(int market_num);
	public List<DisplayDto> readDisplayByNameService(String search);
	public List<DisplayDto> readDisplayBySizeService(int size);
	public int updateDisplayService(DisplayDto dto);
	public int deleteDisplayService(int num);
	public int deleteDisplayByMarketNumService(int market_num);
	public int deleteDisplayByNameService(String name);
}
