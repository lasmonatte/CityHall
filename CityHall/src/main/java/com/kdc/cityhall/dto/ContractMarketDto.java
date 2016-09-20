package com.kdc.cityhall.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class ContractMarketDto {

	private int num;
	private int market_num;	// for search market
	private Date date_cont;	// contract
	private Date date_exp;	// expired
	private int period; // if year, convert month
	private int display_proc; // procuracy
	private int display_new;
	private boolean isMusic;
	private boolean isCalander;
	private boolean isOperation; // fare_elec + fare_comm + etc
	private String realPath;
	private String urlPath;
	private int fare_elec;
	private int fare_comm;
	
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
	public Date getDate_cont() {
		return date_cont;
	}
	public void setDate_cont(Date date_cont) {
		this.date_cont = date_cont;
	}
	public Date getDate_exp() {
		return date_exp;
	}
	public void setDate_exp(Date date_exp) {
		this.date_exp = date_exp;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getDisplay_proc() {
		return display_proc;
	}
	public void setDisplay_proc(int display_proc) {
		this.display_proc = display_proc;
	}
	public int getDisplay_new() {
		return display_new;
	}
	public void setDisplay_new(int display_new) {
		this.display_new = display_new;
	}
	public boolean isMusic() {
		return isMusic;
	}
	public void setMusic(boolean isMusic) {
		this.isMusic = isMusic;
	}
	public boolean isCalander() {
		return isCalander;
	}
	public void setCalander(boolean isCalander) {
		this.isCalander = isCalander;
	}
	public boolean isOperation() {
		return isOperation;
	}
	public void setOperation(boolean isOperation) {
		this.isOperation = isOperation;
	}
	public String getRealPath() {
		return realPath;
	}
	public void setRealPath(String realPath) {
		this.realPath = realPath;
	}
	public String getUrlPath() {
		return urlPath;
	}
	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}
	public int getFare_elec() {
		return fare_elec;
	}
	public void setFare_elec(int fare_elec) {
		this.fare_elec = fare_elec;
	}
	public int getFare_comm() {
		return fare_comm;
	}
	public void setFare_comm(int fare_comm) {
		this.fare_comm = fare_comm;
	}
}
