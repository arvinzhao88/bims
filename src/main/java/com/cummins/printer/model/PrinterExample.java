package com.cummins.printer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrinterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PrinterExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(Integer value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(Integer value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(Integer value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(Integer value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<Integer> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<Integer> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonAccountIsNull() {
            addCriterion("person_account is null");
            return (Criteria) this;
        }

        public Criteria andPersonAccountIsNotNull() {
            addCriterion("person_account is not null");
            return (Criteria) this;
        }

        public Criteria andPersonAccountEqualTo(String value) {
            addCriterion("person_account =", value, "personAccount");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNotEqualTo(String value) {
            addCriterion("person_account <>", value, "personAccount");
            return (Criteria) this;
        }

        public Criteria andPersonAccountGreaterThan(String value) {
            addCriterion("person_account >", value, "personAccount");
            return (Criteria) this;
        }

        public Criteria andPersonAccountGreaterThanOrEqualTo(String value) {
            addCriterion("person_account >=", value, "personAccount");
            return (Criteria) this;
        }

        public Criteria andPersonAccountLessThan(String value) {
            addCriterion("person_account <", value, "personAccount");
            return (Criteria) this;
        }

        public Criteria andPersonAccountLessThanOrEqualTo(String value) {
            addCriterion("person_account <=", value, "personAccount");
            return (Criteria) this;
        }

        public Criteria andPersonAccountLike(String value) {
            addCriterion("person_account like", value, "personAccount");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNotLike(String value) {
            addCriterion("person_account not like", value, "personAccount");
            return (Criteria) this;
        }

        public Criteria andPersonAccountIn(List<String> values) {
            addCriterion("person_account in", values, "personAccount");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNotIn(List<String> values) {
            addCriterion("person_account not in", values, "personAccount");
            return (Criteria) this;
        }

        public Criteria andPersonAccountBetween(String value1, String value2) {
            addCriterion("person_account between", value1, value2, "personAccount");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNotBetween(String value1, String value2) {
            addCriterion("person_account not between", value1, value2, "personAccount");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPrinterIpIsNull() {
            addCriterion("printer_ip is null");
            return (Criteria) this;
        }

        public Criteria andPrinterIpIsNotNull() {
            addCriterion("printer_ip is not null");
            return (Criteria) this;
        }

        public Criteria andPrinterIpEqualTo(String value) {
            addCriterion("printer_ip =", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpNotEqualTo(String value) {
            addCriterion("printer_ip <>", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpGreaterThan(String value) {
            addCriterion("printer_ip >", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpGreaterThanOrEqualTo(String value) {
            addCriterion("printer_ip >=", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpLessThan(String value) {
            addCriterion("printer_ip <", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpLessThanOrEqualTo(String value) {
            addCriterion("printer_ip <=", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpLike(String value) {
            addCriterion("printer_ip like", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpNotLike(String value) {
            addCriterion("printer_ip not like", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpIn(List<String> values) {
            addCriterion("printer_ip in", values, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpNotIn(List<String> values) {
            addCriterion("printer_ip not in", values, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpBetween(String value1, String value2) {
            addCriterion("printer_ip between", value1, value2, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpNotBetween(String value1, String value2) {
            addCriterion("printer_ip not between", value1, value2, "printerIp");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdIsNull() {
            addCriterion("create_person_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdIsNotNull() {
            addCriterion("create_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdEqualTo(Integer value) {
            addCriterion("create_person_id =", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdNotEqualTo(Integer value) {
            addCriterion("create_person_id <>", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdGreaterThan(Integer value) {
            addCriterion("create_person_id >", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_person_id >=", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdLessThan(Integer value) {
            addCriterion("create_person_id <", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_person_id <=", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdIn(List<Integer> values) {
            addCriterion("create_person_id in", values, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdNotIn(List<Integer> values) {
            addCriterion("create_person_id not in", values, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdBetween(Integer value1, Integer value2) {
            addCriterion("create_person_id between", value1, value2, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_person_id not between", value1, value2, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountIsNull() {
            addCriterion("create_person_account is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountIsNotNull() {
            addCriterion("create_person_account is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountEqualTo(String value) {
            addCriterion("create_person_account =", value, "createPersonAccount");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountNotEqualTo(String value) {
            addCriterion("create_person_account <>", value, "createPersonAccount");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountGreaterThan(String value) {
            addCriterion("create_person_account >", value, "createPersonAccount");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountGreaterThanOrEqualTo(String value) {
            addCriterion("create_person_account >=", value, "createPersonAccount");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountLessThan(String value) {
            addCriterion("create_person_account <", value, "createPersonAccount");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountLessThanOrEqualTo(String value) {
            addCriterion("create_person_account <=", value, "createPersonAccount");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountLike(String value) {
            addCriterion("create_person_account like", value, "createPersonAccount");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountNotLike(String value) {
            addCriterion("create_person_account not like", value, "createPersonAccount");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountIn(List<String> values) {
            addCriterion("create_person_account in", values, "createPersonAccount");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountNotIn(List<String> values) {
            addCriterion("create_person_account not in", values, "createPersonAccount");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountBetween(String value1, String value2) {
            addCriterion("create_person_account between", value1, value2, "createPersonAccount");
            return (Criteria) this;
        }

        public Criteria andCreatePersonAccountNotBetween(String value1, String value2) {
            addCriterion("create_person_account not between", value1, value2, "createPersonAccount");
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

        public Criteria andModifyPersonIdIsNull() {
            addCriterion("modify_person_id is null");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIdIsNotNull() {
            addCriterion("modify_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIdEqualTo(Integer value) {
            addCriterion("modify_person_id =", value, "modifyPersonId");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIdNotEqualTo(Integer value) {
            addCriterion("modify_person_id <>", value, "modifyPersonId");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIdGreaterThan(Integer value) {
            addCriterion("modify_person_id >", value, "modifyPersonId");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("modify_person_id >=", value, "modifyPersonId");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIdLessThan(Integer value) {
            addCriterion("modify_person_id <", value, "modifyPersonId");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("modify_person_id <=", value, "modifyPersonId");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIdIn(List<Integer> values) {
            addCriterion("modify_person_id in", values, "modifyPersonId");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIdNotIn(List<Integer> values) {
            addCriterion("modify_person_id not in", values, "modifyPersonId");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("modify_person_id between", value1, value2, "modifyPersonId");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("modify_person_id not between", value1, value2, "modifyPersonId");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountIsNull() {
            addCriterion("modify_person_account is null");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountIsNotNull() {
            addCriterion("modify_person_account is not null");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountEqualTo(String value) {
            addCriterion("modify_person_account =", value, "modifyPersonAccount");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountNotEqualTo(String value) {
            addCriterion("modify_person_account <>", value, "modifyPersonAccount");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountGreaterThan(String value) {
            addCriterion("modify_person_account >", value, "modifyPersonAccount");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountGreaterThanOrEqualTo(String value) {
            addCriterion("modify_person_account >=", value, "modifyPersonAccount");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountLessThan(String value) {
            addCriterion("modify_person_account <", value, "modifyPersonAccount");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountLessThanOrEqualTo(String value) {
            addCriterion("modify_person_account <=", value, "modifyPersonAccount");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountLike(String value) {
            addCriterion("modify_person_account like", value, "modifyPersonAccount");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountNotLike(String value) {
            addCriterion("modify_person_account not like", value, "modifyPersonAccount");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountIn(List<String> values) {
            addCriterion("modify_person_account in", values, "modifyPersonAccount");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountNotIn(List<String> values) {
            addCriterion("modify_person_account not in", values, "modifyPersonAccount");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountBetween(String value1, String value2) {
            addCriterion("modify_person_account between", value1, value2, "modifyPersonAccount");
            return (Criteria) this;
        }

        public Criteria andModifyPersonAccountNotBetween(String value1, String value2) {
            addCriterion("modify_person_account not between", value1, value2, "modifyPersonAccount");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

    /**
     */
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