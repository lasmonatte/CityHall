package com.kdc.cityhall.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class DepositAdvertisementDto {
	
	private int num;
	private int advertiser_num;
	private int c_num;	// Adv contract number
	private Date date_deposit;
	private int money;
	private boolean isDeposit;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getAdvertiser_num() {
		return advertiser_num;
	}
	public void setAdvertiser_num(int advertiser_num) {
		this.advertiser_num = advertiser_num;
	}
	public int getC_num() {
		return c_num;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public Date getDate_deposit() {
		return date_deposit;
	}
	public void setDate_deposit(Date date_deposit) {
		this.date_deposit = date_deposit;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public boolean isDeposit() {
		return isDeposit;
	}
	public void setDeposit(boolean isDeposit) {
		this.isDeposit = isDeposit;
	}
}
