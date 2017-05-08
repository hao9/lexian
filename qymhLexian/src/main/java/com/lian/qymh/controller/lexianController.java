package com.lian.qymh.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lian.qymh.entity.LexianJob;
import com.lian.qymh.entity.LexianUser;
import com.lian.qymh.service.JobService;
import com.lian.qymh.service.UserService;

@Controller
@RequestMapping("/lexian")
public class lexianController {

	/////////////////User管理 start///////////////////////////////////
	
	@Autowired
	private UserService userService;
	
	//获取用户列表
	@RequestMapping("/getuser")
	public List<LexianUser> getUser(){
		
		return null;
	}
	
	//删除用户
	@RequestMapping("/delteuser")
	public int delteuser(LexianUser user){
		
		return 0;
	}
	
	//修改用户
	@RequestMapping("/updateuser")
	public int updateuser(LexianUser user){
		
		return 0;
	}
	
	//新增用户
	@RequestMapping("adduser")
	public int insterUser(LexianUser user){
		
		return 0;
	}
	
	
		/////////////////job管理 start///////////////////////////////////
			
		@Autowired
		private JobService jobService;
		
		//获取用户列表
		@RequestMapping("/getjob")
		public List<LexianJob> getJob(){
		
		return null;
		}
		
		//删除用户
		@RequestMapping("/deltejob")
		public int deltejob(LexianJob job){
		
		return 0;
		}
		
		//修改用户
		@RequestMapping("/updatejob")
		public int updatejob(LexianJob job){
		
		return 0;
		}
		
		//新增用户
		@RequestMapping("addjob")
		public int insterjob(LexianJob job){
		
		return 0;
		}
			
	
}
