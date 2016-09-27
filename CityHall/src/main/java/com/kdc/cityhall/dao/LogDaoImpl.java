package com.kdc.cityhall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdc.cityhall.dto.LogDto;

@Component
public class LogDaoImpl implements LogDao{
	
	@Autowired SqlSession	session;

	@Override
	public int createLog(LogDto dto) {
		// TODO Auto-generated method stub
		return session.insert("kdc.log.createLog", dto);
	}

	@Override
	public List<LogDto> readLogAll() {
		// TODO Auto-generated method stub
		return session.selectList("kdc.log.readLogAll");
	}

	@Override
	public LogDto readLogOne(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("kdc.log.readLogOne", num);
	}

	@Override
	public List<LogDto> readLogById(String id) {
		// TODO Auto-generated method stub
		return session.selectList("kdc.log.readLogById", id);
	}

	@Override
	public int updateLog(LogDto dto) {
		// TODO Auto-generated method stub
		return session.update("kdc.log.updateLog", dto);
	}

	@Override
	public int deleteLog(int num) {
		// TODO Auto-generated method stub
		return session.delete("kdc.log.deleteLog", num);
	}

	@Override
	public int deleteLogById(String id) {
		// TODO Auto-generated method stub
		return session.delete("kdc.log.deleteLogById", id);
	}
}
