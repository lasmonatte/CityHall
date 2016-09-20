package com.kdc.cityhall.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class LogDto {

	private int num;
	private String tbl_name;	// table name
	private int tbl_pk;	//	pk where occured log
	private Date reg_date;	//	regestered date
	private String reg_id;	//	man id
	private String message;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTbl_name() {
		return tbl_name;
	}
	public void setTbl_name(String tbl_name) {
		this.tbl_name = tbl_name;
	}
	public int getTbl_pk() {
		return tbl_pk;
	}
	public void setTbl_pk(int tbl_pk) {
		this.tbl_pk = tbl_pk;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
