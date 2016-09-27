package com.kdc.cityhall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.ContractMarketDto;

@Component
public class ContractMarketDaoImpl implements ContractMarketDao{

	@Autowired SqlSession session;
	
	@Override
	public int createContractMarket(ContractMarketDto dto) {
		// TODO Auto-generated method stub
		return session.insert("kdc.contractMarket.createContractMarket", dto);
	}

	@Override
	public List<ContractMarketDto> readContractMarketAll() {
		// TODO Auto-generated method stub
		return session.selectList("kdc.contractMarket.readContractMarketAll");
	}

	@Override
	public ContractMarketDto readContractMarketOne(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.contractMarket.readContractMarketOne", num);
	}

	@Override
	public List<ContractMarketDto> readContractMarketByMarketNum(int market_num) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.contractMarket.readContractMarketByMarketNum", market_num);
	}

	@Override
	public int updateContractMarket(ContractMarketDto dto) {
		// TODO Auto-generated method stub
		return session.update("kdc.contractMarket.updateContractMarket", dto);
	}

	@Override
	public int deleteContractMarket(int num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.contractMarket.deleteContractMarket", num);
	}

	@Override
	public int deleteContractMarketByMarketNum(int market_num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.contractMarket.deleteContractMarketByMarketNum", market_num);
	}

}
