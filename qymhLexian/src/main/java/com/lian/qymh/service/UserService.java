package com.lian.qymh.service;

import java.util.List;

import com.lian.qymh.entity.LexianUser;

/*
 * ��user��Ĳ���
 * 
 */
public interface UserService {

	//��ѯ
	public List<LexianUser> getUser();
	
	//����
	public int insertUser();
		
	//�޸�
	public int updateUser();
	
	//ɾ��
	public int delteUser();
	
	
}
