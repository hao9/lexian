package com.lian.qymh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lian.qymh.dao.LexianJobMapper;
import com.lian.qymh.entity.LexianJob;
import com.lian.qymh.entity.LexianJobExample;
import com.lian.qymh.entity.LexianJobExample.Criteria;
import com.lian.qymh.service.JobService;
@Service("jobService")
public class JobServiceImpl implements JobService {
	@Resource
	private LexianJobMapper lexianjobmapper;

	public List<LexianJob> getJob(LexianJob job) {
		LexianJobExample example=new LexianJobExample();
		Criteria criteria=example.createCriteria();
		if(null !=job.getNum()&&!"" .equals(job.getNum()))
			criteria.andJobLike(null);
			example.or(criteria);
		return lexianjobmapper.selectByExample(example);
	}

	public int insertJob(LexianJob job) {
		
		return lexianjobmapper.insert(job);
	}

	public void updateJob(LexianJob job) {
		// TODO Auto-generated method stub
		 lexianjobmapper.updateByPrimaryKey(job);
	}

	public int delteJob(Integer id) {
		// TODO Auto-generated method stub
		return lexianjobmapper.deleteByPrimaryKey(id);
	}

	

}
