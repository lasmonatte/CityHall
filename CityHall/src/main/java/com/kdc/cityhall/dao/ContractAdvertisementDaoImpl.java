package com.kdc.cityhall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.ContractAdvertisementDto;

@Component
public class ContractAdvertisementDaoImpl implements ContractAdvertisementDao{

	@Autowired SqlSession session;
	
	@Override
	public int createContractAdvertisement(ContractAdvertisementDto dto) {
		// TODO Auto-generated method stub
		return session.insert("kdc.contractAdvertisement.createContractAdvertisement", dto);
	}

	@Override
	public List<ContractAdvertisementDto> readContractAdvertisementAll() {
		// TODO Auto-generated method stub
		return session.selectList("kdc.contractAdvertisement.readContractAdvertisementAll");
	}

	@Override
	public ContractAdvertisementDto readContractAdvertisementOne(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.contractAdvertisement.readContractAdvertisementOne", num);
	}

	@Override
	public List<ContractAdvertisementDto> readContractAdvertisementByAdvertiserNum(int advertiser_num) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.contractAdvertisement.readContractAdvertisementByAdvertiserNum", advertiser_num);
	}

	@Override
	public List<ContractAdvertisementDto> readContractAdvertisementBySellerId(String seller_id) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.contractAdvertisement.readContractAdvertisementBySellerId", seller_id);
	}

	@Override
	public int updateContractAdvertisement(ContractAdvertisementDto dto) {
		// TODO Auto-generated method stub
		return session.update("kdc.contractAdvertisement.updateContractAdvertisement", dto);
	}

	@Override
	public int deleteContractAdvertisement(int num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.contractAdvertisement.deleteContractAdvertisement", num);
	}

	@Override
	public int deleteContractAdvertisementByAdvertiserNum(int advertiser_num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.contractAdvertisement.deleteContractAdvertisementByAdvertiserNum", advertiser_num);
	}

	@Override
	public int deleteContractAdvertisementBySellerId(String seller_id) {
		// TODO Auto-generated method stub
		return session.delete("kdc.contractAdvertisement.deleteContractAdvertisementBySellerId", seller_id);
	}

}
