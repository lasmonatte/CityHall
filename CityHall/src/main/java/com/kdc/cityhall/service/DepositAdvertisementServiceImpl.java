package com.kdc.cityhall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dao.DepositAdvertisementDao;
import com.kdc.cityhall.dto.DepositAdvertisementDto;

@Component
public class DepositAdvertisementServiceImpl implements DepositAdvertisementService {
	
	@Autowired DepositAdvertisementDao dao;

	@Override
	public int createDepositAdvertisementService(DepositAdvertisementDto dto) {
		// TODO Auto-generated method stub
		return dao.createDepositAdvertisement(dto);
	}

	@Override
	public List<DepositAdvertisementDto> readDepositAdvertisementAllService() {
		// TODO Auto-generated method stub
		return dao.readDepositAdvertisementAll();
	}

	@Override
	public DepositAdvertisementDto readDepositAdvertisementOneService(int num) {
		// TODO Auto-generated method stub
		return dao.readDepositAdvertisementOne(num);
	}

	@Override
	public List<DepositAdvertisementDto> readDepositAdvertisementByAdvertiserNumService(int advertiser_num) {
		// TODO Auto-generated method stub
		return dao.readDepositAdvertisementByAdvertiserNum(advertiser_num);
	}

	@Override
	public List<DepositAdvertisementDto> readDepositAdvertisementByContractNumService(int c_num) {
		// TODO Auto-generated method stub
		return dao.readDepositAdvertisementByContractNum(c_num);
	}

	@Override
	public int updateDepositAdvertisementService(DepositAdvertisementDto dto) {
		// TODO Auto-generated method stub
		return dao.updateDepositAdvertisement(dto);
	}

	@Override
	public int deleteDepositAdvertisementService(int num) {
		// TODO Auto-generated method stub
		return dao.deleteDepositAdvertisement(num);
	}

	@Override
	public int deleteDepositAdvertisementByAdvertiserNumService(int advertiser_num) {
		// TODO Auto-generated method stub
		return dao.deleteDepositAdvertisementByAdvertiserNum(advertiser_num);
	}

	@Override
	public int deleteDepositAdvertisementByContractNumService(int c_num) {
		// TODO Auto-generated method stub
		return dao.deleteDepositAdvertisementByContractNum(c_num);
	}
	
	
}
