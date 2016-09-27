package com.kdc.cityhall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dao.PaymentLogDao;
import com.kdc.cityhall.dto.PaymentLogDto;

@Component
public class PaymentLogServiceImpl implements PaymentLogService{

	@Autowired PaymentLogDao dao;

	@Override
	public int createPaymentLogService(PaymentLogDto dto) {
		// TODO Auto-generated method stub
		return dao.createPaymentLog(dto);
	}

	@Override
	public List<PaymentLogDto> readPaymentLogAllService() {
		// TODO Auto-generated method stub
		return dao.readPaymentLogAll();
	}

	@Override
	public PaymentLogDto readPaymentLogOneService(int num) {
		// TODO Auto-generated method stub
		return dao.readPaymentLogOne(num);
	}

	@Override
	public PaymentLogDto readPaymentLogByPaymentNumService(int payment_num) {
		// TODO Auto-generated method stub
		return dao.readPaymentLogByPaymentNum(payment_num);
	}

	@Override
	public List<PaymentLogDto> readPaymentLogByIsPaidService(boolean isPaid) {
		// TODO Auto-generated method stub
		return dao.readPaymentLogByIsPaid(isPaid);
	}

	@Override
	public int updatePaymentLogService(PaymentLogDto dto) {
		// TODO Auto-generated method stub
		return dao.updatePaymentLog(dto);
	}

	@Override
	public int deletePaymentLogService(int num) {
		// TODO Auto-generated method stub
		return dao.deletePaymentLog(num);
	}

	@Override
	public int deletePaymentLogByPaymentNumService(int payment_num) {
		// TODO Auto-generated method stub
		return dao.deletePaymentLogByPaymentNum(payment_num);
	}
}