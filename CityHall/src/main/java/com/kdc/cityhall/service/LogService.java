package com.kdc.cityhall.service;

import java.util.List;

import com.kdc.cityhall.dto.LogDto;

public interface LogService {

	public int createLogService(LogDto dto);
	public List<LogDto> readLogAllService();
	public LogDto readLogOneService(int num);
	public List<LogDto> readLogByIdService(String id);
	public int updateLogService(LogDto dto);
	public int deleteLogService(int num);
	public int deleteLogByIdService(String id);
}
