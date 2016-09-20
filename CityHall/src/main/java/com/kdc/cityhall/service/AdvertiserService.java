package com.kdc.cityhall.service;

import java.util.List;

import com.kdc.cityhall.dto.AdvertiserDto;

public interface AdvertiserService {
	public int createAdvertiserService(AdvertiserDto dto);
	public List<AdvertiserDto> readAdvertiserAllService();
	public AdvertiserDto readAdvertiserOneService(int num);
	public List<AdvertiserDto> readAdvertiserByBNameService(String search);
	public AdvertiserDto readAdvertiserByRegisterNumService(int register_num);
	public int updateAdvertiserService(AdvertiserDto dto);
	public int deleteAdvertiserService(int num);
	public int deleteAdvertiserByRegisterNumService(int register_num);
	public int deleteAdvertiserByBNameService(String b_name);
}
