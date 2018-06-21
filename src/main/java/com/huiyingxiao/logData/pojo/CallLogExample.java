package com.huiyingxiao.logData.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CallLogExample() {
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

        public Criteria andCallTypeIsNull() {
            addCriterion("call_type is null");
            return (Criteria) this;
        }

        public Criteria andCallTypeIsNotNull() {
            addCriterion("call_type is not null");
            return (Criteria) this;
        }

        public Criteria andCallTypeEqualTo(String value) {
            addCriterion("call_type =", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotEqualTo(String value) {
            addCriterion("call_type <>", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeGreaterThan(String value) {
            addCriterion("call_type >", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeGreaterThanOrEqualTo(String value) {
            addCriterion("call_type >=", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeLessThan(String value) {
            addCriterion("call_type <", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeLessThanOrEqualTo(String value) {
            addCriterion("call_type <=", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeLike(String value) {
            addCriterion("call_type like", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotLike(String value) {
            addCriterion("call_type not like", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeIn(List<String> values) {
            addCriterion("call_type in", values, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotIn(List<String> values) {
            addCriterion("call_type not in", values, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeBetween(String value1, String value2) {
            addCriterion("call_type between", value1, value2, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotBetween(String value1, String value2) {
            addCriterion("call_type not between", value1, value2, "callType");
            return (Criteria) this;
        }

        public Criteria andCallerNumIsNull() {
            addCriterion("caller_num is null");
            return (Criteria) this;
        }

        public Criteria andCallerNumIsNotNull() {
            addCriterion("caller_num is not null");
            return (Criteria) this;
        }

        public Criteria andCallerNumEqualTo(String value) {
            addCriterion("caller_num =", value, "callerNum");
            return (Criteria) this;
        }

        public Criteria andCallerNumNotEqualTo(String value) {
            addCriterion("caller_num <>", value, "callerNum");
            return (Criteria) this;
        }

        public Criteria andCallerNumGreaterThan(String value) {
            addCriterion("caller_num >", value, "callerNum");
            return (Criteria) this;
        }

        public Criteria andCallerNumGreaterThanOrEqualTo(String value) {
            addCriterion("caller_num >=", value, "callerNum");
            return (Criteria) this;
        }

        public Criteria andCallerNumLessThan(String value) {
            addCriterion("caller_num <", value, "callerNum");
            return (Criteria) this;
        }

        public Criteria andCallerNumLessThanOrEqualTo(String value) {
            addCriterion("caller_num <=", value, "callerNum");
            return (Criteria) this;
        }

        public Criteria andCallerNumLike(String value) {
            addCriterion("caller_num like", value, "callerNum");
            return (Criteria) this;
        }

        public Criteria andCallerNumNotLike(String value) {
            addCriterion("caller_num not like", value, "callerNum");
            return (Criteria) this;
        }

        public Criteria andCallerNumIn(List<String> values) {
            addCriterion("caller_num in", values, "callerNum");
            return (Criteria) this;
        }

        public Criteria andCallerNumNotIn(List<String> values) {
            addCriterion("caller_num not in", values, "callerNum");
            return (Criteria) this;
        }

        public Criteria andCallerNumBetween(String value1, String value2) {
            addCriterion("caller_num between", value1, value2, "callerNum");
            return (Criteria) this;
        }

        public Criteria andCallerNumNotBetween(String value1, String value2) {
            addCriterion("caller_num not between", value1, value2, "callerNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumIsNull() {
            addCriterion("called_num is null");
            return (Criteria) this;
        }

        public Criteria andCalledNumIsNotNull() {
            addCriterion("called_num is not null");
            return (Criteria) this;
        }

        public Criteria andCalledNumEqualTo(String value) {
            addCriterion("called_num =", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumNotEqualTo(String value) {
            addCriterion("called_num <>", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumGreaterThan(String value) {
            addCriterion("called_num >", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumGreaterThanOrEqualTo(String value) {
            addCriterion("called_num >=", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumLessThan(String value) {
            addCriterion("called_num <", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumLessThanOrEqualTo(String value) {
            addCriterion("called_num <=", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumLike(String value) {
            addCriterion("called_num like", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumNotLike(String value) {
            addCriterion("called_num not like", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumIn(List<String> values) {
            addCriterion("called_num in", values, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumNotIn(List<String> values) {
            addCriterion("called_num not in", values, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumBetween(String value1, String value2) {
            addCriterion("called_num between", value1, value2, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumNotBetween(String value1, String value2) {
            addCriterion("called_num not between", value1, value2, "calledNum");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andTimeLengthIsNull() {
            addCriterion("time_length is null");
            return (Criteria) this;
        }

        public Criteria andTimeLengthIsNotNull() {
            addCriterion("time_length is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLengthEqualTo(String value) {
            addCriterion("time_length =", value, "timeLength");
            return (Criteria) this;
        }

        public Criteria andTimeLengthNotEqualTo(String value) {
            addCriterion("time_length <>", value, "timeLength");
            return (Criteria) this;
        }

        public Criteria andTimeLengthGreaterThan(String value) {
            addCriterion("time_length >", value, "timeLength");
            return (Criteria) this;
        }

        public Criteria andTimeLengthGreaterThanOrEqualTo(String value) {
            addCriterion("time_length >=", value, "timeLength");
            return (Criteria) this;
        }

        public Criteria andTimeLengthLessThan(String value) {
            addCriterion("time_length <", value, "timeLength");
            return (Criteria) this;
        }

        public Criteria andTimeLengthLessThanOrEqualTo(String value) {
            addCriterion("time_length <=", value, "timeLength");
            return (Criteria) this;
        }

        public Criteria andTimeLengthLike(String value) {
            addCriterion("time_length like", value, "timeLength");
            return (Criteria) this;
        }

        public Criteria andTimeLengthNotLike(String value) {
            addCriterion("time_length not like", value, "timeLength");
            return (Criteria) this;
        }

        public Criteria andTimeLengthIn(List<String> values) {
            addCriterion("time_length in", values, "timeLength");
            return (Criteria) this;
        }

        public Criteria andTimeLengthNotIn(List<String> values) {
            addCriterion("time_length not in", values, "timeLength");
            return (Criteria) this;
        }

        public Criteria andTimeLengthBetween(String value1, String value2) {
            addCriterion("time_length between", value1, value2, "timeLength");
            return (Criteria) this;
        }

        public Criteria andTimeLengthNotBetween(String value1, String value2) {
            addCriterion("time_length not between", value1, value2, "timeLength");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andRecordUrlIsNull() {
            addCriterion("record_url is null");
            return (Criteria) this;
        }

        public Criteria andRecordUrlIsNotNull() {
            addCriterion("record_url is not null");
            return (Criteria) this;
        }

        public Criteria andRecordUrlEqualTo(String value) {
            addCriterion("record_url =", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlNotEqualTo(String value) {
            addCriterion("record_url <>", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlGreaterThan(String value) {
            addCriterion("record_url >", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlGreaterThanOrEqualTo(String value) {
            addCriterion("record_url >=", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlLessThan(String value) {
            addCriterion("record_url <", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlLessThanOrEqualTo(String value) {
            addCriterion("record_url <=", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlLike(String value) {
            addCriterion("record_url like", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlNotLike(String value) {
            addCriterion("record_url not like", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlIn(List<String> values) {
            addCriterion("record_url in", values, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlNotIn(List<String> values) {
            addCriterion("record_url not in", values, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlBetween(String value1, String value2) {
            addCriterion("record_url between", value1, value2, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlNotBetween(String value1, String value2) {
            addCriterion("record_url not between", value1, value2, "recordUrl");
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

        public Criteria andCommunicationNoIsNull() {
            addCriterion("communication_no is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationNoIsNotNull() {
            addCriterion("communication_no is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationNoEqualTo(String value) {
            addCriterion("communication_no =", value, "communicationNo");
            return (Criteria) this;
        }

        public Criteria andCommunicationNoNotEqualTo(String value) {
            addCriterion("communication_no <>", value, "communicationNo");
            return (Criteria) this;
        }

        public Criteria andCommunicationNoGreaterThan(String value) {
            addCriterion("communication_no >", value, "communicationNo");
            return (Criteria) this;
        }

        public Criteria andCommunicationNoGreaterThanOrEqualTo(String value) {
            addCriterion("communication_no >=", value, "communicationNo");
            return (Criteria) this;
        }

        public Criteria andCommunicationNoLessThan(String value) {
            addCriterion("communication_no <", value, "communicationNo");
            return (Criteria) this;
        }

        public Criteria andCommunicationNoLessThanOrEqualTo(String value) {
            addCriterion("communication_no <=", value, "communicationNo");
            return (Criteria) this;
        }

        public Criteria andCommunicationNoLike(String value) {
            addCriterion("communication_no like", value, "communicationNo");
            return (Criteria) this;
        }

        public Criteria andCommunicationNoNotLike(String value) {
            addCriterion("communication_no not like", value, "communicationNo");
            return (Criteria) this;
        }

        public Criteria andCommunicationNoIn(List<String> values) {
            addCriterion("communication_no in", values, "communicationNo");
            return (Criteria) this;
        }

        public Criteria andCommunicationNoNotIn(List<String> values) {
            addCriterion("communication_no not in", values, "communicationNo");
            return (Criteria) this;
        }

        public Criteria andCommunicationNoBetween(String value1, String value2) {
            addCriterion("communication_no between", value1, value2, "communicationNo");
            return (Criteria) this;
        }

        public Criteria andCommunicationNoNotBetween(String value1, String value2) {
            addCriterion("communication_no not between", value1, value2, "communicationNo");
            return (Criteria) this;
        }

        public Criteria andFollowIdIsNull() {
            addCriterion("follow_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowIdIsNotNull() {
            addCriterion("follow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowIdEqualTo(String value) {
            addCriterion("follow_id =", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotEqualTo(String value) {
            addCriterion("follow_id <>", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdGreaterThan(String value) {
            addCriterion("follow_id >", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdGreaterThanOrEqualTo(String value) {
            addCriterion("follow_id >=", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdLessThan(String value) {
            addCriterion("follow_id <", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdLessThanOrEqualTo(String value) {
            addCriterion("follow_id <=", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdLike(String value) {
            addCriterion("follow_id like", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotLike(String value) {
            addCriterion("follow_id not like", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdIn(List<String> values) {
            addCriterion("follow_id in", values, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotIn(List<String> values) {
            addCriterion("follow_id not in", values, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdBetween(String value1, String value2) {
            addCriterion("follow_id between", value1, value2, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotBetween(String value1, String value2) {
            addCriterion("follow_id not between", value1, value2, "followId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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