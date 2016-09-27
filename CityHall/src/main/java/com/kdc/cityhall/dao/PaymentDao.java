package com.kdc.cityhall.dao;

import java.util.List;

import com.kdc.cityhall.dto.PaymentDto;

public interface PaymentDao {

	public int createPayment(PaymentDto dto);
	public List<PaymentDto> readPaymentAll();
	public PaymentDto readPaymentOne(int num);
	public PaymentDto readPaymentByMarketNum(int market_num);
	public List<PaymentDto> readPaymentByCategory(String category);
	public List<PaymentDto> readPaymentByCompanyName(String name);
	public int updatePayment(PaymentDto dto);
	public int deletePayment(int num);
	public int deletePaymentByMarketNum(int market_num);
	public int deletePaymentByCompanyName(String company_name);
}
