package com.kdc.cityhall.user.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class UserDto{
	private int num;
	private String id;
	private String password;
	private String name;
	private String dept;
	private String position;
	private String phone;
	private String email;
	private String address;
	private boolean enabled;
	private Timestamp sub_date;
	private Timestamp latest_date;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Timestamp getSub_date() {
		return sub_date;
	}
	public void setSub_date(Timestamp sub_date) {
		this.sub_date = sub_date;
	}
	public Timestamp getLatest_date() {
		return latest_date;
	}
	public void setLatest_date(Timestamp latest_date) {
		this.latest_date = latest_date;
	}

	
}
