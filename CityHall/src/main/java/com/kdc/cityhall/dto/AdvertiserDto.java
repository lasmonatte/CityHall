package com.kdc.cityhall.dto;

import org.springframework.stereotype.Component;

@Component
public class AdvertiserDto {

	private int num;
	private String b_name;	// business name
	private int register_num;	// bussiness register number
	private String b_type;	// business type
	private String b_conditions;	// business conditions
	private String tel;	// business telephone
	private String fax; // business fax number
	private String name;	// man name
	private String phone;	// man phone
	private String email; // man email
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public int getRegister_num() {
		return register_num;
	}
	public void setRegister_num(int register_num) {
		this.register_num = register_num;
	}
	public String getB_type() {
		return b_type;
	}
	public void setB_type(String b_type) {
		this.b_type = b_type;
	}
	public String getB_conditions() {
		return b_conditions;
	}
	public void setB_conditions(String b_conditions) {
		this.b_conditions = b_conditions;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
