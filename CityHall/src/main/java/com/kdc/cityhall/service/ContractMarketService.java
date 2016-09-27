package com.kdc.cityhall.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.ContractMarketDto;

@Component
public interface ContractMarketService {

	public int createContractMarketService(ContractMarketDto dto);
	public List<ContractMarketDto> readContractMarketAllService();
	public ContractMarketDto readContractMarketOneService(int num);
	public List<ContractMarketDto> readContractMarketByMarketNumService(int market_num);
	public int updateContractMarketService(ContractMarketDto dto);
	public int deleteContractMarketService(int num);
	public int deleteContractMarketByMarketNumService(int market_num);
}
