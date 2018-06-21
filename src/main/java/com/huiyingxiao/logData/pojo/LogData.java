package com.huiyingxiao.logData.pojo;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LogData {
	
	//日志基本信息对象
	@JsonProperty(value ="logBean")
	private LogBean logBean;
	
	//资源id字段与描述字段的键值对
	@JsonProperty(value ="custIdContextMap")
	private Map<String, Object> custIdContextMap;
	
}
