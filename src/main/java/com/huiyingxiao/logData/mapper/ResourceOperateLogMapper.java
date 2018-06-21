package com.huiyingxiao.logData.mapper;

import com.huiyingxiao.logData.pojo.ResourceOperateLog;
import com.huiyingxiao.logData.pojo.ResourceOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceOperateLogMapper {
    int countByExample(ResourceOperateLogExample example);

    int deleteByExample(ResourceOperateLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ResourceOperateLog record);

    int insertSelective(ResourceOperateLog record);

    List<ResourceOperateLog> selectByExampleWithBLOBs(ResourceOperateLogExample example);

    List<ResourceOperateLog> selectByExample(ResourceOperateLogExample example);

    ResourceOperateLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ResourceOperateLog record, @Param("example") ResourceOperateLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ResourceOperateLog record, @Param("example") ResourceOperateLogExample example);

    int updateByExample(@Param("record") ResourceOperateLog record, @Param("example") ResourceOperateLogExample example);

    int updateByPrimaryKeySelective(ResourceOperateLog record);

    int updateByPrimaryKeyWithBLOBs(ResourceOperateLog record);

    int updateByPrimaryKey(ResourceOperateLog record);
}