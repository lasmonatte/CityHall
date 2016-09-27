package com.kdc.cityhall.dao;

import java.util.List;

import com.kdc.cityhall.dto.ContractAdvertisementDto;

public interface ContractAdvertisementDao {
	
	public int createContractAdvertisement(ContractAdvertisementDto dto);
	public List<ContractAdvertisementDto> readContractAdvertisementAll();
	public ContractAdvertisementDto readContractAdvertisementOne(int num);
	public List<ContractAdvertisementDto> readContractAdvertisementByAdvertiserNum(int advertiser_num);
	public List<ContractAdvertisementDto> readContractAdvertisementBySellerId(String seller_id);
	public int updateContractAdvertisement(ContractAdvertisementDto dto);
	public int deleteContractAdvertisement(int num);
	public int deleteContractAdvertisementByAdvertiserNum(int advertiser_num);
	public int deleteContractAdvertisementBySellerId(String seller_id);

}
