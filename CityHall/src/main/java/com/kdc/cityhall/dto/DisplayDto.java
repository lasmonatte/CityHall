package com.kdc.cityhall.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class DisplayDto {

	private int num;
	private int market_num;
	private int size;	//inch
	private String name;	// custom name
	private	String serial;	// display serial number
	private String maker;	//	maker company
	private	Date date_prod;	//	produce date
	private String model;	//	model name
	private Date date_install;	// installed date
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getMarket_num() {
		return market_num;
	}
	public void setMarket_num(int market_num) {
		this.market_num = market_num;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public Date getDate_prod() {
		return date_prod;
	}
	public void setDate_prod(Date date_prod) {
		this.date_prod = date_prod;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Date getDate_install() {
		return date_install;
	}
	public void setDate_install(Date date_install) {
		this.date_install = date_install;
	}
}
