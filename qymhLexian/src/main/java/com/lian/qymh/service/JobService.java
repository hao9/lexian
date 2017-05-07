package com.lian.qymh.service;

import java.util.List;

import com.lian.qymh.entity.LexianJob;

public interface JobService {

		//查询
		public List<LexianJob> getJob();
		
		//新增
		public int insertJob();
			
		//修改
		public int updateJob();
		
		//删除
		public int delteJob();
	
}
