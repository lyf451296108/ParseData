package com.huiyingxiao.logData.utils;

import java.lang.reflect.Method;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

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
	public static Object getObject(Document document, Class<?> clazz) {
		Object obj = null;
		// 获取根节点
		Element root = document.getRootElement();
		try {
			Element body = root.element("body");
			//List<CallInformation> callInforList = new ArrayList<CallInformation>();
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

				//CallInformation callInfor = (CallInformation) obj;
				//callInfor.setCreateTime(new Date());
				//callInforList.add(callInfor);
			}

			//cMapper.insertList(callInforList);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	/**
	 * xml字符串转对象
	 * 
	 * @param xmlString
	 * @param clazz
	 * @return
	 * @throws Exception
	 */
	public static Object getObject(String xmlString, Class<?> clazz) throws Exception {
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
}
