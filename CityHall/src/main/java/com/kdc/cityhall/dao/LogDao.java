package com.kdc.cityhall.dao;

import java.util.List;

import com.kdc.cityhall.dto.LogDto;

public interface LogDao {

	public int createLog(LogDto dto);
	public List<LogDto> readLogAll();
	public LogDto readLogOne(int num);
	public List<LogDto> readLogById(String id);
	public int updateLog(LogDto dto);
	public int deleteLog(int num);
	public int deleteLogById(String id);
}
