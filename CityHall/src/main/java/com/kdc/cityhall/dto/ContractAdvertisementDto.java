package com.kdc.cityhall.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class ContractAdvertisementDto {

	private int num;
	private int advertiser_num;
	private String name;	// Advertisement name
	private String type;	// Backlight, movie etc
	private int period;	// if year, convert month
	private int counts;	// number of market for adv
	private int sum;	// advertise fare
	private int cost;	// fare for make adv
	private int value;	// sum + cost
	private int total;	// value*10%(VAT)
	private int discount;	// 'discount%'
	private String plan;	// to pay card or cash
	private Date date_cont;	// contract date
	private int deposit;
	private int balance;	// total - deposit - etc
	private int total_times; // if pay monthly, default period;
	private int current_times;	// how many month of deposit_adv
	private int money;	// how much to pay monthly
	private int due_day;	// due_day;
	private String seller_id;	// to search seller
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public Date getDate_cont() {
		return date_cont;
	}
	public void setDate_cont(Date date_cont) {
		this.date_cont = date_cont;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getTotal_times() {
		return total_times;
	}
	public void setTotal_times(int total_times) {
		this.total_times = total_times;
	}
	public int getCurrent_times() {
		return current_times;
	}
	public void setCurrent_times(int current_times) {
		this.current_times = current_times;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getDue_day() {
		return due_day;
	}
	public void setDue_day(int due_day) {
		this.due_day = due_day;
	}
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
}
