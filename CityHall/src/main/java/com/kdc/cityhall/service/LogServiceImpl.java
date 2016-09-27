package com.kdc.cityhall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dao.LogDao;
import com.kdc.cityhall.dto.LogDto;

@Component
public class LogServiceImpl implements LogService{

	@Autowired LogDao dao;

	@Override
	public int createLogService(LogDto dto) {
		// TODO Auto-generated method stub
		return dao.createLog(dto);
	}

	@Override
	public List<LogDto> readLogAllService() {
		// TODO Auto-generated method stub
		return dao.readLogAll();
	}

	@Override
	public LogDto readLogOneService(int num) {
		// TODO Auto-generated method stub
		return dao.readLogOne(num);
	}

	@Override
	public List<LogDto> readLogByIdService(String id) {
		// TODO Auto-generated method stub
		return dao.readLogById(id);
	}

	@Override
	public int updateLogService(LogDto dto) {
		// TODO Auto-generated method stub
		return dao.updateLog(dto);
	}

	@Override
	public int deleteLogService(int num) {
		// TODO Auto-generated method stub
		return dao.deleteLog(num);
	}

	@Override
	public int deleteLogByIdService(String id) {
		// TODO Auto-generated method stub
		return dao.deleteLogById(id);
	}
	
	
}
