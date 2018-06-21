package com.huiyingxiao.logData.mapper;

import com.huiyingxiao.logData.pojo.UserOperateLog;
import com.huiyingxiao.logData.pojo.UserOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOperateLogMapper {
    int countByExample(UserOperateLogExample example);

    int deleteByExample(UserOperateLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserOperateLog record);

    int insertSelective(UserOperateLog record);

    List<UserOperateLog> selectByExampleWithBLOBs(UserOperateLogExample example);

    List<UserOperateLog> selectByExample(UserOperateLogExample example);

    UserOperateLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserOperateLog record, @Param("example") UserOperateLogExample example);

    int updateByExampleWithBLOBs(@Param("record") UserOperateLog record, @Param("example") UserOperateLogExample example);

    int updateByExample(@Param("record") UserOperateLog record, @Param("example") UserOperateLogExample example);

    int updateByPrimaryKeySelective(UserOperateLog record);

    int updateByPrimaryKeyWithBLOBs(UserOperateLog record);

    int updateByPrimaryKey(UserOperateLog record);
}