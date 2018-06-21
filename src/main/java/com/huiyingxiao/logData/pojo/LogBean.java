package com.huiyingxiao.logData.pojo;

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
public class LogBean {
	
    //批号id
	@JsonProperty(value ="batchId")
	private String batchId;
	
	//备注说明
	@JsonProperty(value ="content")
	private String content;
	
	//资源JSON数据
	@JsonProperty(value ="data")
	private String data;
	
	//模块id
	@JsonProperty(value ="moduleId")
	private String moduleId;
	
	//模块名称
	@JsonProperty(value ="moduleName")
	private String moduleName;
	
	//操作类型id
	@JsonProperty(value ="operateId")
	private String operateId;
	
	//操作类型名称
	@JsonProperty(value ="operateName")
	private String operateName;
	
	//资源操作数量
	@JsonProperty(value ="operateNum")
	private Integer operateNum;
	
	//单位id
	@JsonProperty(value ="orgId")
	private String orgId;
	
	//资源持有人账号
	@JsonProperty(value ="ownerAcc")
	private String ownerAcc;
	
	//资源操作类型id
	@JsonProperty(value ="resOperateId")
	private String resOperateId;
	
	//资源操作类型名称
	@JsonProperty(value ="resOperateName")
	private String resOperateName;
	
	//操作人账号
	@JsonProperty(value ="userAcc")
	private String userAcc;
	
	//操作人名称
	@JsonProperty(value ="userName")
	private String userName;

}
