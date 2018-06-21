package com.huiyingxiao.logData.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.huiyingxiao.logData.constant.LogDataConstant;
import com.huiyingxiao.logData.mapper.CallLogMapper;
import com.huiyingxiao.logData.mapper.CustomerCardLogMapper;
import com.huiyingxiao.logData.mapper.ResourceOperateLogMapper;
import com.huiyingxiao.logData.mapper.UserOperateLogMapper;
import com.huiyingxiao.logData.pojo.CallLog;
import com.huiyingxiao.logData.pojo.CustomerCardLog;
import com.huiyingxiao.logData.pojo.LogBean;
import com.huiyingxiao.logData.pojo.LogData;
import com.huiyingxiao.logData.pojo.ResourceOperateLog;
import com.huiyingxiao.logData.pojo.UserOperateLog;
import com.huiyingxiao.logData.utils.CodeUtils;
import com.huiyingxiao.logData.utils.LogDataUtils;

@Service
public class LogDataService {
	
	@Autowired
	private CallLogMapper callLogMapper;
	
	@Autowired
	private CustomerCardLogMapper customerCardLogMapper;
	
	@Autowired
	private ResourceOperateLogMapper resourceOperateLogMapper;
	
	@Autowired
	private UserOperateLogMapper userOperateLogMapper;
	
	/**
	 * 
	 * 用于保存通话日志
	 * 
	 * @param is
	 * @return
	 * @throws Exception
	 */
	public String saveCallLog(final InputStream is){
		
		String xmlData = "";
		byte[] byteData;
		
		try {
			//将输入字符串转为byte[]数组
			byteData = LogDataUtils.getData(is);
			
			//解密数据
			xmlData = new String(CodeUtils.decrypt(LogDataConstant.KEY.getBytes(LogDataConstant.CHAR_ENCODING),CodeUtils.base64Decode(byteData)), LogDataConstant.CHAR_ENCODING);
			
			//将解密数据转为CallLog对象
			List<CallLog> callLogList= LogDataUtils.getObject(xmlData,CallLog.class);
			
			if(callLogList == null || callLogList.size() == 0) {
				return LogDataConstant.CALLLOG_SAVE_UNSUCCESS;
			}
			
			//数据入库
			callLogMapper.insertList(callLogList);
			
			return LogDataConstant.CALLLOG_SAVE_SUCCESS;
		} catch (Exception e) {
			return LogDataConstant.CALLLOG_SAVE_UNSUCCESS;
		}
	}
	
	/**
	 * 
	 * 用于保存一般日志
	 * 
	 * @param is
	 * @return
	 * @throws Exception
	 */
	public String saveCommonLog(final InputStream is){
		
		String jsonData = "";
		byte[] byteData;
		
		try {
			//将输入字符串转为byte[]数组
			byteData = LogDataUtils.getData(is);
			
			//解密数据
			jsonData = new String(CodeUtils.decrypt(LogDataConstant.KEY.getBytes(LogDataConstant.CHAR_ENCODING), CodeUtils.base64Decode(byteData)),
					LogDataConstant.CHAR_ENCODING);
			
			//将解密数据转为LogData对象
			LogData commonData = JSONObject.parseObject(jsonData, LogData.class);
			
			if(null == commonData) {
				return LogDataConstant.COMMONLOG_SAVE_UNSUCCESS;
			}

			final LogBean logBean = commonData.getLogBean();
			
			if(null == logBean) {
				return LogDataConstant.COMMONLOG_SAVE_UNSUCCESS;
			}
			
			final Map<String, Object> custIdContextMap = commonData.getCustIdContextMap();
			
			//当资源操作类型id为3002、3003、3004、3005这四种类型时，会将日志同时保存到用户操作日志和资源操作日志表中
			if(logBean.getResOperateId().trim().equals("3002") || logBean.getResOperateId().trim().equals("3003") ||
					logBean.getResOperateId().trim().equals("3004") || logBean.getResOperateId().trim().equals("3005")) {
				
				ResourceOperateLog resourceOperateLog = new ResourceOperateLog();
				
				//对象类型转换
				resourceOperateLog = LogDataUtils.converLogBeanToResourceLogData(resourceOperateLog,logBean);
				
				//保存到资源操作日志表
				resourceOperateLogMapper.insert(resourceOperateLog);
			}
			
			//其他类型日志只写用户操作日志表
			UserOperateLog userOperateLog = new UserOperateLog();
			
			//对象类型转换
			userOperateLog = LogDataUtils.converLogBeanToUserLogData(userOperateLog, logBean);
			
			//保存到用户操作日志表
			userOperateLogMapper.insert(userOperateLog);
			
			//当custIdContextMap不为空时，会写客户卡片日志表，写入条数与custIdContextMap.size()一致
			if (custIdContextMap.size() > 0) {
				
				List<CustomerCardLog> customerCardLogList = new ArrayList<CustomerCardLog>();

				CustomerCardLog customerCardLog = null;
				
				//为map中的每一组entry创建入库实体
				for (Map.Entry<String, Object> entry : custIdContextMap.entrySet()) {
					customerCardLog = new CustomerCardLog();
					
					customerCardLog  = LogDataUtils.converLogBeanToCustomerCardLog(customerCardLog, logBean);
					
					customerCardLog.setResouceId(entry.getKey());
					
					if (StringUtils.isEmpty(entry.getValue().toString())) {
						customerCardLog.setOperateDes(logBean.getOperateName() + " -> " + logBean.getResOperateName());
					} else {
						customerCardLog.setOperateDes(entry.getValue().toString());
					}

					customerCardLogList.add(customerCardLog);
				}
				
				//保存到客户卡片日志表
				customerCardLogMapper.insertList(customerCardLogList);
			} 
			
			return LogDataConstant.COMMONLOG_SAVE_SUCCESS;
		} catch (Exception e) {
			return LogDataConstant.COMMONLOG_SAVE_UNSUCCESS;
		}
	}
}
