package com.cummins.bims.dto;

import java.util.ArrayList;
import java.util.List;

public class BillManageCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillManageCriteria() {
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

        public Criteria andIssueIdEqualTo(String value) {
            addCriterion("issue_id =", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotEqualTo(String value) {
            addCriterion("issue_id <>", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThan(String value) {
            addCriterion("issue_id >", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThanOrEqualTo(String value) {
            addCriterion("issue_id >=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThan(String value) {
            addCriterion("issue_id <", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThanOrEqualTo(String value) {
            addCriterion("issue_id <=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLike(String value) {
            addCriterion("issue_id like", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotLike(String value) {
            addCriterion("issue_id not like", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdIn(List<String> values) {
            addCriterion("issue_id in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotIn(List<String> values) {
            addCriterion("issue_id not in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdBetween(String value1, String value2) {
            addCriterion("issue_id between", value1, value2, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotBetween(String value1, String value2) {
            addCriterion("issue_id not between", value1, value2, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueAreaIsNull() {
            addCriterion("issue_area is null");
            return (Criteria) this;
        }

        public Criteria andIssueAreaIsNotNull() {
            addCriterion("issue_area is not null");
            return (Criteria) this;
        }

        public Criteria andIssueAreaEqualTo(String value) {
            addCriterion("issue_area =", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaNotEqualTo(String value) {
            addCriterion("issue_area <>", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaGreaterThan(String value) {
            addCriterion("issue_area >", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaGreaterThanOrEqualTo(String value) {
            addCriterion("issue_area >=", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaLessThan(String value) {
            addCriterion("issue_area <", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaLessThanOrEqualTo(String value) {
            addCriterion("issue_area <=", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaLike(String value) {
            addCriterion("issue_area like", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaNotLike(String value) {
            addCriterion("issue_area not like", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaIn(List<String> values) {
            addCriterion("issue_area in", values, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaNotIn(List<String> values) {
            addCriterion("issue_area not in", values, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaBetween(String value1, String value2) {
            addCriterion("issue_area between", value1, value2, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaNotBetween(String value1, String value2) {
            addCriterion("issue_area not between", value1, value2, "issueArea");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresIsNull() {
            addCriterion("temp_measures is null");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresIsNotNull() {
            addCriterion("temp_measures is not null");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresEqualTo(String value) {
            addCriterion("temp_measures =", value, "tempMeasures");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresNotEqualTo(String value) {
            addCriterion("temp_measures <>", value, "tempMeasures");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresGreaterThan(String value) {
            addCriterion("temp_measures >", value, "tempMeasures");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresGreaterThanOrEqualTo(String value) {
            addCriterion("temp_measures >=", value, "tempMeasures");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresLessThan(String value) {
            addCriterion("temp_measures <", value, "tempMeasures");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresLessThanOrEqualTo(String value) {
            addCriterion("temp_measures <=", value, "tempMeasures");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresLike(String value) {
            addCriterion("temp_measures like", value, "tempMeasures");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresNotLike(String value) {
            addCriterion("temp_measures not like", value, "tempMeasures");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresIn(List<String> values) {
            addCriterion("temp_measures in", values, "tempMeasures");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresNotIn(List<String> values) {
            addCriterion("temp_measures not in", values, "tempMeasures");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresBetween(String value1, String value2) {
            addCriterion("temp_measures between", value1, value2, "tempMeasures");
            return (Criteria) this;
        }

        public Criteria andTempMeasuresNotBetween(String value1, String value2) {
            addCriterion("temp_measures not between", value1, value2, "tempMeasures");
            return (Criteria) this;
        }

        public Criteria andBillNameIsNull() {
            addCriterion("bill_name is null");
            return (Criteria) this;
        }

        public Criteria andBillNameIsNotNull() {
            addCriterion("bill_name is not null");
            return (Criteria) this;
        }

        public Criteria andBillNameEqualTo(String value) {
            addCriterion("bill_name =", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameNotEqualTo(String value) {
            addCriterion("bill_name <>", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameGreaterThan(String value) {
            addCriterion("bill_name >", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameGreaterThanOrEqualTo(String value) {
            addCriterion("bill_name >=", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameLessThan(String value) {
            addCriterion("bill_name <", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameLessThanOrEqualTo(String value) {
            addCriterion("bill_name <=", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameLike(String value) {
            addCriterion("bill_name like", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameNotLike(String value) {
            addCriterion("bill_name not like", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameIn(List<String> values) {
            addCriterion("bill_name in", values, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameNotIn(List<String> values) {
            addCriterion("bill_name not in", values, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameBetween(String value1, String value2) {
            addCriterion("bill_name between", value1, value2, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameNotBetween(String value1, String value2) {
            addCriterion("bill_name not between", value1, value2, "billName");
            return (Criteria) this;
        }

        public Criteria andDutyPersonIsNull() {
            addCriterion("duty_person is null");
            return (Criteria) this;
        }

        public Criteria andDutyPersonIsNotNull() {
            addCriterion("duty_person is not null");
            return (Criteria) this;
        }

        public Criteria andDutyPersonEqualTo(String value) {
            addCriterion("duty_person =", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNotEqualTo(String value) {
            addCriterion("duty_person <>", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonGreaterThan(String value) {
            addCriterion("duty_person >", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonGreaterThanOrEqualTo(String value) {
            addCriterion("duty_person >=", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonLessThan(String value) {
            addCriterion("duty_person <", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonLessThanOrEqualTo(String value) {
            addCriterion("duty_person <=", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonLike(String value) {
            addCriterion("duty_person like", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNotLike(String value) {
            addCriterion("duty_person not like", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonIn(List<String> values) {
            addCriterion("duty_person in", values, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNotIn(List<String> values) {
            addCriterion("duty_person not in", values, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonBetween(String value1, String value2) {
            addCriterion("duty_person between", value1, value2, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNotBetween(String value1, String value2) {
            addCriterion("duty_person not between", value1, value2, "dutyPerson");
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