package com.huiyingxiao.logData.pojo;

import java.util.Date;

public class ResourceOperateLog {
    private Integer id;

    private String batchId;

    private String orgId;

    private String userAcc;

    private String userName;

    private String ownerAcc;

    private String moduleId;

    private String moduleName;

    private String operateId;

    private String operateName;

    private String resOperateId;

    private String resOperateName;

    private Integer operateNum;

    private String content;

    private Date createData;

    private String data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(String userAcc) {
        this.userAcc = userAcc == null ? null : userAcc.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getOwnerAcc() {
        return ownerAcc;
    }

    public void setOwnerAcc(String ownerAcc) {
        this.ownerAcc = ownerAcc == null ? null : ownerAcc.trim();
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getOperateId() {
        return operateId;
    }

    public void setOperateId(String operateId) {
        this.operateId = operateId == null ? null : operateId.trim();
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName == null ? null : operateName.trim();
    }

    public String getResOperateId() {
        return resOperateId;
    }

    public void setResOperateId(String resOperateId) {
        this.resOperateId = resOperateId == null ? null : resOperateId.trim();
    }

    public String getResOperateName() {
        return resOperateName;
    }

    public void setResOperateName(String resOperateName) {
        this.resOperateName = resOperateName == null ? null : resOperateName.trim();
    }

    public Integer getOperateNum() {
        return operateNum;
    }

    public void setOperateNum(Integer operateNum) {
        this.operateNum = operateNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateData() {
        return createData;
    }

    public void setCreateData(Date createData) {
        this.createData = createData;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}