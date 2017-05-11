package com.lian.qymh.service;

import java.util.List;

import com.lian.qymh.entity.LexianUser;

/*
 * 对user表的操作
 * 
 */
public interface UserService {

	//查询
	public List<LexianUser> getUser(LexianUser user);
	
	//新增
	public int insertUser(LexianUser user);
		
	//修改
	public void updateUser(LexianUser user);
	
	//删除
	public int delteUser(LexianUser user);

	

	
	
	
}
