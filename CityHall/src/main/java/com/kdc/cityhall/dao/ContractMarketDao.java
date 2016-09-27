package com.kdc.cityhall.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.ContractMarketDto;

@Component
public interface ContractMarketDao {

	public int createContractMarket(ContractMarketDto dto);
	public List<ContractMarketDto> readContractMarketAll();
	public ContractMarketDto readContractMarketOne(int num);
	public List<ContractMarketDto> readContractMarketByMarketNum(int market_num);
	public int updateContractMarket(ContractMarketDto dto);
	public int deleteContractMarket(int num);
	public int deleteContractMarketByMarketNum(int market_num);
}
