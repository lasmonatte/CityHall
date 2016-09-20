package com.kdc.cityhall.dao;

import java.util.List;

import com.kdc.cityhall.dto.AdvertisementDto;

public interface AdvertisementDao {

	public int createAdvertisement(AdvertisementDto dto);
	public List<AdvertisementDto> readAdvertisementAll();
	public AdvertisementDto readAdvertisementOne(int num);
	public List<AdvertisementDto> readAdvertisementByContractNum(int c_num);
	public int updateAdvertisement(AdvertisementDto dto);
	public int deleteAdvertisement(int num);
	public int deleteAdvertisementByContractNum(int c_num);
	
}
