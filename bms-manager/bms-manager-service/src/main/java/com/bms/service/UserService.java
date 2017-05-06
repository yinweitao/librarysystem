package com.bms.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.mapper.TbUserMapper;
import com.bms.pojo.BmsResult;
import com.bms.pojo.TbUser;
import com.bms.pojo.TbUserExample;

@Service
public class UserService {
	
	@Autowired
	private TbUserMapper usermapper;
	
	public BmsResult getAllUser(){
		
		TbUserExample example= new TbUserExample();
		List<TbUser> list = usermapper.selectByExample(example);
		return BmsResult.ok(list);
	}
	
	public BmsResult insertUser(){
		
		TbUser record = new TbUser();
		record.setCreated(new Date());
		record.setUpdated(new Date());
		record.setUsername("fasd");
		record.setPassword("dafs");
		 usermapper.insert(record);
		return BmsResult.ok();
	}
}
