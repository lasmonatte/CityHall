package com.kdc.cityhall.dto;

import org.springframework.stereotype.Component;

@Component
public class MarketDto {

	/**
	 *	1. Change address
	 */
	
	private int num;
	private String  name;	// Market name
	private int register_num;
	private String status;
	private String asso_name;
	private String asso_rep; // Association Representation
	private String asso_phone;
	private String tel;
	private int addr_num; // addr_db num
	private String addr_full; // full_address
	private int shops;
	private int visitors;
	private String man_name;	// man=담당자
	private String man_email;
	private String man_phone;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegister_num() {
		return register_num;
	}
	public void setRegister_num(int register_num) {
		this.register_num = register_num;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAsso_name() {
		return asso_name;
	}
	public void setAsso_name(String asso_name) {
		this.asso_name = asso_name;
	}
	public String getAsso_rep() {
		return asso_rep;
	}
	public void setAsso_rep(String asso_rep) {
		this.asso_rep = asso_rep;
	}
	public String getAsso_phone() {
		return asso_phone;
	}
	public void setAsso_phone(String asso_phone) {
		this.asso_phone = asso_phone;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAddr_num() {
		return addr_num;
	}
	public void setAddr_num(int addr_num) {
		this.addr_num = addr_num;
	}
	public String getAddr_full() {
		return addr_full;
	}
	public void setAddr_full(String addr_full) {
		this.addr_full = addr_full;
	}
	public int getShops() {
		return shops;
	}
	public void setShops(int shops) {
		this.shops = shops;
	}
	public int getVisitors() {
		return visitors;
	}
	public void setVisitors(int visitors) {
		this.visitors = visitors;
	}
	public String getMan_name() {
		return man_name;
	}
	public void setMan_name(String man_name) {
		this.man_name = man_name;
	}
	public String getMan_email() {
		return man_email;
	}
	public void setMan_email(String man_email) {
		this.man_email = man_email;
	}
	public String getMan_phone() {
		return man_phone;
	}
	public void setMan_phone(String man_phone) {
		this.man_phone = man_phone;
	}
}
