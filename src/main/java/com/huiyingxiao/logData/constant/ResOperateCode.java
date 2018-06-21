package com.huiyingxiao.logData.constant;

public enum ResOperateCode {
	
	/** 
	 * 
	 *    操作类型1增2修改(2001转为客户、2002转为意向、2003签约、2010转为沉默客户，
	 *    2011转为流失客户、2021沉默客户转客户、2022流失转客户、2023重新分配)0删除
	 */
	
	LOG_SIGN("2003","签约"),
	LOG_DELETE("0","删除"),
	LOG_WILL("2002","转为意向"), //淘到客户
	LOG_SILENT("2010","转为沉默客户"),
	LOG_WEEK("2021","沉默客户转客户"),
	LOG_LOSING("2011","转为流失客户"),
	LOG_ADD("1","新增资源"),
	LOG_DIST("2023","重新分配"),
	LOG_GIVE("2024","放弃客户"),
	LOG_QUHUI("2025","取回资源"),
	LOG_RECYLE("2026","回收待分配"),
	LOG_TURN_SEA("2027","到期转公海"),
	LOG_TRANSFER("2028","客户交接"),
	LOG_SALETRANSFER("2029","销售交接"),
	LOG_UNSIGN("2030","取消签约"),
	LOG_CHANGE_GROUP("3001","变更分组"),
	LOG_RES_ASSIGN("3002","资源分配"),
	LOG_RES_RECYLE("3003","资源回收"),
	LOG_RES_DEL("3004","资源删除"),
	LOG_RES_CLEAR("3005","资源清空"),
	LOG_RES_MERGE("3006","资源合并"),
	LOG_STAFF_ASSGIN("3007","员工资源分配"),
	LOG_STAFF_RECYLE("3008","员工资源回收"),
	LOG_STAFF_ASSGINING("3009","员工资源分配中"),
	LOG_STAFF_ASSGIN_FAIL("3010","员工资源分配失败"),
	LOG_STAFF_SUSS("3011","员工资源标识成功"),
	LOG_STAFF_FAIL("3012","员工资源标识失败"),
	LOG_STAFF_CALL_OPT("3013","员工资源工作线程操作"),
	LOG_SEA_QH("3014","公海取回"),
	LOG_SET_COMMON_ACC("2031","设置共有者"),
	LOG_CLEAN_COMMON_ACC("2032","取消共有者"),
	
	// 5.1 新增
	LOG_IMP_RES("2051","导入资源"),
	LOG_IMP_CUST("2052","导入意向"),
	LOG_IMP_SIGN("2053","导入签约"),
	LOG_IMP_UNRES("2054","导入待分配"),
	
	LOG_QUHUIYX("2055","取回意向"),
	LOG_CUST("2056","新增意向");
	
	/**
	 * 错误编码
	 */
	private String code;
	
	/**
	 * 错误编码描述
	 */
	private String content;
	
	private ResOperateCode(String code, String content) {
		this.code = code;
		this.content = content;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
