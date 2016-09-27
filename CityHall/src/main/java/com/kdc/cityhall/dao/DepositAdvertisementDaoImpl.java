package com.kdc.cityhall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.DepositAdvertisementDto;

@Component
public class DepositAdvertisementDaoImpl implements DepositAdvertisementDao{

	@Autowired	SqlSession session;
	
	@Override
	public int createDepositAdvertisement(DepositAdvertisementDto dto) {
		// TODO Auto-generated method stub
		return session.insert("kdc.depositAdvertisement.createDepositAdvertisement", dto);
	}

	@Override
	public List<DepositAdvertisementDto> readDepositAdvertisementAll() {
		// TODO Auto-generated method stub
		return session.selectList("kdc.depositAdvertisement.readDepositAdvertisementAll");
	}

	@Override
	public DepositAdvertisementDto readDepositAdvertisementOne(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.depositAdvertisement.readDepositAdvertisementOne", num);
	}

	@Override
	public List<DepositAdvertisementDto> readDepositAdvertisementByAdvertiserNum(int advertiser_num) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.depositAdvertisement.readDepositAdvertisementByAdvertiserNum", advertiser_num);
	}

	@Override
	public List<DepositAdvertisementDto> readDepositAdvertisementByContractNum(int c_num) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.depositAdvertisement.readDepositAdvertisementByContractNum", c_num);
	}

	@Override
	public int updateDepositAdvertisement(DepositAdvertisementDto dto) {
		// TODO Auto-generated method stub
		return session.update("kdc.depositAdvertisement.updateDepositAdvertisement", dto);
	}

	@Override
	public int deleteDepositAdvertisement(int num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.depositAdvertisement.deleteDepositAdvertisement", num);
	}

	@Override
	public int deleteDepositAdvertisementByAdvertiserNum(int advertiser_num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.depositAdvertisement.deleteDepositAdvertisementByAdvertiserNum", advertiser_num);
	}

	@Override
	public int deleteDepositAdvertisementByContractNum(int c_num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.depositAdvertisement.deleteDepositAdvertisementByContractNum", c_num);
	}

}
