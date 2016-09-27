package com.kdc.cityhall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dao.PaymentDao;
import com.kdc.cityhall.dto.PaymentDto;

@Component
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired	PaymentDao dao;

	@Override
	public int createPaymentService(PaymentDto dto) {
		// TODO Auto-generated method stub
		return dao.createPayment(dto);
	}

	@Override
	public List<PaymentDto> readPaymentAllService() {
		// TODO Auto-generated method stub
		return dao.readPaymentAll();
	}

	@Override
	public PaymentDto readPaymentOneService(int num) {
		// TODO Auto-generated method stub
		return dao.readPaymentOne(num);
	}

	@Override
	public PaymentDto readPaymentByMarketNumService(int market_num) {
		// TODO Auto-generated method stub
		return dao.readPaymentByMarketNum(market_num);
	}

	@Override
	public List<PaymentDto> readPaymentByCategoryService(String category) {
		// TODO Auto-generated method stub
		return dao.readPaymentByCategory(category);
	}

	@Override
	public List<PaymentDto> readPaymentByCompanyNameService(String name) {
		// TODO Auto-generated method stub
		return dao.readPaymentByCompanyName(name);
	}

	@Override
	public int updatePaymentService(PaymentDto dto) {
		// TODO Auto-generated method stub
		return dao.updatePayment(dto);
	}

	@Override
	public int deletePaymentService(int num) {
		// TODO Auto-generated method stub
		return dao.deletePayment(num);
	}

	@Override
	public int deletePaymentByMarketNumService(int market_num) {
		// TODO Auto-generated method stub
		return dao.deletePaymentByMarketNum(market_num);
	}

	@Override
	public int deletePaymentByCompanyNameService(String company_name) {
		// TODO Auto-generated method stub
		return dao.deletePaymentByCompanyName(company_name);
	}
	
}