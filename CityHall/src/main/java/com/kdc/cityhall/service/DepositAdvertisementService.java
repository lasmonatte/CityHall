package com.kdc.cityhall.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.DepositAdvertisementDto;

@Component
public interface DepositAdvertisementService {

	public int createDepositAdvertisementService(DepositAdvertisementDto dto);
	public List<DepositAdvertisementDto> readDepositAdvertisementAllService();
	public DepositAdvertisementDto readDepositAdvertisementOneService(int num);
	public List<DepositAdvertisementDto> readDepositAdvertisementByAdvertiserNumService(int advertiser_num);
	public List<DepositAdvertisementDto> readDepositAdvertisementByContractNumService(int c_num);
	public int updateDepositAdvertisementService(DepositAdvertisementDto dto);
	public int deleteDepositAdvertisementService(int num);
	public int deleteDepositAdvertisementByAdvertiserNumService(int advertiser_num);
	public int deleteDepositAdvertisementByContractNumService(int c_num);
}
