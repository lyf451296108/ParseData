package com.huiyingxiao.logData.pojo;

import java.util.Date;


/**
 * 
 * 通话信息日志
 * 
 * @author finch.lin
 *
 */
public class CallLog {
	/**
	 * 日志编号
	 * 
	 */
    private Integer id;
    
    /**
     * 呼叫类型:
     * <li>1已接来电;
     * <li>2已拨电话;
     * <li>3未接来电;
     * <li>4未接去电;
     */
    private String callType;
    
    /**
     * 主叫号码
     * 
     */
    private String callerNum;
    
    /**
     * 被叫号码
     * 
     */
    private String calledNum;
    
    /**
     * 通话开始时间
     * 
     */
    private String startTime;
    
    /**
     * 通话时长
     * 单位：秒
     */
    private String timeLength;
    
    /**
     * 通话唯一标识
     * 
     */
    private String code;
    
    /**
     * 录音地址
     * 
     */
    private String recordUrl;
    
    /**
     * 所有者帐号
     * 
     */
    private String ownerAcc;
    
    /**
     * 通信号码
     * 
     */
    private String communicationNo;
    
    /**
     * 跟进ID（可能为空）
     * 
     */
    private String followId;
    
    /**
     * 日志创建时间
     * 
     */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType == null ? null : callType.trim();
    }

    public String getCallerNum() {
        return callerNum;
    }

    public void setCallerNum(String callerNum) {
        this.callerNum = callerNum == null ? null : callerNum.trim();
    }

    public String getCalledNum() {
        return calledNum;
    }

    public void setCalledNum(String calledNum) {
        this.calledNum = calledNum == null ? null : calledNum.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getTimeLength() {
        return timeLength;
    }

    public void setTimeLength(String timeLength) {
        this.timeLength = timeLength == null ? null : timeLength.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getRecordURL() {
        return recordUrl;
    }

    public void setRecordURL(String recordUrl) {
        this.recordUrl = recordUrl == null ? null : recordUrl.trim();
    }

    public String getOwnerAcc() {
        return ownerAcc;
    }

    public void setOwnerAcc(String ownerAcc) {
        this.ownerAcc = ownerAcc == null ? null : ownerAcc.trim();
    }

    public String getCommunicationNO() {
        return communicationNo;
    }

    public void setCommunicationNO(String communicationNo) {
        this.communicationNo = communicationNo == null ? null : communicationNo.trim();
    }

    public String getFollowId() {
        return followId;
    }

    public void setFollowId(String followId) {
        this.followId = followId == null ? null : followId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}