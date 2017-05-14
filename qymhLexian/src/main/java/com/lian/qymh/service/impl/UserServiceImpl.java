package com.lian.qymh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lian.qymh.dao.LexianUserMapper;

import com.lian.qymh.entity.LexianUser;
import com.lian.qymh.entity.LexianUserExample;
import com.lian.qymh.entity.LexianUserExample.Criteria;
import com.lian.qymh.service.UserService;
@Service("Service")
public class UserServiceImpl implements UserService {
	@Resource
	private LexianUserMapper lexianuserMapper;
	public List<LexianUser> getUser(LexianUser lu) {
		LexianUserExample Example=new LexianUserExample();
		Criteria criteria=Example.createCriteria();
		if(null !=lu.getName()&&!"" .equals(lu.getName()))
			criteria.andNameLike(lu.getName());
		Example.or(criteria);
		
		return lexianuserMapper.selectByExample(Example);
	}

	public int insertUser(LexianUser lu) {
		// TODO Auto-generated method stub
		return lexianuserMapper.insert(lu);
	}

	public void updateUser(LexianUser user) {
		lexianuserMapper.updateByPrimaryKey(user);
		
	}

	public int delteUser(String id) {
		// TODO Auto-generated method stub
		return lexianuserMapper.deleteByPrimaryKey(id);
	}

	public int insertUser() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delteUser(LexianUser user) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
