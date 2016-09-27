package com.kdc.cityhall.dao;

import java.util.List;

import com.kdc.cityhall.dto.PaymentLogDto;

public interface PaymentLogDao {

	public int createPaymentLog(PaymentLogDto dto);
	public List<PaymentLogDto> readPaymentLogAll();
	public PaymentLogDto readPaymentLogOne(int num);
	public PaymentLogDto readPaymentLogByPaymentNum(int payment_num);
	public List<PaymentLogDto> readPaymentLogByIsPaid(boolean isPaid);
	public int updatePaymentLog(PaymentLogDto dto);
	public int deletePaymentLog(int num);
	public int deletePaymentLogByPaymentNum(int payment_num);
}
