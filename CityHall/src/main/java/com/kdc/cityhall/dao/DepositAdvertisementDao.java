package com.kdc.cityhall.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.DepositAdvertisementDto;

@Component
public interface DepositAdvertisementDao {

	public int createDepositAdvertisement(DepositAdvertisementDto dto);
	public List<DepositAdvertisementDto> readDepositAdvertisementAll();
	public DepositAdvertisementDto readDepositAdvertisementOne(int num);
	public List<DepositAdvertisementDto> readDepositAdvertisementByAdvertiserNum(int advertiser_num);
	public List<DepositAdvertisementDto> readDepositAdvertisementByContractNum(int c_num);
	public int updateDepositAdvertisement(DepositAdvertisementDto dto);
	public int deleteDepositAdvertisement(int num);
	public int deleteDepositAdvertisementByAdvertiserNum(int advertiser_num);
	public int deleteDepositAdvertisementByContractNum(int c_num);
}
