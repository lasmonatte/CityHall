package com.kdc.cityhall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.PaymentLogDto;

@Component
public class PaymentLogDaoImpl implements PaymentLogDao{

	@Autowired SqlSession session;

	@Override
	public int createPaymentLog(PaymentLogDto dto) {
		// TODO Auto-generated method stub
		return session.insert("kdc.paymentLog.createPaymentLog", dto);
	}

	@Override
	public List<PaymentLogDto> readPaymentLogAll() {
		// TODO Auto-generated method stub
		return session.selectList("kdc.paymentLog.readPaymentLog");
	}

	@Override
	public PaymentLogDto readPaymentLogOne(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.paymentLog.readPaymentLogOne", num);
	}

	@Override
	public PaymentLogDto readPaymentLogByPaymentNum(int payment_num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.paymentLog.readPaymentLogByPaymentNum", payment_num);
	}

	@Override
	public List<PaymentLogDto> readPaymentLogByIsPaid(boolean isPaid) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.paymentLog.readPaymentLogByIsPaid", isPaid);
	}

	@Override
	public int updatePaymentLog(PaymentLogDto dto) {
		// TODO Auto-generated method stub
		return session.update("kdc.paymentLog.updatePaymentLog", dto);
	}

	@Override
	public int deletePaymentLog(int num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.paymentLog.deletePaymentLog", num);
	}

	@Override
	public int deletePaymentLogByPaymentNum(int payment_num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.paymentLog.deletePaymentLogByPaymentNum", payment_num);
	}
	
	
}
