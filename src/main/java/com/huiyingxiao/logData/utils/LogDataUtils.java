package com.huiyingxiao.logData.utils;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.huiyingxiao.logData.constant.LogDataConstant;
import com.huiyingxiao.logData.pojo.CallLog;
import com.huiyingxiao.logData.pojo.CustomerCardLog;
import com.huiyingxiao.logData.pojo.LogBean;
import com.huiyingxiao.logData.pojo.ResourceOperateLog;
import com.huiyingxiao.logData.pojo.UserOperateLog;

/**
 * 
 * 放置工具方法
 * 
 * @author finch.lin
 *
 */
public class LogDataUtils {
	/**
	 * xml文档Document转对象
	 * 
	 * @param document
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static List<CallLog> getObject(Document document, Class<?> clazz) {
		Object obj = null;
		// 获取根节点
		Element root = document.getRootElement();
		try {
			//获取body节点
			Element body = root.element(LogDataConstant.BODY_ELEMENT);
			List<CallLog> callLogList = new ArrayList<CallLog>();
			List<Element> properties = body.elements();

			for (Element pro : properties) {
				obj = clazz.newInstance();// 创建对象
				// 获取属性名(首字母大写)
				List<Attribute> list = pro.attributes();
				
				for (Attribute arr : list) {
					String propertyname = arr.getName();
					String propertyvalue = arr.getValue();
					Method m = obj.getClass().getMethod("set" + upperCaseFirstLetter(propertyname), String.class);
					m.invoke(obj, propertyvalue);
				}

				CallLog callLog = (CallLog) obj;
				callLog.setCreateTime(new Date());
				callLogList.add(callLog);
			}
			
			return callLogList;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * xml字符串转对象
	 * 
	 * @param xmlString
	 * @param clazz
	 * @return
	 * @throws Exception
	 */
	public static List<CallLog> getObject(String xmlString, Class<?> clazz) throws Exception {
		Document document = null;
		try {
			document = DocumentHelper.parseText(xmlString);
		} catch (DocumentException e) {
			throw new Exception("获取Document异常" + xmlString);
		} // 获取根节点
		return getObject(document, clazz);
	}
	
	/**
	 * 
	 * 将字符串首字母转大写
	 * 
	 * @param str
	 * @return
	 */
	public static String upperCaseFirstLetter(String str) {

		if (str != null && str != "") {
			str = str.substring(0, 1).toUpperCase() + str.substring(1);
		}
		return str;
	}
	
	/**
	 * 获取系统时间
	 * 
	 * @return
	 */
	public static Date getDate() {
		return new Date();
	}
	
	/**
	 * 
	 * 将输入流转为byte数组
	 * 
	 * @param is
	 * @return
	 * @throws IOException
	 */
	public static byte[] getData(InputStream is) throws IOException {
		BufferedInputStream bis = null;
		ByteArrayOutputStream baos = null;

		try {
			bis = new BufferedInputStream(is, 1024);
			baos = new ByteArrayOutputStream(1024);

			byte[] b = new byte[1024];
			int len;
			while ((len = bis.read(b)) != -1) {
				baos.write(b, 0, len);
			}

			return baos.toByteArray();
		} finally {
			bis.close();
			baos.close();
		}
	}
	
	/**
	 * 将LogBean转为ResourceOperateLog
	 * 
	 * @param resourceLog
	 * @param logBean
	 * @return
	 */
	public static ResourceOperateLog converLogBeanToResourceLogData(ResourceOperateLog resourceLog, LogBean logBean) {

		resourceLog.setBatchId(logBean.getBatchId());
		resourceLog.setContent(logBean.getContent());
		resourceLog.setData(logBean.getData());
		resourceLog.setModuleId(logBean.getModuleId());
		resourceLog.setModuleName(logBean.getModuleName());
		resourceLog.setOperateId(logBean.getOperateId());
		resourceLog.setOperateName(logBean.getOperateName());
		resourceLog.setOperateNum(logBean.getOperateNum());
		resourceLog.setOrgId(logBean.getOrgId());
		resourceLog.setOwnerAcc(logBean.getOwnerAcc());
		resourceLog.setResOperateId(logBean.getResOperateId());
		resourceLog.setResOperateName(logBean.getResOperateName());
		resourceLog.setUserAcc(logBean.getUserAcc());
		resourceLog.setUserName(logBean.getUserName());
		resourceLog.setCreateData(new Date());

		return resourceLog;
	}
	
	/**
	 * 将LogBean转为UserOperateLog
	 * 
	 * @param resourceLog
	 * @param logBean
	 * @return
	 */
	public static UserOperateLog converLogBeanToUserLogData(UserOperateLog userLog, LogBean logBean) {

		userLog.setBatchId(logBean.getBatchId());
		userLog.setContent(logBean.getContent());
		userLog.setData(logBean.getData());
		userLog.setModuleId(logBean.getModuleId());
		userLog.setModuleName(logBean.getModuleName());
		userLog.setOperateId(logBean.getOperateId());
		userLog.setOperateName(logBean.getOperateName());
		userLog.setOperateNum(logBean.getOperateNum());
		userLog.setOrgId(logBean.getOrgId());
		userLog.setOwnerAcc(logBean.getOwnerAcc());
		userLog.setResOperateId(logBean.getResOperateId());
		userLog.setResOperateName(logBean.getResOperateName());
		userLog.setUserAcc(logBean.getUserAcc());
		userLog.setUserName(logBean.getUserName());
		userLog.setCreateData(new Date());

		return userLog;
	}
	
	/**
	 * 将LogBean转为CustomerCardLog
	 * 
	 * @param resourceLog
	 * @param logBean
	 * @return
	 */
	public static CustomerCardLog converLogBeanToCustomerCardLog(CustomerCardLog customerCardLog, LogBean logBean) {

		customerCardLog.setBatchId(logBean.getBatchId());
		customerCardLog.setContent(logBean.getContent());
		customerCardLog.setData(logBean.getData());
		customerCardLog.setModuleId(logBean.getModuleId());
		customerCardLog.setModuleName(logBean.getModuleName());
		customerCardLog.setOperateId(logBean.getOperateId());
		customerCardLog.setOperateName(logBean.getOperateName());
		customerCardLog.setOperateNum(logBean.getOperateNum());
		customerCardLog.setOrgId(logBean.getOrgId());
		customerCardLog.setOwnerAcc(logBean.getOwnerAcc());
		customerCardLog.setResOperateId(logBean.getResOperateId());
		customerCardLog.setResOperateName(logBean.getResOperateName());
		customerCardLog.setUserAcc(logBean.getUserAcc());
		customerCardLog.setUserName(logBean.getUserName());
		customerCardLog.setCreateData(new Date());

		return customerCardLog;
	}
}
