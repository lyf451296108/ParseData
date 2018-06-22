package com.huiyingxiao.logData.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huiyingxiao.logData.constant.LogDataConstant;
import com.huiyingxiao.logData.service.LogDataService;

/**
 * 该类 用于接受输入数据，并将数据持久化到数据库中
 *
 * @author finch.lin
 *
 */
@Controller
public class LogDataController {
	
	@Autowired
	private LogDataService logdataService;
	
	/**
	 * 
	 * 该方法用于保存通话日志
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/callLog", method = RequestMethod.POST)
	public String saveCallLog(HttpServletRequest request, HttpServletResponse response) throws Exception{		
		
		if(null == request || request.getInputStream() == null) {
			return LogDataConstant.CALLLOG_SAVE_UNSUCCESS;
		}
		
		return logdataService.saveCallLog(request.getInputStream());
		
	}
	
	/**
	 * 
	 * 该方法用于保存用户/资源操作日志
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/commonLog", method = RequestMethod.POST)
	public String saveCommonLog(HttpServletRequest request, HttpServletResponse response) throws Exception{		
		
		if(null == request || request.getInputStream() == null) {
			return LogDataConstant.COMMONLOG_SAVE_UNSUCCESS;
		}
		
		return logdataService.saveCommonLog(request.getInputStream());
		
	}
}
