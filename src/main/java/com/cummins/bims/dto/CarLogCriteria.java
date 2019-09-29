package com.cummins.bims.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarLogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarLogCriteria() {
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNull() {
            addCriterion("process_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNotNull() {
            addCriterion("process_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeEqualTo(Date value) {
            addCriterion("process_time =", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotEqualTo(Date value) {
            addCriterion("process_time <>", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThan(Date value) {
            addCriterion("process_time >", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("process_time >=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThan(Date value) {
            addCriterion("process_time <", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThanOrEqualTo(Date value) {
            addCriterion("process_time <=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIn(List<Date> values) {
            addCriterion("process_time in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotIn(List<Date> values) {
            addCriterion("process_time not in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeBetween(Date value1, Date value2) {
            addCriterion("process_time between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotBetween(Date value1, Date value2) {
            addCriterion("process_time not between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIsNull() {
            addCriterion("process_person is null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIsNotNull() {
            addCriterion("process_person is not null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonEqualTo(String value) {
            addCriterion("process_person =", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNotEqualTo(String value) {
            addCriterion("process_person <>", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonGreaterThan(String value) {
            addCriterion("process_person >", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonGreaterThanOrEqualTo(String value) {
            addCriterion("process_person >=", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonLessThan(String value) {
            addCriterion("process_person <", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonLessThanOrEqualTo(String value) {
            addCriterion("process_person <=", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonLike(String value) {
            addCriterion("process_person like", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNotLike(String value) {
            addCriterion("process_person not like", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIn(List<String> values) {
            addCriterion("process_person in", values, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNotIn(List<String> values) {
            addCriterion("process_person not in", values, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonBetween(String value1, String value2) {
            addCriterion("process_person between", value1, value2, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNotBetween(String value1, String value2) {
            addCriterion("process_person not between", value1, value2, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountIsNull() {
            addCriterion("process_person_account is null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountIsNotNull() {
            addCriterion("process_person_account is not null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountEqualTo(String value) {
            addCriterion("process_person_account =", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountNotEqualTo(String value) {
            addCriterion("process_person_account <>", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountGreaterThan(String value) {
            addCriterion("process_person_account >", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountGreaterThanOrEqualTo(String value) {
            addCriterion("process_person_account >=", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountLessThan(String value) {
            addCriterion("process_person_account <", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountLessThanOrEqualTo(String value) {
            addCriterion("process_person_account <=", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountLike(String value) {
            addCriterion("process_person_account like", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountNotLike(String value) {
            addCriterion("process_person_account not like", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountIn(List<String> values) {
            addCriterion("process_person_account in", values, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountNotIn(List<String> values) {
            addCriterion("process_person_account not in", values, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountBetween(String value1, String value2) {
            addCriterion("process_person_account between", value1, value2, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountNotBetween(String value1, String value2) {
            addCriterion("process_person_account not between", value1, value2, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdIsNull() {
            addCriterion("process_person_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdIsNotNull() {
            addCriterion("process_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdEqualTo(String value) {
            addCriterion("process_person_id =", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdNotEqualTo(String value) {
            addCriterion("process_person_id <>", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdGreaterThan(String value) {
            addCriterion("process_person_id >", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_person_id >=", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdLessThan(String value) {
            addCriterion("process_person_id <", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdLessThanOrEqualTo(String value) {
            addCriterion("process_person_id <=", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdLike(String value) {
            addCriterion("process_person_id like", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdNotLike(String value) {
            addCriterion("process_person_id not like", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdIn(List<String> values) {
            addCriterion("process_person_id in", values, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdNotIn(List<String> values) {
            addCriterion("process_person_id not in", values, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdBetween(String value1, String value2) {
            addCriterion("process_person_id between", value1, value2, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdNotBetween(String value1, String value2) {
            addCriterion("process_person_id not between", value1, value2, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("action is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(Integer value) {
            addCriterion("action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(Integer value) {
            addCriterion("action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(Integer value) {
            addCriterion("action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(Integer value) {
            addCriterion("action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(Integer value) {
            addCriterion("action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(Integer value) {
            addCriterion("action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<Integer> values) {
            addCriterion("action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<Integer> values) {
            addCriterion("action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(Integer value1, Integer value2) {
            addCriterion("action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(Integer value1, Integer value2) {
            addCriterion("action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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