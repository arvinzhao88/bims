package com.cummins.pad.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoldTagLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HoldTagLogExample() {
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

        public Criteria andIssueIdIsNull() {
            addCriterion("issue_id is null");
            return (Criteria) this;
        }

        public Criteria andIssueIdIsNotNull() {
            addCriterion("issue_id is not null");
            return (Criteria) this;
        }

        public Criteria andIssueIdEqualTo(Integer value) {
            addCriterion("issue_id =", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotEqualTo(Integer value) {
            addCriterion("issue_id <>", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThan(Integer value) {
            addCriterion("issue_id >", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("issue_id >=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThan(Integer value) {
            addCriterion("issue_id <", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThanOrEqualTo(Integer value) {
            addCriterion("issue_id <=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdIn(List<Integer> values) {
            addCriterion("issue_id in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotIn(List<Integer> values) {
            addCriterion("issue_id not in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdBetween(Integer value1, Integer value2) {
            addCriterion("issue_id between", value1, value2, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("issue_id not between", value1, value2, "issueId");
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

        public Criteria andPrintContentIsNull() {
            addCriterion("print_content is null");
            return (Criteria) this;
        }

        public Criteria andPrintContentIsNotNull() {
            addCriterion("print_content is not null");
            return (Criteria) this;
        }

        public Criteria andPrintContentEqualTo(String value) {
            addCriterion("print_content =", value, "printContent");
            return (Criteria) this;
        }

        public Criteria andPrintContentNotEqualTo(String value) {
            addCriterion("print_content <>", value, "printContent");
            return (Criteria) this;
        }

        public Criteria andPrintContentGreaterThan(String value) {
            addCriterion("print_content >", value, "printContent");
            return (Criteria) this;
        }

        public Criteria andPrintContentGreaterThanOrEqualTo(String value) {
            addCriterion("print_content >=", value, "printContent");
            return (Criteria) this;
        }

        public Criteria andPrintContentLessThan(String value) {
            addCriterion("print_content <", value, "printContent");
            return (Criteria) this;
        }

        public Criteria andPrintContentLessThanOrEqualTo(String value) {
            addCriterion("print_content <=", value, "printContent");
            return (Criteria) this;
        }

        public Criteria andPrintContentLike(String value) {
            addCriterion("print_content like", value, "printContent");
            return (Criteria) this;
        }

        public Criteria andPrintContentNotLike(String value) {
            addCriterion("print_content not like", value, "printContent");
            return (Criteria) this;
        }

        public Criteria andPrintContentIn(List<String> values) {
            addCriterion("print_content in", values, "printContent");
            return (Criteria) this;
        }

        public Criteria andPrintContentNotIn(List<String> values) {
            addCriterion("print_content not in", values, "printContent");
            return (Criteria) this;
        }

        public Criteria andPrintContentBetween(String value1, String value2) {
            addCriterion("print_content between", value1, value2, "printContent");
            return (Criteria) this;
        }

        public Criteria andPrintContentNotBetween(String value1, String value2) {
            addCriterion("print_content not between", value1, value2, "printContent");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIsNull() {
            addCriterion("print_time is null");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIsNotNull() {
            addCriterion("print_time is not null");
            return (Criteria) this;
        }

        public Criteria andPrintTimeEqualTo(Date value) {
            addCriterion("print_time =", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotEqualTo(Date value) {
            addCriterion("print_time <>", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeGreaterThan(Date value) {
            addCriterion("print_time >", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("print_time >=", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeLessThan(Date value) {
            addCriterion("print_time <", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeLessThanOrEqualTo(Date value) {
            addCriterion("print_time <=", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIn(List<Date> values) {
            addCriterion("print_time in", values, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotIn(List<Date> values) {
            addCriterion("print_time not in", values, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeBetween(Date value1, Date value2) {
            addCriterion("print_time between", value1, value2, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotBetween(Date value1, Date value2) {
            addCriterion("print_time not between", value1, value2, "printTime");
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