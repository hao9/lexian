package com.lian.qymh.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public  @ResponseBody List<LexianUser> getUser(LexianUser user){
		
		return userService.getUser(user);
	}
	
	//删除用户
	@RequestMapping("/delteuser")
	public @ResponseBody String delteuser(LexianUser user){
		userService.delteUser(user);
		return "sruuer";
	}
	
	//修改用户
	@RequestMapping("/updateuser")
	public int updateuser(LexianUser user){
		
				
		userService.updateUser(user);
		return 0;
	}
	
	//新增用户
	@RequestMapping("adduser")
	public  @ResponseBody String insterUser(LexianUser id){
		userService.insertUser(id);
		return"";
	}
	
	
		/////////////////job管理 start///////////////////////////////////
			
		@Autowired
		private JobService jobService;
		
		//获取用户列表
		@RequestMapping("/getjob")
		public @ResponseBody List<LexianJob> getJob(LexianJob job){
			
		return jobService.getJob(job);
		}
		
		//删除用户
		@RequestMapping("/deltejob")
		public @ResponseBody String deltejob(Integer id){
			jobService.delteJob(id);
		return "";
		}
		
		//修改用户
		@RequestMapping("/updatejob")
		public int updatejob(LexianJob job){
			jobService.updateJob(job);
		return 0 ;
		}
		
		//新增用户
		@RequestMapping("addjob")
		public@ResponseBody String insterjob(LexianJob job){
			jobService.insertJob(job);
		return"";
		}
		/////////////////LOG管理 start///////////////////////////////////
		
		private final String named="qiumei";
		private final String passwordd="12";
		
		@RequestMapping("login")
		public String selectlogin(String name ,String password){
			if(null!= name && null != password){
				if(name.equals(named)&&password.equals(passwordd)){
					return"manage/index.html" ;
				}else {
					return"html/login.html" ;
				}
			}
		return   "";
		}
		
}
