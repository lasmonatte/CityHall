package com.kdc.cityhall.service;

import java.util.List;

import com.kdc.cityhall.dto.PaymentDto;

public interface PaymentService {

	public int createPaymentService(PaymentDto dto);
	public List<PaymentDto> readPaymentAllService();
	public PaymentDto readPaymentOneService(int num);
	public PaymentDto readPaymentByMarketNumService(int market_num);
	public List<PaymentDto> readPaymentByCategoryService(String category);
	public List<PaymentDto> readPaymentByCompanyNameService(String name);
	public int updatePaymentService(PaymentDto dto);
	public int deletePaymentService(int num);
	public int deletePaymentByMarketNumService(int market_num);
	public int deletePaymentByCompanyNameService(String company_name);
}
