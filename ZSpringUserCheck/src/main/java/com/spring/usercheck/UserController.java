package com.spring.usercheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping(value="/user_check.bo",produces="application/json; charset=utf-8")
	private int usercheck(String id)throws Exception{
		int res = userService.usercheckService(id);
		
		return res;
	}
	
}
