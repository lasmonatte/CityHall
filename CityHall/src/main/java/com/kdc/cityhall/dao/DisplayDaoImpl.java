package com.kdc.cityhall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.DisplayDto;

@Component
public class DisplayDaoImpl implements DisplayDao{

	@Autowired SqlSession session;

	@Override
	public int createDisplay(DisplayDto dto) {
		// TODO Auto-generated method stub
		return session.insert("kdc.display.createDisplay", dto);
	}

	@Override
	public List<DisplayDto> readDisplayAll() {
		// TODO Auto-generated method stub
		return session.selectList("kdc.display.readDisplayAll");
	}

	@Override
	public DisplayDto readDisplayOne(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.display.readDisplayOne", num);
	}

	@Override
	public List<DisplayDto> readDisplayByMarketNum(int market_num) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.display.readDisplayByMarketNum", market_num);
	}

	@Override
	public List<DisplayDto> readDisplayByName(String search) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.display.readDisplayByName", search);
	}

	@Override
	public List<DisplayDto> readDisplayBySize(int size) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.display.readDisplayBySize", size);
	}

	@Override
	public int updateDisplay(DisplayDto dto) {
		// TODO Auto-generated method stub
		return session.update("kdc.display.updateDisplay", dto);
	}

	@Override
	public int deleteDisplay(int num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.display.deleteDisplay", num);
	}

	@Override
	public int deleteDisplayByMarketNum(int market_num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.display.deleteDisplayByMarketNum", market_num);
	}

	@Override
	public int deleteDisplayByName(String name) {
		// TODO Auto-generated method stub
		return session.delete("kdc.display.deleteDisplayByName", name);
	}
}
