package com.kdc.cityhall.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class PaymentLogDto {

	private int num;
	private int payment_num;
	private boolean isPaid;
	private Date date_paid;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPayment_num() {
		return payment_num;
	}
	public void setPayment_num(int payment_num) {
		this.payment_num = payment_num;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	public Date getDate_paid() {
		return date_paid;
	}
	public void setDate_paid(Date date_paid) {
		this.date_paid = date_paid;
	}
}
