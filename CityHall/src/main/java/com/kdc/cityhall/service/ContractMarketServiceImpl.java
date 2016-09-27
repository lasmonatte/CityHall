package com.kdc.cityhall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dao.ContractMarketDao;
import com.kdc.cityhall.dto.ContractMarketDto;

@Component
public class ContractMarketServiceImpl implements ContractMarketService{

	@Autowired ContractMarketDao dao;
	
	@Override
	public int createContractMarketService(ContractMarketDto dto) {
		// TODO Auto-generated method stub
		return dao.createContractMarket(dto);
	}

	@Override
	public List<ContractMarketDto> readContractMarketAllService() {
		// TODO Auto-generated method stub
		return dao.readContractMarketAll();
	}

	@Override
	public ContractMarketDto readContractMarketOneService(int num) {
		// TODO Auto-generated method stub
		return dao.readContractMarketOne(num);
	}

	@Override
	public List<ContractMarketDto> readContractMarketByMarketNumService(int market_num) {
		// TODO Auto-generated method stub
		return dao.readContractMarketByMarketNum(market_num);
	}

	@Override
	public int updateContractMarketService(ContractMarketDto dto) {
		// TODO Auto-generated method stub
		return dao.updateContractMarket(dto);
	}

	@Override
	public int deleteContractMarketService(int num) {
		// TODO Auto-generated method stub
		return dao.deleteContractMarket(num);
	}

	@Override
	public int deleteContractMarketByMarketNumService(int market_num) {
		// TODO Auto-generated method stub
		return dao.deleteContractMarketByMarketNum(market_num);
	}

}
