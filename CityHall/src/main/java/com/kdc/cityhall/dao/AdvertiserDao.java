package com.kdc.cityhall.dao;

import java.util.List;

import com.kdc.cityhall.dto.AdvertiserDto;

public interface AdvertiserDao {
	
	public int createAdvertiser(AdvertiserDto dto);
	public List<AdvertiserDto> readAdvertiserAll();
	public AdvertiserDto readAdvertiserOne(int num);
	public List<AdvertiserDto> readAdvertiserByBName(String search);
	public AdvertiserDto readAdvertiserByRegisterNum(int register_num);
	public int updateAdvertiser(AdvertiserDto dto);
	public int deleteAdvertiser(int num);
	public int deleteAdvertiserByRegisterNum(int register_num);
	public int deleteAdvertiserByBName(String b_name);
}
