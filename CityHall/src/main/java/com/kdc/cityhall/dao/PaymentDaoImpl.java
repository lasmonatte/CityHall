package com.kdc.cityhall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.PaymentDto;

@Component
public class PaymentDaoImpl implements PaymentDao{

	@Autowired SqlSession session;

	@Override
	public int createPayment(PaymentDto dto) {
		// TODO Auto-generated method stub
		return session.insert("com.payment.createPayment", dto);
	}

	@Override
	public List<PaymentDto> readPaymentAll() {
		// TODO Auto-generated method stub
		return session.selectList("com.payment.readPayment");
	}

	@Override
	public PaymentDto readPaymentOne(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("com.payment.readPaymentOne", num);
	}

	@Override
	public PaymentDto readPaymentByMarketNum(int market_num) {
		// TODO Auto-generated method stub
		return session.selectOne("com.payment.readPaymentByMarketNum", market_num);
	}

	@Override
	public List<PaymentDto> readPaymentByCategory(String category) {
		// TODO Auto-generated method stub
		return session.selectList("com.payment.readPaymentByCategory", category);
	}

	@Override
	public List<PaymentDto> readPaymentByCompanyName(String name) {
		// TODO Auto-generated method stub
		return session.selectList("com.payment.readPaymentByCompanyName", name);
	}

	@Override
	public int updatePayment(PaymentDto dto) {
		// TODO Auto-generated method stub
		return session.update("com.payment.updatePayment", dto);
	}

	@Override
	public int deletePayment(int num) {
		// TODO Auto-generated method stub
		return session.delete("com.payment.deletePayment", num);
	}

	@Override
	public int deletePaymentByMarketNum(int market_num) {
		// TODO Auto-generated method stub
		return session.delete("com.payment.deletePaymentByMarketNum", market_num);
	}

	@Override
	public int deletePaymentByCompanyName(String company_name) {
		// TODO Auto-generated method stub
		return session.delete("com.payment.deletePaymentByCompanyName", company_name);
	}
}
