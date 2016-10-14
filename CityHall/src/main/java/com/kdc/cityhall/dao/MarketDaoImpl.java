package com.kdc.cityhall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.MarketDto;

@Component
public class MarketDaoImpl implements MarketDao{

	@Autowired SqlSession session;

	@Override
	public int createMarket(MarketDto dto) {
		// TODO Auto-generated method stub
		return session.insert("kdc.market.createMarket", dto);
	}

	@Override
	public List<MarketDto> readMarketAll() {
		// TODO Auto-generated method stub
		return session.selectList("kdc.market.readMarketAll");
	}

	@Override
	public MarketDto readMarketOne(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.market.readMarketOne", num);
	}

	@Override
	public MarketDto readMarketByRegisterNum(int register_num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.market.readMarketByRegisterNum", register_num);
	}

	@Override
	public List<MarketDto> readMarketByName(String name) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.market.readMarketByName", name);
	}

	@Override
	public int updateMarket(MarketDto dto) {
		// TODO Auto-generated method stub
		return session.update("kdc.market.updateMarket", dto);
	}

	@Override
	public int deleteMarket(int num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.market.deleteMarket", num);
	}

	@Override
	public int deleteMarketByName(String name) {
		// TODO Auto-generated method stub
		return session.delete("kdc.market.deleteMarketByName", name);
	}

	@Override
	public int deleteMarketByRegisterNum(int register_num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.market.deleteMarketByRegisterNum", register_num);
	}
	
}
