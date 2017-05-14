package com.lian.qymh.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lian.qymh.controller.LexianController;
import com.lian.qymh.entity.LexianJob;


@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class test {

	
	@Autowired
	LexianController lexianController  = new LexianController();
	
	@Test
	public void insertUser(){
		LexianJob job = new LexianJob();
		job.setId("11111111111111112");
		job.setName("java工程師");
		job.setAddress("龍崗區");
		String i = lexianController.insterjob(job);
		System.out.println(i);
		
	}
	
	@Test
	public void listNode(){
		
		System.out.println();
	}
	@Test 
	public void addrole(){
		
		
	
	};
}
