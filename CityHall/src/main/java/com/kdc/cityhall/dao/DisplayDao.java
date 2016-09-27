package com.kdc.cityhall.dao;

import java.util.List;

import com.kdc.cityhall.dto.DisplayDto;

public interface DisplayDao {

	public int createDisplay(DisplayDto dto);
	public List<DisplayDto> readDisplayAll();
	public DisplayDto readDisplayOne(int num);
	public List<DisplayDto> readDisplayByMarketNum(int market_num);
	public List<DisplayDto> readDisplayByName(String search);
	public List<DisplayDto> readDisplayBySize(int size);
	public int updateDisplay(DisplayDto dto);
	public int deleteDisplay(int num);
	public int deleteDisplayByMarketNum(int market_num);
	public int deleteDisplayByName(String name);
}
