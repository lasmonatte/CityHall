package com.kdc.cityhall.service;

import java.util.List;

import com.kdc.cityhall.dto.ContractAdvertisementDto;

public interface ContractAdvertisementService {

	public int createContractAdvertisementService(ContractAdvertisementDto dto);
	public List<ContractAdvertisementDto> readContractAdvertisementAllService();
	public ContractAdvertisementDto readContractAdvertisementOneService(int num);
	public List<ContractAdvertisementDto> readContractAdvertisementByAdvertiserNumService(int advertiser_num);
	public List<ContractAdvertisementDto> readContractAdvertisementBySellerIdService(String seller_id);
	public int updateContractAdvertisementService(ContractAdvertisementDto dto);
	public int deleteContractAdvertisementService(int num);
	public int deleteContractAdvertisementByAdvertiserNumService(int advertiser_num);
	public int deleteContractAdvertisementBySellerIdService(String seller_id);
}
