package com.huiyingxiao.logData.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huiyingxiao.logData.pojo.CustomerCardLog;
import com.huiyingxiao.logData.pojo.CustomerCardLogExample;

public interface CustomerCardLogMapper {
    int countByExample(CustomerCardLogExample example);

    int deleteByExample(CustomerCardLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerCardLog record);

    int insertSelective(CustomerCardLog record);

    List<CustomerCardLog> selectByExampleWithBLOBs(CustomerCardLogExample example);

    List<CustomerCardLog> selectByExample(CustomerCardLogExample example);

    CustomerCardLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerCardLog record, @Param("example") CustomerCardLogExample example);

    int updateByExampleWithBLOBs(@Param("record") CustomerCardLog record, @Param("example") CustomerCardLogExample example);

    int updateByExample(@Param("record") CustomerCardLog record, @Param("example") CustomerCardLogExample example);

    int updateByPrimaryKeySelective(CustomerCardLog record);

    int updateByPrimaryKeyWithBLOBs(CustomerCardLog record);

    int updateByPrimaryKey(CustomerCardLog record);
    
    int insertList(List<CustomerCardLog> callInformationList);
}