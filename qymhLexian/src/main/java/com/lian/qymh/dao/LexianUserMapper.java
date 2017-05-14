package com.lian.qymh.dao;

import com.lian.qymh.entity.LexianUser;
import com.lian.qymh.entity.LexianUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LexianUserMapper {
    int countByExample(LexianUserExample example);

    int deleteByExample(LexianUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(LexianUser record);

    int insertSelective(LexianUser record);

    List<LexianUser> selectByExample(LexianUserExample example);

    LexianUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LexianUser record, @Param("example") LexianUserExample example);

    int updateByExample(@Param("record") LexianUser record, @Param("example") LexianUserExample example);

    int updateByPrimaryKeySelective(LexianUser record);

    int updateByPrimaryKey(LexianUser record);
}