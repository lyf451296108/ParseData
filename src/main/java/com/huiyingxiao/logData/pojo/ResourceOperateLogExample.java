package com.huiyingxiao.logData.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceOperateLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceOperateLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(String value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(String value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(String value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(String value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(String value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLike(String value) {
            addCriterion("batch_id like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotLike(String value) {
            addCriterion("batch_id not like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<String> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<String> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(String value1, String value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(String value1, String value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andUserAccIsNull() {
            addCriterion("user_acc is null");
            return (Criteria) this;
        }

        public Criteria andUserAccIsNotNull() {
            addCriterion("user_acc is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccEqualTo(String value) {
            addCriterion("user_acc =", value, "userAcc");
            return (Criteria) this;
        }

        public Criteria andUserAccNotEqualTo(String value) {
            addCriterion("user_acc <>", value, "userAcc");
            return (Criteria) this;
        }

        public Criteria andUserAccGreaterThan(String value) {
            addCriterion("user_acc >", value, "userAcc");
            return (Criteria) this;
        }

        public Criteria andUserAccGreaterThanOrEqualTo(String value) {
            addCriterion("user_acc >=", value, "userAcc");
            return (Criteria) this;
        }

        public Criteria andUserAccLessThan(String value) {
            addCriterion("user_acc <", value, "userAcc");
            return (Criteria) this;
        }

        public Criteria andUserAccLessThanOrEqualTo(String value) {
            addCriterion("user_acc <=", value, "userAcc");
            return (Criteria) this;
        }

        public Criteria andUserAccLike(String value) {
            addCriterion("user_acc like", value, "userAcc");
            return (Criteria) this;
        }

        public Criteria andUserAccNotLike(String value) {
            addCriterion("user_acc not like", value, "userAcc");
            return (Criteria) this;
        }

        public Criteria andUserAccIn(List<String> values) {
            addCriterion("user_acc in", values, "userAcc");
            return (Criteria) this;
        }

        public Criteria andUserAccNotIn(List<String> values) {
            addCriterion("user_acc not in", values, "userAcc");
            return (Criteria) this;
        }

        public Criteria andUserAccBetween(String value1, String value2) {
            addCriterion("user_acc between", value1, value2, "userAcc");
            return (Criteria) this;
        }

        public Criteria andUserAccNotBetween(String value1, String value2) {
            addCriterion("user_acc not between", value1, value2, "userAcc");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andOwnerAccIsNull() {
            addCriterion("owner_acc is null");
            return (Criteria) this;
        }

        public Criteria andOwnerAccIsNotNull() {
            addCriterion("owner_acc is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerAccEqualTo(String value) {
            addCriterion("owner_acc =", value, "ownerAcc");
            return (Criteria) this;
        }

        public Criteria andOwnerAccNotEqualTo(String value) {
            addCriterion("owner_acc <>", value, "ownerAcc");
            return (Criteria) this;
        }

        public Criteria andOwnerAccGreaterThan(String value) {
            addCriterion("owner_acc >", value, "ownerAcc");
            return (Criteria) this;
        }

        public Criteria andOwnerAccGreaterThanOrEqualTo(String value) {
            addCriterion("owner_acc >=", value, "ownerAcc");
            return (Criteria) this;
        }

        public Criteria andOwnerAccLessThan(String value) {
            addCriterion("owner_acc <", value, "ownerAcc");
            return (Criteria) this;
        }

        public Criteria andOwnerAccLessThanOrEqualTo(String value) {
            addCriterion("owner_acc <=", value, "ownerAcc");
            return (Criteria) this;
        }

        public Criteria andOwnerAccLike(String value) {
            addCriterion("owner_acc like", value, "ownerAcc");
            return (Criteria) this;
        }

        public Criteria andOwnerAccNotLike(String value) {
            addCriterion("owner_acc not like", value, "ownerAcc");
            return (Criteria) this;
        }

        public Criteria andOwnerAccIn(List<String> values) {
            addCriterion("owner_acc in", values, "ownerAcc");
            return (Criteria) this;
        }

        public Criteria andOwnerAccNotIn(List<String> values) {
            addCriterion("owner_acc not in", values, "ownerAcc");
            return (Criteria) this;
        }

        public Criteria andOwnerAccBetween(String value1, String value2) {
            addCriterion("owner_acc between", value1, value2, "ownerAcc");
            return (Criteria) this;
        }

        public Criteria andOwnerAccNotBetween(String value1, String value2) {
            addCriterion("owner_acc not between", value1, value2, "ownerAcc");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(String value) {
            addCriterion("module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(String value) {
            addCriterion("module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(String value) {
            addCriterion("module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(String value) {
            addCriterion("module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(String value) {
            addCriterion("module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLike(String value) {
            addCriterion("module_id like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotLike(String value) {
            addCriterion("module_id not like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<String> values) {
            addCriterion("module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<String> values) {
            addCriterion("module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(String value1, String value2) {
            addCriterion("module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(String value1, String value2) {
            addCriterion("module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("module_name =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("module_name >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("module_name <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("module_name like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("module_name not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("module_name in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("module_name not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andOperateIdIsNull() {
            addCriterion("operate_id is null");
            return (Criteria) this;
        }

        public Criteria andOperateIdIsNotNull() {
            addCriterion("operate_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperateIdEqualTo(String value) {
            addCriterion("operate_id =", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdNotEqualTo(String value) {
            addCriterion("operate_id <>", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdGreaterThan(String value) {
            addCriterion("operate_id >", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdGreaterThanOrEqualTo(String value) {
            addCriterion("operate_id >=", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdLessThan(String value) {
            addCriterion("operate_id <", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdLessThanOrEqualTo(String value) {
            addCriterion("operate_id <=", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdLike(String value) {
            addCriterion("operate_id like", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdNotLike(String value) {
            addCriterion("operate_id not like", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdIn(List<String> values) {
            addCriterion("operate_id in", values, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdNotIn(List<String> values) {
            addCriterion("operate_id not in", values, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdBetween(String value1, String value2) {
            addCriterion("operate_id between", value1, value2, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdNotBetween(String value1, String value2) {
            addCriterion("operate_id not between", value1, value2, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateNameIsNull() {
            addCriterion("operate_name is null");
            return (Criteria) this;
        }

        public Criteria andOperateNameIsNotNull() {
            addCriterion("operate_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperateNameEqualTo(String value) {
            addCriterion("operate_name =", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameNotEqualTo(String value) {
            addCriterion("operate_name <>", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameGreaterThan(String value) {
            addCriterion("operate_name >", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameGreaterThanOrEqualTo(String value) {
            addCriterion("operate_name >=", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameLessThan(String value) {
            addCriterion("operate_name <", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameLessThanOrEqualTo(String value) {
            addCriterion("operate_name <=", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameLike(String value) {
            addCriterion("operate_name like", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameNotLike(String value) {
            addCriterion("operate_name not like", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameIn(List<String> values) {
            addCriterion("operate_name in", values, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameNotIn(List<String> values) {
            addCriterion("operate_name not in", values, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameBetween(String value1, String value2) {
            addCriterion("operate_name between", value1, value2, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameNotBetween(String value1, String value2) {
            addCriterion("operate_name not between", value1, value2, "operateName");
            return (Criteria) this;
        }

        public Criteria andResOperateIdIsNull() {
            addCriterion("res_operate_id is null");
            return (Criteria) this;
        }

        public Criteria andResOperateIdIsNotNull() {
            addCriterion("res_operate_id is not null");
            return (Criteria) this;
        }

        public Criteria andResOperateIdEqualTo(String value) {
            addCriterion("res_operate_id =", value, "resOperateId");
            return (Criteria) this;
        }

        public Criteria andResOperateIdNotEqualTo(String value) {
            addCriterion("res_operate_id <>", value, "resOperateId");
            return (Criteria) this;
        }

        public Criteria andResOperateIdGreaterThan(String value) {
            addCriterion("res_operate_id >", value, "resOperateId");
            return (Criteria) this;
        }

        public Criteria andResOperateIdGreaterThanOrEqualTo(String value) {
            addCriterion("res_operate_id >=", value, "resOperateId");
            return (Criteria) this;
        }

        public Criteria andResOperateIdLessThan(String value) {
            addCriterion("res_operate_id <", value, "resOperateId");
            return (Criteria) this;
        }

        public Criteria andResOperateIdLessThanOrEqualTo(String value) {
            addCriterion("res_operate_id <=", value, "resOperateId");
            return (Criteria) this;
        }

        public Criteria andResOperateIdLike(String value) {
            addCriterion("res_operate_id like", value, "resOperateId");
            return (Criteria) this;
        }

        public Criteria andResOperateIdNotLike(String value) {
            addCriterion("res_operate_id not like", value, "resOperateId");
            return (Criteria) this;
        }

        public Criteria andResOperateIdIn(List<String> values) {
            addCriterion("res_operate_id in", values, "resOperateId");
            return (Criteria) this;
        }

        public Criteria andResOperateIdNotIn(List<String> values) {
            addCriterion("res_operate_id not in", values, "resOperateId");
            return (Criteria) this;
        }

        public Criteria andResOperateIdBetween(String value1, String value2) {
            addCriterion("res_operate_id between", value1, value2, "resOperateId");
            return (Criteria) this;
        }

        public Criteria andResOperateIdNotBetween(String value1, String value2) {
            addCriterion("res_operate_id not between", value1, value2, "resOperateId");
            return (Criteria) this;
        }

        public Criteria andResOperateNameIsNull() {
            addCriterion("res_operate_name is null");
            return (Criteria) this;
        }

        public Criteria andResOperateNameIsNotNull() {
            addCriterion("res_operate_name is not null");
            return (Criteria) this;
        }

        public Criteria andResOperateNameEqualTo(String value) {
            addCriterion("res_operate_name =", value, "resOperateName");
            return (Criteria) this;
        }

        public Criteria andResOperateNameNotEqualTo(String value) {
            addCriterion("res_operate_name <>", value, "resOperateName");
            return (Criteria) this;
        }

        public Criteria andResOperateNameGreaterThan(String value) {
            addCriterion("res_operate_name >", value, "resOperateName");
            return (Criteria) this;
        }

        public Criteria andResOperateNameGreaterThanOrEqualTo(String value) {
            addCriterion("res_operate_name >=", value, "resOperateName");
            return (Criteria) this;
        }

        public Criteria andResOperateNameLessThan(String value) {
            addCriterion("res_operate_name <", value, "resOperateName");
            return (Criteria) this;
        }

        public Criteria andResOperateNameLessThanOrEqualTo(String value) {
            addCriterion("res_operate_name <=", value, "resOperateName");
            return (Criteria) this;
        }

        public Criteria andResOperateNameLike(String value) {
            addCriterion("res_operate_name like", value, "resOperateName");
            return (Criteria) this;
        }

        public Criteria andResOperateNameNotLike(String value) {
            addCriterion("res_operate_name not like", value, "resOperateName");
            return (Criteria) this;
        }

        public Criteria andResOperateNameIn(List<String> values) {
            addCriterion("res_operate_name in", values, "resOperateName");
            return (Criteria) this;
        }

        public Criteria andResOperateNameNotIn(List<String> values) {
            addCriterion("res_operate_name not in", values, "resOperateName");
            return (Criteria) this;
        }

        public Criteria andResOperateNameBetween(String value1, String value2) {
            addCriterion("res_operate_name between", value1, value2, "resOperateName");
            return (Criteria) this;
        }

        public Criteria andResOperateNameNotBetween(String value1, String value2) {
            addCriterion("res_operate_name not between", value1, value2, "resOperateName");
            return (Criteria) this;
        }

        public Criteria andOperateNumIsNull() {
            addCriterion("operate_num is null");
            return (Criteria) this;
        }

        public Criteria andOperateNumIsNotNull() {
            addCriterion("operate_num is not null");
            return (Criteria) this;
        }

        public Criteria andOperateNumEqualTo(Integer value) {
            addCriterion("operate_num =", value, "operateNum");
            return (Criteria) this;
        }

        public Criteria andOperateNumNotEqualTo(Integer value) {
            addCriterion("operate_num <>", value, "operateNum");
            return (Criteria) this;
        }

        public Criteria andOperateNumGreaterThan(Integer value) {
            addCriterion("operate_num >", value, "operateNum");
            return (Criteria) this;
        }

        public Criteria andOperateNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("operate_num >=", value, "operateNum");
            return (Criteria) this;
        }

        public Criteria andOperateNumLessThan(Integer value) {
            addCriterion("operate_num <", value, "operateNum");
            return (Criteria) this;
        }

        public Criteria andOperateNumLessThanOrEqualTo(Integer value) {
            addCriterion("operate_num <=", value, "operateNum");
            return (Criteria) this;
        }

        public Criteria andOperateNumIn(List<Integer> values) {
            addCriterion("operate_num in", values, "operateNum");
            return (Criteria) this;
        }

        public Criteria andOperateNumNotIn(List<Integer> values) {
            addCriterion("operate_num not in", values, "operateNum");
            return (Criteria) this;
        }

        public Criteria andOperateNumBetween(Integer value1, Integer value2) {
            addCriterion("operate_num between", value1, value2, "operateNum");
            return (Criteria) this;
        }

        public Criteria andOperateNumNotBetween(Integer value1, Integer value2) {
            addCriterion("operate_num not between", value1, value2, "operateNum");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCreateDataIsNull() {
            addCriterion("create_data is null");
            return (Criteria) this;
        }

        public Criteria andCreateDataIsNotNull() {
            addCriterion("create_data is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDataEqualTo(Date value) {
            addCriterion("create_data =", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataNotEqualTo(Date value) {
            addCriterion("create_data <>", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataGreaterThan(Date value) {
            addCriterion("create_data >", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataGreaterThanOrEqualTo(Date value) {
            addCriterion("create_data >=", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataLessThan(Date value) {
            addCriterion("create_data <", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataLessThanOrEqualTo(Date value) {
            addCriterion("create_data <=", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataIn(List<Date> values) {
            addCriterion("create_data in", values, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataNotIn(List<Date> values) {
            addCriterion("create_data not in", values, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataBetween(Date value1, Date value2) {
            addCriterion("create_data between", value1, value2, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataNotBetween(Date value1, Date value2) {
            addCriterion("create_data not between", value1, value2, "createData");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}