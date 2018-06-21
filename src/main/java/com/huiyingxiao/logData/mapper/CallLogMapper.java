package com.huiyingxiao.logData.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huiyingxiao.logData.pojo.CallLog;
import com.huiyingxiao.logData.pojo.CallLogExample;

public interface CallLogMapper {
    int countByExample(CallLogExample example);

    int deleteByExample(CallLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CallLog record);

    int insertSelective(CallLog record);

    List<CallLog> selectByExample(CallLogExample example);

    CallLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CallLog record, @Param("example") CallLogExample example);

    int updateByExample(@Param("record") CallLog record, @Param("example") CallLogExample example);

    int updateByPrimaryKeySelective(CallLog record);

    int updateByPrimaryKey(CallLog record);
    
    int insertList(List<CallLog> callInformationList);
}