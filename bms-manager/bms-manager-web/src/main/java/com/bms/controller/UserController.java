package com.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bms.pojo.BmsResult;
import com.bms.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@RequestMapping("/index")
	@ResponseBody
	public BmsResult showindex(){
		BmsResult allUser = userservice.getAllUser();
		//userservice.insertUser();
		return allUser;
	}
}
