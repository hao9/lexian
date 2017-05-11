package com.lian.qymh.service;

import java.util.List;

import com.lian.qymh.entity.LexianJob;

public interface JobService {

		//查询
		public List<LexianJob> getJob(LexianJob job);
		
		//新增
		public int insertJob(LexianJob job);
			
		//修改
		public void updateJob(LexianJob job);
		
		//删除
		public int delteJob(Integer id);
	
}
