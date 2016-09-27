package com.kdc.cityhall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dao.DisplayDao;
import com.kdc.cityhall.dto.DisplayDto;

@Component
public class DisplayServiceImpl implements DisplayService {

	@Autowired DisplayDao dao;

	@Override
	public int createDisplayService(DisplayDto dto) {
		// TODO Auto-generated method stub
		return dao.createDisplay(dto);
	}

	@Override
	public List<DisplayDto> readDisplayAllService() {
		// TODO Auto-generated method stub
		return dao.readDisplayAll();
	}

	@Override
	public DisplayDto readDisplayOneService(int num) {
		// TODO Auto-generated method stub
		return dao.readDisplayOne(num);
	}

	@Override
	public List<DisplayDto> readDisplayByMarketNumService(int market_num) {
		// TODO Auto-generated method stub
		return dao.readDisplayByMarketNum(market_num);
	}

	@Override
	public List<DisplayDto> readDisplayByNameService(String search) {
		// TODO Auto-generated method stub
		return dao.readDisplayByName(search);
	}

	@Override
	public List<DisplayDto> readDisplayBySizeService(int size) {
		// TODO Auto-generated method stub
		return dao.readDisplayBySize(size);
	}

	@Override
	public int updateDisplayService(DisplayDto dto) {
		// TODO Auto-generated method stub
		return dao.updateDisplay(dto);
	}

	@Override
	public int deleteDisplayService(int num) {
		// TODO Auto-generated method stub
		return dao.deleteDisplay(num);
	}

	@Override
	public int deleteDisplayByMarketNumService(int market_num) {
		// TODO Auto-generated method stub
		return dao.deleteDisplayByMarketNum(market_num);
	}

	@Override
	public int deleteDisplayByNameService(String name) {
		// TODO Auto-generated method stub
		return dao.deleteDisplayByName(name);
	}
	
	
}
