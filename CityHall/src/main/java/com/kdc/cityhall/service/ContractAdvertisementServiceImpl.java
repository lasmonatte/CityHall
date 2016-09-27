package com.kdc.cityhall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dao.ContractAdvertisementDao;
import com.kdc.cityhall.dto.ContractAdvertisementDto;

@Component
public class ContractAdvertisementServiceImpl implements ContractAdvertisementService{

	@Autowired ContractAdvertisementDao dao;
	
	@Override
	public int createContractAdvertisementService(ContractAdvertisementDto dto) {
		// TODO Auto-generated method stub
		return dao.createContractAdvertisement(dto);
	}

	@Override
	public List<ContractAdvertisementDto> readContractAdvertisementAllService() {
		// TODO Auto-generated method stub
		return dao.readContractAdvertisementAll();
	}

	@Override
	public ContractAdvertisementDto readContractAdvertisementOneService(int num) {
		// TODO Auto-generated method stub
		return dao.readContractAdvertisementOne(num);
	}

	@Override
	public List<ContractAdvertisementDto> readContractAdvertisementByAdvertiserNumService(int advertiser_num) {
		// TODO Auto-generated method stub
		return dao.readContractAdvertisementByAdvertiserNum(advertiser_num);
	}

	@Override
	public List<ContractAdvertisementDto> readContractAdvertisementBySellerIdService(String seller_id) {
		// TODO Auto-generated method stub
		return dao.readContractAdvertisementBySellerId(seller_id);
	}

	@Override
	public int updateContractAdvertisementService(ContractAdvertisementDto dto) {
		// TODO Auto-generated method stub
		return dao.updateContractAdvertisement(dto);
	}

	@Override
	public int deleteContractAdvertisementService(int num) {
		// TODO Auto-generated method stub
		return dao.deleteContractAdvertisement(num);
	}

	@Override
	public int deleteContractAdvertisementByAdvertiserNumService(int advertiser_num) {
		// TODO Auto-generated method stub
		return dao.deleteContractAdvertisementByAdvertiserNum(advertiser_num);
	}

	@Override
	public int deleteContractAdvertisementBySellerIdService(String seller_id) {
		// TODO Auto-generated method stub
		return dao.deleteContractAdvertisementBySellerId(seller_id);
	}

}
