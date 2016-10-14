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
		return session.insert("kdc.payment.createPayment", dto);
	}

	@Override
	public List<PaymentDto> readPaymentAll() {
		// TODO Auto-generated method stub
		return session.selectList("kdc.payment.readPayment");
	}

	@Override
	public PaymentDto readPaymentOne(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.payment.readPaymentOne", num);
	}

	@Override
	public List<PaymentDto> readPaymentByMarketNum(int market_num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.payment.readPaymentByMarketNum", market_num);
	}

	@Override
	public List<PaymentDto> readPaymentByCategory(String category) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.payment.readPaymentByCategory", category);
	}

	@Override
	public List<PaymentDto> readPaymentByCompanyName(String name) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.payment.readPaymentByCompanyName", name);
	}

	@Override
	public int updatePayment(PaymentDto dto) {
		// TODO Auto-generated method stub
		return session.update("kdc.payment.updatePayment", dto);
	}

	@Override
	public int deletePayment(int num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.payment.deletePayment", num);
	}

	@Override
	public int deletePaymentByMarketNum(int market_num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.payment.deletePaymentByMarketNum", market_num);
	}

	@Override
	public int deletePaymentByCompanyName(String company_name) {
		// TODO Auto-generated method stub
		return session.delete("kdc.payment.deletePaymentByCompanyName", company_name);
	}
}
