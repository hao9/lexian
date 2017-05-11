package com.lian.qymh.dao;

import com.lian.qymh.entity.LexianJob;
import com.lian.qymh.entity.LexianJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LexianJobMapper {
    int countByExample(LexianJobExample example);

    int deleteByExample(LexianJobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LexianJob record);

    int insertSelective(LexianJob record);

    List<LexianJob> selectByExample(LexianJobExample example);

    LexianJob selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LexianJob record, @Param("example") LexianJobExample example);

    int updateByExample(@Param("record") LexianJob record, @Param("example") LexianJobExample example);

    int updateByPrimaryKeySelective(LexianJob record);

    int updateByPrimaryKey(LexianJob record);
}