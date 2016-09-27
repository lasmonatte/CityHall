package com.kdc.cityhall.service;

import java.util.List;

import com.kdc.cityhall.dto.PaymentLogDto;

public interface PaymentLogService {

	public int createPaymentLogService(PaymentLogDto dto);
	public List<PaymentLogDto> readPaymentLogAllService();
	public PaymentLogDto readPaymentLogOneService(int num);
	public PaymentLogDto readPaymentLogByPaymentNumService(int payment_num);
	public List<PaymentLogDto> readPaymentLogByIsPaidService(boolean isPaid);
	public int updatePaymentLogService(PaymentLogDto dto);
	public int deletePaymentLogService(int num);
	public int deletePaymentLogByPaymentNumService(int payment_num);
}
